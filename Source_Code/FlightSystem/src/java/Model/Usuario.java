/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import Criptografia.Cripto;
import DB_FlightSystem.IEntidade.IUsuario;

/**
 *
 * @author Flavinha
 */
public class Usuario implements IUsuario
{
    private String login,email,senha;
    private Integer tipo;
    private int sequencial;

    @Override
    public String getLogin()
    {
        return login;
    }

    @Override
    public void setLogin(String login)
    {
        this.login = login;
    }

    @Override
    public String getEmail()
    {
        return email;
    }

    @Override
    public void setEmail(String email)
    {
        this.email = email;
    }

    @Override
    public String getSenha()
    {
        return senha;
    }

    @Override
    public void setSenha(String senha)
    {
        this.senha = Cripto.encripta(senha);
    }

    @Override
    public int getSequencial()
    {
        return sequencial;
    }

    @Override
    public void setSequencial(int sequencial)
    {
        this.sequencial = sequencial;
    }

    @Override
    public Integer getTipo()
    {
        return tipo;
    }

    @Override
    public void setTipo(Integer tipo)
    {
        this.tipo = tipo;
    }

    
}
