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
    public UsuarioController()
    {
        super(new UsuarioDAO());
    }
    
    public UsuarioController(UsuarioDAO dao)
    {
        super(dao);
    }
    
    public boolean validaUsuario(EUsuario usario)
    {
        return dao.validaUsuario(usario);
    }
    
}
