/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import Base.BaseBean;
import Compomentes.Dropview.DropViewContinente;
import Compomentes.Dropview.DropViewPais;
import Controller.CidadeController;
import Model.ECidade;
import Util.ObjetosStaticos;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author rafael
 */
@Named(value = "cidadeBean")
@SessionScoped
public class CidadeBean extends BaseBean<CidadeController, ECidade>
{

    /**
     * Creates a new instance of CidadeBean
     */
    public CidadeBean()
    {
    }

    @Override
    public void salva()
    {
        super.salva(); //To change body of generated methods, choose Tools | Templates.
        ObjetosStaticos.getInstance().updateContinente();
    }
    
    

    public void onContinenteChange()
    {
        pais.setContinente(objeto.getPais().getContinente());
    }    
    
    @Override
    protected ECidade getNewModel()
    {
        return new ECidade();
    }

    @Override
    protected CidadeController getNewController()
    {
        return new CidadeController();
    }
 
    
    private DropViewContinente continente;
    private DropViewPais pais;

    public DropViewContinente getContinente()
    {
        return continente;
    }

    public void setContinente(DropViewContinente continente)
    {
        this.continente = continente;
    }

    public DropViewPais getPais()
    {
        return pais;
    }

    public void setPais(DropViewPais pais)
    {
        this.pais = pais;
    }
}
