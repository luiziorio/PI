/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Bean;

import Controller.AeronaveControle;
import Model.Aeronave;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

/**
 * Bean da view Aeronave
 * @author Flavinha
 */
@Named(value = "aeronaveBean")
@SessionScoped
public class AeronaveBean extends BaseBean<AeronaveControle, Aeronave>
{

    
    /**
     * Creates a new instance of AeronaveBean
     */
    public AeronaveBean()
    {
        super();
    }

    @Override
    protected AeronaveControle getControleInstancia()
    {
        return new AeronaveControle();
    }

    @Override
    protected AeronaveControle instanciaControle()
    {
        return new AeronaveControle();
    }
    
}
