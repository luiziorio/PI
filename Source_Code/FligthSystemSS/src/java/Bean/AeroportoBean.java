/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Bean;

import Base.Persistencia.BaseBean;
import Compomentes.Dropview.DropViewCidade;
import Compomentes.Dropview.DropViewContinente;
import Compomentes.Dropview.DropViewPais;
import Controller.AeroportoController;
import Model.EAeroporto;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author Flavinha
 */
@Named(value = "aeroportoBean")
@SessionScoped
@Controller
public class AeroportoBean extends BaseBean<AeroportoController, EAeroporto>
{   

    public void onContinenteChange()
    {
        pais.setContinente(objeto.getContinente());
    }
    
    public void onPaisChange()
    {
        cidade.setPais(objeto.getPais());
    }
    
    private DropViewContinente continente;
    private DropViewPais pais;
    private DropViewCidade cidade;

    public DropViewCidade getCidade()
    {
        return cidade;
    }

    public void setCidade(DropViewCidade cidade)
    {
        this.cidade = cidade;
    }

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

    @Override
    protected EAeroporto getNewModel()
    {
        return new EAeroporto();
    }

    @Override
    protected AeroportoController getNewController()
    {
        return new AeroportoController(null);
    }
    
    
   
}
