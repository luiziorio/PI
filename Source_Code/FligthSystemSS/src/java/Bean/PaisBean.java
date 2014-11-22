/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import Base.BaseBean;
import Compomentes.Dropview.DropViewContinente;
import Controller.PaisController;
import Model.EContinente;
import Model.EPais;
import Util.ObjetosStaticos;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author rafael
 */
@Named(value = "paisBean")
@SessionScoped
public class PaisBean extends BaseBean<PaisController, EPais>
{

    /**
     * Creates a new instance of PaisBean
     */
    public PaisBean()
    {
    }

    @Override
    public void salva()
    {
        super.salva(); //To change body of generated methods, choose Tools | Templates.
        ObjetosStaticos.getInstance().updateContinente();
    }

    
    
    @Override
    protected EPais getNewModel()
    {
        return new EPais();
    }

    @Override
    protected PaisController getNewController()
    {
        return new PaisController();
    }
    
    
    private DropViewContinente continente;

    public DropViewContinente getContinente()
    {
        if(continente == null)
            continente = new DropViewContinente();
        return continente;
    }

    public void setContinente(DropViewContinente continente)
    {
        //this.continente = continente;
    }
    
    
}
