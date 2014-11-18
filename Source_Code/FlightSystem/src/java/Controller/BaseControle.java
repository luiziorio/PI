/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DB_FlightSystem.Base.BaseController;
import DB_FlightSystem.Base.EBase;
import java.util.List;

/**
 *
 * @author rafael
 * @param <T>
 * @param <TE>
 */
public abstract class BaseControle< T extends BaseController, TE extends EBase>
{
    protected abstract T getInstanceBaseController();
    
    public boolean insert(TE entidade)
    {
        boolean retorno;
        try(T base = getInstanceBaseController())
        {
            retorno = base.Salvar(entidade);
        }
        catch(Exception e)
        {
            retorno = false;
        }
       return retorno;
    }
    
    public List<TE> getAll()
    {
        try(T controller = getInstanceBaseController())
        {
            return (List<TE>)(TE) controller.getAll();
        }
    }
    
    public TE getById(Integer id)
    {
        try(T controller = getInstanceBaseController())
        {
            return (TE) controller.getEntidade(id);
        }
        
    }
}
