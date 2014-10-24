/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DB_FlightSystem.Base;

import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe abstrata com as funções base do controller
 * @author rafaellf
 * @version 1.0.0
 * @param <TE> Classe da ira possuir os dados. Obrigatorio herdar da classe EBase
 * @param <TDAO> Classe de acesso ao banco. Obrigatorio herdar da classe BaseDAO
 */
@SuppressWarnings("unchecked")
public abstract class BaseController <TE extends EBase, TDAO extends BaseDAO> implements AutoCloseable
{
    /**
     * Get uma instancia do DAO
     * @return DAO generico
     */
    protected abstract TDAO getInstanciaDAO();
    
    @Override 
     public void close()
     {
        try
        {
            this.finalize();
            System.gc();
        }
        catch (Throwable ex)
        {
            Logger.getLogger(BaseController.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    
     
     /**
      * Salva a entidade
      * @param objeto entidade a ser salva
      */
    public boolean Salvar(TE objeto)
    {
        TDAO dao = getInstanciaDAO();
        return dao.Salva(objeto);
    }
    
    
    /**
     * Delete a entidade
     * @param objeto Entidade a ser deletada
     */
    public void Delete(TE objeto)
    {
        TDAO dao = getInstanciaDAO();
        dao.Delete(objeto);
    }
    
    /**
     * Delete a entidade
     * @param objeto Entidade a ser deletada
     */
    public void Delete(IBase objeto)
    {
        Delete((TE)objeto);
    }
    
    /**
     * Pesquisa a ser realizada com o HQL
     * 
     * @param fltro Filtro usando o HQL
     * @return retorna um objeto que herda de EBase
     */
    public TE getSelect(String fltro)
    {
        return (TE) getInstanciaDAO().getSelect(fltro);
    }
    
    /**
     * Realiza pesquisa utilizando um lambda expression,
     * METODO NÃO ESTA PRONTO AINDA
     * @param filtro Lambda expression
     * @return retorna um objeto que herda de EBase
     */
    public TE getSelect(Predicate<TE> filtro)
    {
        return null;
    }
    
    /**
     * Pesquisa entidae pelo id
     * 
     * @param id Id desejado
     * @return retorna um objeto que herda de EBase
     */
    public TE getEntidade(int  id)
    {
        return (TE) getInstanciaDAO().getObjeto(id);
                
    }
    
}
