/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pi_hibernate.Base;

/**
 *
 * @author rafaellf
 * @param <TVO>
 * @param <TDAO>
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
    
    public void Salva(IBase objeto)
    {
        Salva((TVO)objeto);
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
