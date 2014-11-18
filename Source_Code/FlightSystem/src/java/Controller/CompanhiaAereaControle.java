/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import DB_FlightSystem.Controller.CompanhiaAeriaController;
import Model.CompanhiaAerea;
import java.util.List;

/**
 *
 * @author Flavinha
 */
public class CompanhiaAereaControle extends BaseControle<CompanhiaAeriaController, CompanhiaAerea>
{

    @Override
    protected CompanhiaAeriaController getInstanceBaseController()
    {
        return new CompanhiaAeriaController();
    }
    
    public List<CompanhiaAerea> getAll()
    {
        try(CompanhiaAeriaController c = new CompanhiaAeriaController())
        {
            return (List<CompanhiaAerea>)(CompanhiaAerea)c.getAll();
        }
    }
    
    public CompanhiaAerea getById(Integer id)
    {
        try(CompanhiaAeriaController c = new CompanhiaAeriaController())
        {
            return (CompanhiaAerea)c.getEntidade(id);
        }
    }
    
}
