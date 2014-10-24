/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DB_FlightSystem.Entidade;

import Criptografia.Cripto;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Table;
import DB_FlightSystem.Base.EBaseNome;
import DB_FlightSystem.IEntidade.IUsuario;


/**
 *
 * @author rafael
 */
@Entity
@Table(name = "Usuario")
public class EUsuario extends EBaseNome implements IUsuario
{
    private String login;
    
    @Basic(fetch = FetchType.LAZY)
    private String senha;
    private Integer tipo;
    private String email;

    public EUsuario()
    {
    }

    public EUsuario(Integer sequencial, String login, String senha, Integer tipo, String email)
    {
        this.sequencial = sequencial;
        this.login = login;
        this.senha = senha;
        this.tipo = tipo;
        this.email = email;
    }
    

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
    public Integer getTipo()
    {
        return tipo;
    }

    @Override
    public void setTipo(Integer tipo)
    {
        this.tipo = tipo;
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
    
    
}
