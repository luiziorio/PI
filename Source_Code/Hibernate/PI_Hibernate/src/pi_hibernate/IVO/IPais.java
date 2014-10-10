/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pi_hibernate.IVO;

import pi_hibernate.Base.IBaseNome;
import pi_hibernate.VO.ContinenteVO;

/**
 *
 * @author rafael
 */
public interface IPais extends IBaseNome
{
    Integer getContinenteID();
    void setContinenteID(Integer continenteID);

    ContinenteVO getContinente();
    void setContinente(ContinenteVO continente);   
}
