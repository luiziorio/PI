/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Bean;

import Controller.VooControle;
import Model.Voo;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

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
        super();
    }

    @Override
    protected VooControle getControleInstancia()
    {
        return new VooControle();
    }

    @Override
    protected VooControle instanciaControle()
    {
        return new VooControle();
    }
    
}
