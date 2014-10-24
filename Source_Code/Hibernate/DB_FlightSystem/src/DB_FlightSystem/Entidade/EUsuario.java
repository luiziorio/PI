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
import javax.xml.bind.annotation.XmlRootElement;


/**
 *
 * @author rafael
 */
@Entity
@Table(name = "Usuario")
@XmlRootElement
public class EUsuario extends EBaseNome  
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
    

     
    public String getLogin()
    {
        return login;
    }

     
    public void setLogin(String login)
    {
        this.login = login;
    }

     
    public String getSenha()
    {
        return senha;
    }

     
    public void setSenha(String senha)
    {
        this.senha = Cripto.encripta(senha);
    }

     
    public Integer getTipo()
    {
        return tipo;
    }

     
    public void setTipo(Integer tipo)
    {
        this.tipo = tipo;
    }

     
    public String getEmail()
    {
        return email;
    }

     
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    
}
