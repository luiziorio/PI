/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entidade;

import EntidadesInterface.IUsuario;

/**
 *
 * @author rafaellf
 */
public class UsuarioVO extends BaseNomeVo  implements IUsuario
{
    private String login;
    private String senha;
    private Integer tipoUsuario;

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
    public Integer getTipoUsuario()
    {
        return tipoUsuario;
    }

    @Override
    public void setTipoUsuario(Integer tipoUsuario)
    {
        this.tipoUsuario = tipoUsuario;
    }
}
