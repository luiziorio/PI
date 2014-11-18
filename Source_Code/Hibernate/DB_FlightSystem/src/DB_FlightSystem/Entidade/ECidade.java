/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DB_FlightSystem.Entidade;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import DB_FlightSystem.Base.EBaseNome;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author rafael
 */
@Entity
@Table(name = "Cidade")
@XmlRootElement
@NamedQueries(
{
    @NamedQuery(name = "ECidade.getAll", query = "SELECT a FROM ECidade a"),
    @NamedQuery(name = "ECidade.getAllCidadePorPais", query = "SELECT A FROM ECidade A WHERE A.pais.sequencial = :id")
})
public class ECidade extends EBaseNome
{
    @ManyToOne
    private EPais pais;
    private Integer fusoHorario;

    public EPais getPaisSequencial()
    {
        return pais;
    }

    public void setPaisSequencial(EPais pais)
    {
        this.pais = pais;
    }
    
    public Integer getFusoHorario()
    {
        return fusoHorario;
    }

    public void setFusoHorario(Integer fusoHorario)
    {
        this.fusoHorario = fusoHorario;
    }

    public ECidade()
    {
    }

    public ECidade(Integer fusoHorario, String nome, Integer sequencial)
    {
        super(nome, sequencial);
        this.fusoHorario = fusoHorario;
    }

    public ECidade(EPais pais, Integer fusoHorario, String nome, Integer sequencial)
    {
        super(nome, sequencial);
        this.pais = pais;
        this.fusoHorario = fusoHorario;
    }
}
