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

/**
 *
 * @author rafaellf
 */
@Entity
@Table(name = "Aeroporto")
public class EAeroporto extends EBaseNome 
{
    private String codigo;
    @OneToOne(fetch = FetchType.LAZY)
    private EContinente continente;
    @OneToOne(fetch = FetchType.LAZY)
    private EPais pais;
    @OneToOne(fetch = FetchType.LAZY)
    private ECidade cidade;

    public String getCodigo()
    {
        return codigo;
    }

    public void setCodigo(String codigo)
    {
        this.codigo = codigo;
    }

    public EContinente getContinente()
    {
        return continente;
    }

    public void setContinente(EContinente continente)
    {
        this.continente = continente;
    }

    public EPais getPais()
    {
        return pais;
    }

    public void setPais(EPais pais)
    {
        this.pais = pais;
    }

    public ECidade getCidade()
    {
        return cidade;
    }

    public void setCidade(ECidade cidade)
    {
        this.cidade = cidade;
    }
}
