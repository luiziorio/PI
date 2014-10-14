/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pi_hibernate.Entidade;


import pi_hibernate.Base.EBaseNome;
import pi_hibernate.IEntidade.IAeropoto;

/**
 *
 * @author rafaellf
 */
public class EAeroporto extends EBaseNome implements IAeropoto
{
    private String codigo;
    private EContinente continente;
    private EPais pais;
    private ECidade cidade;

    @Override
    public String getCodigo()
    {
        return codigo;
    }

    @Override
    public void setCodigo(String codigo)
    {
        this.codigo = codigo;
    }

    @Override
    public EContinente getContinente()
    {
        return continente;
    }

    @Override
    public void setContinente(EContinente continente)
    {
        this.continente = continente;
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

    @Override
    public ECidade getCidade()
    {
        return cidade;
    }

    @Override
    public void setCidade(ECidade cidade)
    {
        this.cidade = cidade;
    }
}
