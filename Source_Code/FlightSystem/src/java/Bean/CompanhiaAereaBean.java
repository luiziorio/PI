/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Bean;

import Controller.BaseControle;
import Controller.CompanhiaAereaControle;
import DB_FlightSystem.Base.EBase;
import Model.CompanhiaAerea;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author Flavinha
 */
@Named(value = "companhiaAereaBean")
@SessionScoped
public class CompanhiaAereaBean extends BaseBean<CompanhiaAereaControle, CompanhiaAerea>
{

    
    /**
     * Creates a new instance of CompanhiaAereaBean
     */
    public CompanhiaAereaBean()
    {
    }
    
    @Override
    protected CompanhiaAereaControle getControleInstancia()
    {
        return new CompanhiaAereaControle();
    }
}
