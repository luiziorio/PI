/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS;

import DB_FlightSystem.Controller.UsuarioController;
import DB_FlightSystem.Entidade.EUsuario;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author rafael
 */
@WebService(serviceName = "FightSystem_WS")
public class FightSystem_WS
{

    
    @WebMethod(operationName = "insereUsuario")
    public void insereUsuario(@WebParam(name = "usuario") EUsuario usuario)
    {
        try(UsuarioController usuarioController = new UsuarioController())
        {
            usuarioController.Salvar(usuario);
        }
        catch(Exception e)
        {
            
        }
    }
    
    @WebMethod(operationName = "insereUsuario")
    public EUsuario getUsuario(@WebParam(name = "usuarioId") Integer usuarioId)
    {
        EUsuario usuario;
        try(UsuarioController usuarioController = new UsuarioController())
        {
            usuario = usuarioController.getEntidade(usuarioId);
        }
        catch(Exception e)
        {
            usuario = null;
        }
        return  usuario;
    }
    
}
