/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;


import Base.EBaseNome;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import org.springframework.stereotype.Component;

/**
 *
 * @author rafaellf
 */
@Entity
@Table(name = "EAeroporto")
@NamedQueries(
{
    @NamedQuery(name = "EAeroporto.findAll", query = "SELECT a FROM EAeroporto a"),
    @NamedQuery(name = "EAeroporto.findByIdaeroporto", query = "SELECT a FROM EAeroporto a WHERE a.sequencial = :sequencial"),
    @NamedQuery(name = "EAeroporto.findNotTransferido",query = "SELECT a FROM EAeroporto a WHERE a.tranferidoParaDW = :tranferido")
})
@Component
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

    public EAeroporto()
    {
    }

    public EAeroporto(String codigo, EContinente continente, EPais pais, ECidade cidade, String nome, Integer sequencial)
    {
        super(nome, sequencial);
        this.codigo = codigo;
        this.continente = continente;
        this.pais = pais;
        this.cidade = cidade;
    }
}
