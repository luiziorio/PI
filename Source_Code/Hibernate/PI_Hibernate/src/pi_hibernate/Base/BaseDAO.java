/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pi_hibernate.Base;

import Entidade.BaseVO;

/**
 *  Classe base responsavel por fazer a persistencia dos dados no banco,
 *  utilizando o Hibernate, ela que ira fazer todos os acessos ao banco.
 * @author rafaellf
 * @param <T> A entidade que ela tera que persistir, essa entidade Obrigatoriamente
 *  tem que herdar de BaseVO
 */
public abstract class BaseDAO<T extends BaseVO>
{
    /**
     * Salva o objeto no banco;
     * @param objeto Entidade a ser persistida
    */
    public void Salva(T objeto)
    {                   
    }
    
    /**
     * Remove o objeto do banco
     * @param objeto  Entidade a ser removida
     */
    public void Delete(T objeto)
    {
        
    }
    
    public T getPorID(int id)
    {
        throw  new UnsupportedOperationException("");
    }
}
