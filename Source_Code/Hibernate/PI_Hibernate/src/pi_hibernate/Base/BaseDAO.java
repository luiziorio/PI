/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pi_hibernate.Base;

import HibernateUtil.HibernateUtility;
import java.io.Serializable;
import java.util.List;
import java.util.function.Predicate;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author rafaellf
 * @param <T>
 */
public abstract class BaseDAO<T extends EBase>
{
   
    protected abstract T getInstanceEntidade();
    
    public boolean Salva(T objeto)
    {
        boolean retorno = true;
        Session sessao = HibernateUtility.getSession(); //Abrindo uma sessão
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
        Session sessao = HibernateUtility.getSession(); //Abrindo uma sessão
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
        Session sessao = HibernateUtility.getSession(); //Abrindo uma sessão
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
    
    public T getObjeto(int id)
    {
        T retorno = getInstanceEntidade();
        retorno.setSequencial(id);
        Session sessao = HibernateUtility.getSession(); //Abrindo uma sessão
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
