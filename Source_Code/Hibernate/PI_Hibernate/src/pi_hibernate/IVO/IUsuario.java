/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pi_hibernate.IVO;

import pi_hibernate.Base.IBase;

/**
 *
 * @author rafael
 */
public interface IUsuario extends IBase
{
    String getLogin();
    void setLogin(String login);

    String getSenha();
    void setSenha(String senha);

    Integer getTipo();
    void setTipo(Integer tipo);    
}
