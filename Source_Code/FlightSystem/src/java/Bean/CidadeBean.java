/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Bean;

import Controller.CidadeControle;
import Model.Cidade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author Flavinha
 */
@Named(value = "cidadeBean")
@SessionScoped
public class CidadeBean extends BaseBean<CidadeControle, Cidade>
{   

    /**
     * Creates a new instance of CidadeBean
     */
    public CidadeBean()
    {
    }
    
    
    @Override
    protected CidadeControle getControleInstancia()
    {
        return new CidadeControle();
    }

    @Override
    protected CidadeControle instanciaControle()
    {
        return new CidadeControle();
    }

    @Override
    protected Cidade instanceModel()
    {
        return new Cidade();
    }
}
