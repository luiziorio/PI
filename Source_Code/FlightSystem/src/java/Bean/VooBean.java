/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Bean;

import Controller.VooControle;
import DB_FlightSystem.Base.EBase;
import Model.Voo;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author Flavinha
 */
@Named(value = "vooBean")
@SessionScoped
public class VooBean extends BaseBean<VooControle, Voo>
{

    /**
     * Creates a new instance of VooBean
     */
    public VooBean()
    {
    }

    @Override
    protected VooControle getControleInstancia()
    {
        return new VooControle();
    }
    
}
