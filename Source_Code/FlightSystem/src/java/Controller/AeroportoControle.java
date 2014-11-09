/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import DB_FlightSystem.Controller.AeroportoController;
import Model.Aeroporto;

/**
 *
 * @author Flavinha
 */
public class AeroportoControle extends BaseControle<AeroportoController, Aeroporto>
{

    @Override
    protected AeroportoController getInstanceBase()
    {
        return new AeroportoController();
    }
    
}
