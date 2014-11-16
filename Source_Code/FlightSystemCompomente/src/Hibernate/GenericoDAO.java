/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hibernate;

import java.util.Collection;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author rafael
 * @param <T>
 * @param <H>
 */
public abstract class GenericoDAO<T>
{
    
    protected abstract IHibernateUtility getHibernateInstance();
    
    public boolean salva(T objeto)
    {
        boolean retorno = true;
        Session sessao = getHibernateInstance().getSession(); //Abrindo uma sessão
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
        
        Session sessao = getHibernateInstance().getSession(); //Abrindo uma sessão
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
}
