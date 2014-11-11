/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DB_FlightSystem.Base.BaseController;
import DB_FlightSystem.Base.EBase;

/**
 *
 * @author rafael
 */
public abstract class BaseControle< T extends BaseController, TE extends EBase>
{
    protected abstract T getInstanceBase();
    
    public boolean insert(TE entidade)
    {
        boolean retorno;
        try(T base = getInstanceBase())
        {
            retorno = base.Salvar(entidade);
        }
        catch(Exception e)
        {
            retorno = false;
        }
       return retorno;
    }
}
