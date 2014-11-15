/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidates;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author rafael
 */
@Entity
@Table(name = "continente")
@XmlRootElement
@NamedQueries(
{
    @NamedQuery(name = "Continente.findAll", query = "SELECT c FROM Continente c"),
    @NamedQuery(name = "Continente.findByIdcontinente", query = "SELECT c FROM Continente c WHERE c.idcontinente = :idcontinente"),
    @NamedQuery(name = "Continente.findByContinentenome", query = "SELECT c FROM Continente c WHERE c.continentenome = :continentenome")
})
public class Continente implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idcontinente")
    private Integer idcontinente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "continentenome")
    private String continentenome;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcontinente")
    private Collection<Pais> paisCollection;

    public Continente()
    {
    }

    public Continente(Integer idcontinente)
    {
        this.idcontinente = idcontinente;
    }

    public Continente(Integer idcontinente, String continentenome)
    {
        this.idcontinente = idcontinente;
        this.continentenome = continentenome;
    }

    public Integer getIdcontinente()
    {
        return idcontinente;
    }

    public void setIdcontinente(Integer idcontinente)
    {
        this.idcontinente = idcontinente;
    }

    public String getContinentenome()
    {
        return continentenome;
    }

    public void setContinentenome(String continentenome)
    {
        this.continentenome = continentenome;
    }

    @XmlTransient
    public Collection<Pais> getPaisCollection()
    {
        return paisCollection;
    }

    public void setPaisCollection(Collection<Pais> paisCollection)
    {
        this.paisCollection = paisCollection;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (idcontinente != null ? idcontinente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Continente))
        {
            return false;
        }
        Continente other = (Continente) object;
        if ((this.idcontinente == null && other.idcontinente != null) || (this.idcontinente != null && !this.idcontinente.equals(other.idcontinente)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "Entidates.Continente[ idcontinente=" + idcontinente + " ]";
    }
    
}
