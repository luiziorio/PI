/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pi_hibernate.Entidade;

import java.util.HashSet;
import pi_hibernate.Base.EBaseNome;
import pi_hibernate.IEntidade.IPais;

/**
 *
 * @author rafael
 */
public class EPais extends EBaseNome implements IPais
{
    private Integer continenteID;
    private EContinente continente;
    private HashSet<ECidade> listaCidades;

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
    public EContinente  getContinente()
    {
        return continente;
    }

    @Override
    public void setContinente(EContinente  continente)
    {
        this.continente = continente;
    }

    @Override
    public HashSet<ECidade> getListaCidades()
    {
        return listaCidades;
    }

    @Override
    public void setListaCidades(HashSet<ECidade> listaCidades)
    {
        this.listaCidades = listaCidades;
    }
    
}
