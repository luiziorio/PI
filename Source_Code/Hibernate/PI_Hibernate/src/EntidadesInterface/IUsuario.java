/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EntidadesInterface;

/**
 *
 * @author rafaellf
 */
public interface IUsuario extends IBaseNome
{
    String getLogin();
    void setLogin(String login);
    
    String getSenha();
    void setSenha(String senha);    
    
    Integer getTipoUsuario();
    void setTipoUsuario(Integer tipoUsuario);
}
