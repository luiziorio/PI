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
    private String senha;

    public Usuario getUsuario()
    {
        return usuario;
    }

    public void setUsuario(Usuario usuario)
    {
        this.usuario = usuario;
    }

    public String getSenha()
    {
        return senha;
    }

    public void setSenha(String senha)
    {
        this.senha = senha;
    }
    
    

    public UsuarioBean()
    {
    }
    
    public String insert()
    {
        if(usuario == null || usuario.getLogin() == null)
            return "";
        usuario.setSenha(senha);
        UsuarioControle usuarioControle = new UsuarioControle();
        usuarioControle.insert(usuario);
        return "";
    }
}
