/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import DB_FlightSystem.Controller.UsuarioController;
import Model.Usuario;

/**
 *
 * @author Flavinha
 */
public class UsuarioControle extends BaseControle<UsuarioController, Usuario>
{
    @Override
    protected UsuarioController getInstanceBase()
    {
        return new UsuarioController();
    }
}
