/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pi_hibernate.Base;

import EntidadesInterface.IBase;
import Entidade.BaseVO;

/**
 * Classe base para fazer os Controle de persistencia da dadeas
 * @author rafaellf
 * @param <TVO> Entidade a ser persisteida. Ela obrigatoriamente tem que herdar
 *   da classe BaseVO
 * @param <TDAO> Classe responsavel por fazer a persistencia do dado no banco.
 *  Obrigatoriamente tem que herdar da classe BaseDAO
 * @param <TIB> Interface que a Entidade VO implemneta. Ela obrigatoriamente tem
 *  que heradar de IBase
 */
public abstract class BaseController <TVO extends BaseVO, TDAO extends BaseDAO,TIB extends IBase>
{
    /**
     * Get uma instancia do DAO
     * @return DAO generico
     */
    protected abstract TDAO GetInstanciaDAO();

    public void Salvar(TVO objeto)
    {
        TDAO dao = GetInstanciaDAO();
        dao.Salva(objeto);
    }
    
    public void Salvar(TIB objeto)
    {
        Salvar((TVO)objeto);
    }
    
    public void Delete(TVO objeto)
    {
        TDAO dao = GetInstanciaDAO();
        dao.Delete(objeto);
    }
    
    public void Delete(IBase objeto)
    {
        Delete((TVO)objeto);
    }
}
