/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import Base.BaseBean;
import Controller.ContinenteController;
import Model.EContinente;
import Util.ObjetosStaticos;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author rafael
 */
@Named(value = "continenteBean")
@SessionScoped
public class ContinenteBean extends BaseBean<ContinenteController, EContinente>
{

    @Override
    public void salva()
    {
        super.salva(); //To change body of generated methods, choose Tools | Templates.
        ObjetosStaticos.getInstance().updateContinente();
    }
    
    

    @Override
    protected EContinente getNewModel()
    {
       return new EContinente();
    }

    @Override
    protected ContinenteController getNewController()
    {
        return new ContinenteController();
    }
    
}
