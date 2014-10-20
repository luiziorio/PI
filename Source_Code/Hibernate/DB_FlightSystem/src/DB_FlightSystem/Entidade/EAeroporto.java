/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DB_FlightSystem.Entidade;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import DB_FlightSystem.Base.EBaseNome;
import DB_FlightSystem.IEntidade.IAeropoto;

/**
 *
 * @author rafaellf
 */
@Entity
@Table(name = "Aeroporto")
public class EAeroporto extends EBaseNome implements IAeropoto
{
    private String codigo;
    @OneToOne(fetch = FetchType.LAZY)
    private EContinente continente;
    @OneToOne(fetch = FetchType.LAZY)
    private EPais pais;
    @OneToOne(fetch = FetchType.LAZY)
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
