/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Base;

import HibernateUtility.HibernateUtility;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

/**
 * Classe abstrata e base para todas as classes de acesso ao banco de dado
 * @author rafaellf
 * @param <T> Clasee a ser persistida
 * @version  1.0.0
 */
@Repository
public abstract class BaseDAO<T extends EBase> implements Serializable
{
   
    protected abstract T getInstanceEntidade();
    
    protected final String Q_GET_ALL = "getAll";
    private String className = "";
    
    public boolean salva(T objeto)
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
    
    public boolean salva(Collection<T> objetos)
    {
        boolean retorno = true;
        
        Session sessao = HibernateUtility.getSession(); //Abrindo uma sessão
        Transaction transaction = sessao.beginTransaction();
        try
        {
            int i = 0;
            for(T objeto : objetos)
            {
                
                sessao.saveOrUpdate(objeto);
                transaction.commit(); //Finalizando a transação
                if(i % 5 == 0)
                {
                    sessao.flush();
                    sessao.clear();
                }
                i++;
            }
        }
        catch(HibernateException e)
        {
            transaction.rollback();
            retorno = false;
        }
        finally
        {
            sessao.flush();
            sessao.clear();
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
    
    public T getObjeto(Integer id)
    {
        T retorno = getInstanceEntidade();
        retorno.setSequencial(id);
        Session sessao = HibernateUtility.getSession(); //Abrindo uma sessão
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
        Session sessao = HibernateUtility.getSession();
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
