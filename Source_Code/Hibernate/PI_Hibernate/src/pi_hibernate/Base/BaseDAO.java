/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pi_hibernate.Base;

import HibernateUtil.HibernateUtility;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Predicate;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author rafaellf
 * @param <T>
 */
public abstract class BaseDAO<T extends EBase>
{

    protected final void iniciaConexaoBanco(AtomicReference<Session> sessao,AtomicReference<Transaction> transaction)
    {
        sessao = (AtomicReference<Session>) HibernateUtility.getSession(); //Abrindo uma sessão
        transaction = (AtomicReference<Transaction>) sessao.get().beginTransaction();
    }
    
    protected final void finalizaSessaoBanco(AtomicReference<Session> sessao,AtomicReference<Transaction> transaction)
    {
        transaction.get().commit(); //Finalizando a transação
        sessao.get().close(); //Fechando a sessão
    }
    
    public void Salva(T objeto)
    {
        AtomicReference<Session> sessao = new AtomicReference<>();
        AtomicReference<Transaction> transaction = new AtomicReference<>();
        
        iniciaConexaoBanco(sessao,transaction);
        
        sessao.get().saveOrUpdate(objeto);
        
        finalizaSessaoBanco(sessao,transaction);
    }
    
    
    public void Delete(T objeto)
    {
        Session sessao = HibernateUtility.getSession(); //Abrindo uma sessão
        Transaction transaction = sessao.beginTransaction(); //Iniciando uma transação
        
        sessao.delete(objeto);
        
        transaction.commit(); //Finalizando a transação
        sessao.close(); //Fechando a sessão
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
