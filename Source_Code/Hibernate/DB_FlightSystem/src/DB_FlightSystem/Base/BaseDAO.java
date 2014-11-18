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
import Hibernate.GenericoDAO;
import Hibernate.IHibernateUtility;

public abstract class BaseDAO<T extends EBase> extends GenericoDAO<T>
{
    private Object session;
    
    protected abstract T getInstanceEntidade();
    
    protected final String Q_GET_ALL = "getAll";
    private String className = "";
    
    @Override
    protected IHibernateUtility getHibernateInstance()
    {
        return HibernateUtilityController.getInstance().getIHibernateUtility();
    }
    
    protected Session getSession()    
    {
        return HibernateUtilityController.getInstance().getSession();
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
    
    public T getObjeto(Integer id)
    {
        T retorno = getInstanceEntidade();
        retorno.setSequencial(id);
        Session sessao = getSession(); //Abrindo uma sessão
        try
        {
            retorno = (T) sessao.get(retorno.getClass(), id);
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
    
    private String getGetAll()
    {
        return getClassName() + "." + Q_GET_ALL;
    }
    
    private String getClassName()
    {
        if("".equals(className))
            className = getInstanceEntidade().getClass().getName();
        return className;
    }
    
    public List<T> getAll()
    {
        List<T> retorno = null;
        Session sessao = getSession();
        try
        {
            
            Query query = sessao.getNamedQuery(getGetAll());
            retorno = query.list();
            
        }
        catch(Exception e)
        {
        }
        finally
        {
            sessao.close();
        }
        return retorno;
    }
}
