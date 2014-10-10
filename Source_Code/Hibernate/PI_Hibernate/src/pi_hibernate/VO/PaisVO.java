/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pi_hibernate.VO;

import pi_hibernate.Base.BaseNomeVO;
import pi_hibernate.IVO.IPais;

/**
 *
 * @author rafael
 */
public class PaisVO extends BaseNomeVO implements IPais
{
    private Integer continenteID;
    private ContinenteVO continente;

    @Override
    public Integer getContinenteID()
    {
        return continenteID;
    }

    @Override
    public void setContinenteID(Integer continenteID)
    {
        this.continenteID = continenteID;
    }

    @Override
    public ContinenteVO getContinente()
    {
        return continente;
    }

    @Override
    public void setContinente(ContinenteVO continente)
    {
        this.continente = continente;
    }
    
}
