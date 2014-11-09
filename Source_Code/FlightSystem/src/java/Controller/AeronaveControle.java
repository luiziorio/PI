/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import DB_FlightSystem.Controller.AeronaveController;
import Model.Aeronave;

/**
 *
 * @author Flavinha
 */
public class AeronaveControle extends BaseControle<AeronaveController, Aeronave>
{
    @Override
    protected AeronaveController getInstanceBase()
    {
        return new AeronaveController();
    }   
}
