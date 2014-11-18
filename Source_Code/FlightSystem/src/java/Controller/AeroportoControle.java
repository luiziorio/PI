/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import DB_FlightSystem.Controller.AeroportoController;
import DB_FlightSystem.Controller.CidadeController;
import DB_FlightSystem.Controller.ContinenteController;
import DB_FlightSystem.Controller.PaisController;
import DB_FlightSystem.Entidade.EContinente;
import Model.Aeroporto;
import Model.Cidade;
import Model.Pais;
import java.util.List;

/**
 *
 * @author Flavinha
 */
public class AeroportoControle extends BaseControle<AeroportoController, Aeroporto>
{

    @Override
    protected AeroportoController getInstanceBaseController()
    {
        return new AeroportoController();
    }
    
    public List<EContinente> getContinente()
    {
        try(ContinenteController c = new ContinenteController())
        {
            return c.getAll();
        }
    }
    
    public List<Pais> getPais(Integer continenteId)
    {
        try(PaisController p = new PaisController())
        {
            return (List<Pais>)(Pais)p.getAllPaisPorContinente(continenteId);
        }
    }
    
    public List<Cidade> getCidades(Integer paisId)
    {
        try(CidadeController c=  new CidadeController())
        {
            return (List<Cidade>)(Cidade)c.getCidadeByPais(paisId);
        }
    }
    
}
