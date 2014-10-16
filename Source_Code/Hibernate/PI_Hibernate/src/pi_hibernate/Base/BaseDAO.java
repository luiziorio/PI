/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pi_hibernate.Base;

import HibernateUtil.HibernateUtility;
import java.util.function.Predicate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author rafaellf
 * @param <T>
 */
public abstract class BaseDAO<T extends EBase>
{
   
    public void Salva(T objeto)
    {
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
        }
        finally
        {
            sessao.close(); //Fechando a sessão
        }
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
    
    public T getSelect(String filtro)
    {
        throw  new UnsupportedOperationException();
    }
    
    public T getObjeto(int id)
    {
        throw  new UnsupportedOperationException();
    }
    
    public T getSelect(Predicate<T> filtro)
    {
        return null;
    }
}
