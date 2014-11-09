/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import DB_FlightSystem.Base.EBase;
import DB_FlightSystem.Controller.CidadeController;
import Model.Cidade;

/**
 *
 * @author Flavinha
 */
public class CidadeControle extends BaseControle<CidadeController, Cidade>
{

    @Override
    protected CidadeController getInstanceBase()
    {
        return new CidadeController();
    }
    
}
