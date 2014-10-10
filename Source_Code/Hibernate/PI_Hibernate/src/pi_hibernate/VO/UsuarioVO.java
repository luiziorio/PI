/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pi_hibernate.VO;

import pi_hibernate.Base.BaseNomeVO;
import pi_hibernate.IVO.IUsuario;

/**
 *
 * @author rafael
 */
public class UsuarioVO extends BaseNomeVO implements IUsuario
{
    private String login,senha;
    private Integer tipo;

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
        this.senha = senha;
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
