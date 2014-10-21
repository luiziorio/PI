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
public class UsuarioControle
{
    public boolean insert(Usuario usuario)
    {
        boolean retorno;
        try(UsuarioController usuarioController = new UsuarioController())
        {
            retorno = usuarioController.Salvar(usuario);
        }
        catch(Exception e)
        {
            retorno = false;
        }
       return retorno;
    }
}
