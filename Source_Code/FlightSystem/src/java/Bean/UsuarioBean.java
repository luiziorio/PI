/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import Controller.UsuarioControle;
import Model.Usuario;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Flavinha
 */
@Named(value = "usuarioBean")
@SessionScoped
public class UsuarioBean extends BaseBean<UsuarioControle, Usuario>
{
    private String senha;

    public String getSenha()
    {
        return senha;
    }

    public void setSenha(String senha)
    {
        this.senha = senha;
    }

    @Override
    public void insert()
    {
        objeto.setSenha(senha);
        super.insert(); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    public UsuarioBean()
    {
    }

    @Override
    protected UsuarioControle getControleInstancia()
    {
        return new UsuarioControle();
    }
}
