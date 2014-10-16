/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pi_hibernate.IEntidade;

import java.util.Set;
import pi_hibernate.Base.IBaseNome;
import pi_hibernate.Entidade.EPais;

/**
 *
 * @author rafael
 */
public interface IContinente extends IBaseNome
{
    Set<EPais> getListaPaises();
    void setListaPaises(Set<EPais> listaPaises);
}
