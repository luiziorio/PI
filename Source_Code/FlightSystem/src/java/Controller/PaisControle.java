/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import DB_FlightSystem.Controller.PaisController;
import Model.Pais;

/**
 *
 * @author Flavinha
 */
public class PaisControle extends BaseControle<PaisController, Pais>
{

    @Override
    protected PaisController getInstanceBaseController()
    {
        return new PaisController();
    }
    
}
