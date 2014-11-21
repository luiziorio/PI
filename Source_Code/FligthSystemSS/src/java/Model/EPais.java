/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import Base.EBaseNome;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import org.springframework.stereotype.Component;


/**
 *
 * @author rafael
 */
@Entity
@Table(name = "Pais")
@NamedQueries(
{
    @NamedQuery(name = "EPais.getAll", query = "SELECT a FROM EPais a"),
    @NamedQuery(name = "EPais.getAllPaisPorContinete", query = "SELECT A FROM EPais A WHERE A.continente.sequencial = :id")
})
@Component
public class EPais extends EBaseNome  
{
    @ManyToOne
    private EContinente continente;
    @OneToMany (fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<ECidade> listaCidades;

    public EContinente getContinenteSequencial()
    {
        return continente;
    }

    public void setContinenteSequencial(EContinente continente)
    {
        this.continente = continente;
    }
    
    public Set<ECidade> getListaCidades()
    {
        return listaCidades;
    }
     
    public void setListaCidades(Set<ECidade> listaCidades)
    {
        this.listaCidades = listaCidades;
    }

    public EPais()
    {
    }

    public EPais(EContinente continente, Set<ECidade> listaCidades, String nome, Integer sequencial)
    {
        super(nome, sequencial);
        this.continente = continente;
        this.listaCidades = listaCidades;
    }
}