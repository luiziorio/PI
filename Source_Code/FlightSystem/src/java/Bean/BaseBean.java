/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import Controller.BaseControle;
import DB_FlightSystem.Base.EBase;
import java.io.Serializable;

/**
 *
 * @author rafael
 */
public abstract class BaseBean < T extends BaseControle, TM extends  EBase> implements Serializable
{
    protected TM objeto;

    public TM getObjeto()
    {
        return objeto;
    }

    public void setObjeto(TM objeto)
    {
        this.objeto = objeto;
    }
    
    
    
    protected abstract T getControleInstancia();
    
    public void insert()
    {
        T t = getControleInstancia();
        t.insert(objeto);
    }
}
