/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pi_hibernate.Base;

import java.util.function.Predicate;

/**
 *
 * @author rafaellf
 * @param <TE>
 * @param <TDAO>
 * @param <TIB>
 */
@SuppressWarnings("unchecked")
public abstract class BaseController <TE extends EBase, TDAO extends BaseDAO,TIB extends IBase>
{
    /**
     * Get uma instancia do DAO
     * @return DAO generico
     */
    protected abstract TDAO getInstanciaDAO();
    
    public void Salvar(TE objeto)
    {
        TDAO dao = getInstanciaDAO();
        dao.Salva(objeto);
    }
    
    public void Salvar(TIB objeto)
    {
        Salvar((TE)objeto);
    }
    
    public void Delete(TE objeto)
    {
        TDAO dao = getInstanciaDAO();
        dao.Delete(objeto);
    }
    
    public void Delete(IBase objeto)
    {
        Delete((TE)objeto);
    }
    
    public TE getSelect(String fltro)
    {
        return (TE) getInstanciaDAO().getSelect(fltro);
    }
    
    public TE getSelect(Predicate<TE> fltro)
    {
        return (TE) getInstanciaDAO().getSelect(fltro);
    }
    
}
