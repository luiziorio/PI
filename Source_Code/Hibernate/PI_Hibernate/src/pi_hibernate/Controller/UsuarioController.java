/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pi_hibernate.Controller;

import pi_hibernate.Base.BaseController;
import pi_hibernate.DAO.UsuarioDAO;
import pi_hibernate.IVO.IUsuario;
import pi_hibernate.VO.UsuarioVO;

/**
 *
 * @author rafael
 */
public class UsuarioController extends BaseController<UsuarioVO, UsuarioDAO, IUsuario>
{

    @Override
    protected UsuarioDAO GetInstanciaDAO()
    {
        return UsuarioDAO.GetObjeto();
    }
    
}
