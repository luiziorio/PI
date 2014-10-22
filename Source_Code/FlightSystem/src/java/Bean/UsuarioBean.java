/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import Controller.UsuarioControle;
import Model.Usuario;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Flavinha
 */
@Named(value = "usuarioBean")
@SessionScoped
public class UsuarioBean implements Serializable
{
    private Usuario usuario = new Usuario();
    private UsuarioControle usuarioControle;

    public Usuario getUsuario()
    {
        return usuario;
    }

    public void setUsuario(Usuario usuario)
    {
        this.usuario = usuario;
    }

    public UsuarioBean()
    {

    }
}
