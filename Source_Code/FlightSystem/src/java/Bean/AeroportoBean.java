/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Bean;

import Controller.AeroportoControle;
import Model.Aeroporto;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author Flavinha
 */
@Named(value = "aeroportoBean")
@SessionScoped
public class AeroportoBean extends BaseBean<AeroportoControle, Aeroporto>
{
    /**
     * Creates a new instance of AeroportoBean
     */
    public AeroportoBean()
    {
    }
    

    @Override
    protected AeroportoControle getControleInstancia()
    {
        return new AeroportoControle();
    }
}
