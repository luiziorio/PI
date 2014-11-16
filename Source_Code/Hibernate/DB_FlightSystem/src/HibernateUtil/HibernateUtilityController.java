/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HibernateUtil;

import Hibernate.IHibernateUtility;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Session;

/**
 *
 * @author rafael
 */
public class HibernateUtilityController implements ICarregouXML
{
    
    private HibernateUtilityController()
    {
        FSThreadPool.FS_ThreadPool.getInstance().addThread(hibernateSessoThread);
    }
    private static HibernateUtilityController instance;
    public static HibernateUtilityController getInstance()
    {
        if(instance == null)
        {
            instance = new HibernateUtilityController();
            instance.hibernateSessoThread.addOnCarregouXML(instance);
        }
        return instance;
    }
    
    
    private final AtomicReference<HibernateUtility> hibernate = new AtomicReference<>();
    private final HibernateSessoThread hibernateSessoThread = new HibernateSessoThread();

    @Override
    public void onCarregouXML(HibernateUtility hibernate)
    {
        atualiazaHibernateUtility(hibernate);
    }
    
    /**
     * Get uma sessao com o banco
     * @return Session que foi aberta
     */
    public Session getSession()
    {
        if(hibernate.get() == null)
            hibernate.set(new HibernateUtility());
        return hibernate.get().getSession();
    }
    
    public IHibernateUtility getIHibernateUtility()
    {
         if(hibernate.get() == null)
            hibernate.set(new HibernateUtility());
         return hibernate.get();
    }
    
    
    /**
     * Compara e verifica se pode atualizar a classe com as informações do banco
     * @param hibernateUtility informações atuais da conexao com o banco
     */
    private void atualiazaHibernateUtility(HibernateUtility hibernateUtility)
    {
        if(!compara(hibernateUtility))
            hibernate.set(hibernateUtility);
    }
    
    /**
     * Compara as String de conexões
     * @param hibernateUtility HibernateUtility carregado
     * @return TRUE se forem iguais
     */
    private boolean compara(HibernateUtility hibernateUtility)
    {
        boolean retorno = false;
        try
        {
            //retorno = (hibernateUtility.getSession().connection().getMetaData().getURL() == null ? hibernate.get().getSession().connection().getMetaData().getURL() == null : hibernateUtility.getSession().connection().getMetaData().getURL().equals(hibernate.get().getSession().connection().getMetaData().getURL()));
            
        }
        catch (Exception ex)
        {
            Logger.getLogger(HibernateUtilityController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return  retorno;
    }
    
    
}
