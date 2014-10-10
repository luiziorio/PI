/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pi_hibernate.Entidade;

import java.util.HashSet;
import pi_hibernate.Base.EBaseNome;

/**
 *
 * @author rafael
 */
public class ECidade extends EBaseNome
{
    private Integer paisID;
    private EPais pais;
    private HashSet<EPais> listaPaises;

    public Integer getPaisID()
    {
        return paisID;
    }

    public void setPaisID(Integer paisID)
    {
        this.paisID = paisID;
    }

    public EPais getPais()
    {
        return pais;
    }

    public void setPais(EPais pais)
    {
        this.pais = pais;
    }
}
