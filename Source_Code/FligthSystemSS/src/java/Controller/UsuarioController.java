/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import Base.BaseController;
import DAO.UsuarioDAO;
import Model.EUsuario;

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
