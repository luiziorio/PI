/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Bean;

import Controller.AeroportoControle;
import DB_FlightSystem.Entidade.EContinente;
import Model.Aeroporto;
import Model.Cidade;
import Model.Pais;
import java.util.List;
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
    private List<Pais> paises;
    private List<Cidade> cidades;

    public List<Pais> getPaises()
    {
        return paises;
    }

    public void setPaises(List<Pais> paises)
    {
        this.paises = paises;
    }

    public List<Cidade> getCidades()
    {
        return cidades;
    }

    public void setCidades(List<Cidade> cidades)
    {
        this.cidades = cidades;
    }
    /**
     * Creates a new instance of AeroportoBean
     */
    public AeroportoBean()
    {
        super();
    }
    

    @Override
    protected AeroportoControle getControleInstancia()
    {
        return new AeroportoControle();
    }

    public List<EContinente> getContinente()
    {
        return getInstanciaControle().getContinente();
    }
    
    public List<Pais> getPais(Integer continenteId)
    {
        paises = getInstanciaControle().getPais(continenteId);
        return paises;
    }
    
    public List<Cidade> getCidades(Integer paisId)
    {
        return getInstanciaControle().getCidades(paisId);
    }

    @Override
    protected AeroportoControle instanciaControle()
    {
        return new AeroportoControle();
    }  

    @Override
    protected Aeroporto instanceModel()
    {
        return new Aeroporto();
    }
}
