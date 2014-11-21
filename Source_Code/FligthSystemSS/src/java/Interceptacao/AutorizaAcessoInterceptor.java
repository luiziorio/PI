/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interceptacao;

import Controller.UsuarioController;
import Model.EUsuario;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 *
 * @author rafael
 */
public class AutorizaAcessoInterceptor extends HandlerInterceptorAdapter
{

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception
    {
        return true;
        
    }
    
    private boolean validaUsuario(HttpServletRequest request)
    {
        EUsuario usuario = (EUsuario)request.getSession().getAttribute(Constantes.Sessao.getInstancia().USUARIO);
        if(usuario == null)
            return false;
        try(UsuarioController controller = new UsuarioController())
        {
            return controller.validaUsuario(usuario);
        }
        
    }
    
}
