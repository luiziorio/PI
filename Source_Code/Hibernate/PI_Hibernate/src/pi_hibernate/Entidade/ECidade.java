/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pi_hibernate.Entidade;

import pi_hibernate.Base.EBaseNome;
import pi_hibernate.IEntidade.ICidade;

/**
 *
 * @author rafael
 */
public class ECidade extends EBaseNome implements ICidade
{
    private Integer paisID;
    private EPais pais;

    @Override
    public Integer getPaisID()
    {
        return paisID;
    }

    @Override
    public void setPaisID(Integer paisID)
    {
        this.paisID = paisID;
    }

    @Override
    public EPais getPais()
    {
        return pais;
    }

    @Override
    public void setPais(EPais pais)
    {
        this.pais = pais;
    }
}
