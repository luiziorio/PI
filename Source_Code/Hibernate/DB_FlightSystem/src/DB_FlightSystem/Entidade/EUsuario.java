/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pi_hibernate.Entidade;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Table;
import pi_hibernate.Base.EBaseNome;
import pi_hibernate.IEntidade.IUsuario;


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

    public EUsuario()
    {
    }

    public EUsuario(Integer sequencial, String login, String senha, Integer tipo)
    {
        this.sequencial = sequencial;
        this.login = login;
        this.senha = senha;
        this.tipo = tipo;
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
        MessageDigest algorithm;
        try
        {
            algorithm = MessageDigest.getInstance("MD5");
            byte messageDigest[] = algorithm.digest(senha.getBytes("UTF-8"));
            StringBuilder hexString = new StringBuilder();
            for (byte b : messageDigest) 
                hexString.append(String.format("%02X", 0xFF & b));
            this.senha = hexString.toString();
        }
        catch (NoSuchAlgorithmException ex)
        {
            Logger.getLogger(EUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(UnsupportedEncodingException ex)
        {
            
        }
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
