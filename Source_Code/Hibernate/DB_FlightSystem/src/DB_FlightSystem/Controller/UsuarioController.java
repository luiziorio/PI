/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DB_FlightSystem.Controller;

import DB_FlightSystem.Base.BaseController;
import DB_FlightSystem.DAO.UsuarioDAO;
import DB_FlightSystem.Entidade.EUsuario;

/**
 *
 * @author rafael
 */
public class UsuarioController extends BaseController<EUsuario, UsuarioDAO>
{

    @Override
    protected UsuarioDAO getInstanciaDAO()
    {
        return UsuarioDAO.GetObjeto();
    }
    
}
