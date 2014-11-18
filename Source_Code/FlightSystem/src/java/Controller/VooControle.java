/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import DB_FlightSystem.Controller.VooController;
import Model.Voo;

/**
 *
 * @author Flavinha
 */
public class VooControle extends BaseControle<VooController, Voo>
{

    @Override
    protected VooController getInstanceBaseController()
    {
        return new VooController();
    }
    
}
