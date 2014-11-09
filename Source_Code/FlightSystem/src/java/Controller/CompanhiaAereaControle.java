/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import DB_FlightSystem.Controller.CompanhiaAeriaController;
import Model.CompanhiaAerea;

/**
 *
 * @author Flavinha
 */
public class CompanhiaAereaControle extends BaseControle<CompanhiaAeriaController, CompanhiaAerea>
{

    @Override
    protected CompanhiaAeriaController getInstanceBase()
    {
        return new CompanhiaAeriaController();
    }
    
}
