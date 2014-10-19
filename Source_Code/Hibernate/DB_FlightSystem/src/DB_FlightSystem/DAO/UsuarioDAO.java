/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pi_hibernate.DAO;

import pi_hibernate.Base.BaseDAO;
import pi_hibernate.Entidade.EUsuario;

/**
 *
 * @author rafael
 */
public class UsuarioDAO extends BaseDAO<EUsuario>
{
    private UsuarioDAO(){}
    
    private static UsuarioDAO objeto;
    
    public static UsuarioDAO GetObjeto()
    {
        if(objeto == null)
            objeto = new UsuarioDAO();
        return objeto;
    }

    @Override
    protected EUsuario getInstanceEntidade()
    {
       return new EUsuario();
    }
}
