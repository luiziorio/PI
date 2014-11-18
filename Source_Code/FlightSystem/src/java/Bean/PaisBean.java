/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Bean;

import Controller.PaisControle;
import Model.Pais;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author Flavinha
 */
@Named(value = "paisBean")
@Dependent
public class PaisBean extends BaseBean<PaisControle, Pais>
{

    /**
     * Creates a new instance of PaisBean
     */
    public PaisBean()
    {
        super();
    }

    @Override
    protected PaisControle getControleInstancia()
    {
        return new PaisControle();
    }

    @Override
    protected PaisControle instanciaControle()
    {
        return new PaisControle();
    }
    
}
