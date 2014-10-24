/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DB_FlightSystem.Base;

import HibernateUtil.HibernateUtilityController;
import java.util.List;
import java.util.function.Predicate;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Classe abstrata e base para todas as classes de acesso ao banco de dado
 * @author rafaellf
 * @param <T> Clasee a ser persistida
 * @version  1.0.0
 */
public abstract class BaseDAO<T extends EBase>
{
   
    protected abstract T getInstanceEntidade();
    
    protected Session getSession()    
    {
        return HibernateUtilityController.getInstance().getSession();
    }
    
    public boolean Salva(T objeto)
    {
        boolean retorno = true;
        Session sessao = getSession(); //Abrindo uma sessão
        Transaction transaction = sessao.beginTransaction();
        try
        {
            sessao.saveOrUpdate(objeto);
            transaction.commit(); //Finalizando a transação
        }
        catch(HibernateException e)
        {
            transaction.rollback();
            retorno = false;
        }
        finally
        {
            sessao.close(); //Fechando a sessão
        }
        return retorno;
    }
    
    public void Delete(T objeto)
    {
        Session sessao = getSession(); //Abrindo uma sessão
        Transaction transaction = sessao.beginTransaction(); //Iniciando uma transação
        
        try
        {
            sessao.delete(objeto);
        }
        
        catch(HibernateException e)
        {
            transaction.rollback();
        }
        finally
        {
            sessao.close(); //Fechando a sessão
        }
    }
    
    public List<T> getSelect(String filtro)
    {
        List<T> retorno = null;
        Session sessao = getSession(); //Abrindo uma sessão
        try
        {
            
            Query query = sessao.createQuery(filtro);
            retorno = query.list();
        }
        catch(Exception e)
        {
            
        }
        finally
        {
            sessao.close();
        }
        return  retorno;
    }
    
    public T getObjeto(Integer id)
    {
        T retorno = getInstanceEntidade();
        retorno.setSequencial(id);
        Session sessao = getSession(); //Abrindo uma sessão
        try
        {
            retorno = (T) sessao.get(retorno.getClass(), retorno);
        }
        catch(Exception e)
        {
            
        }
        finally
        {
            sessao.close();            
        }
        return  retorno;
    }
    
    public T getSelect(Predicate<T> filtro)
    {
        return null;
    }
}
