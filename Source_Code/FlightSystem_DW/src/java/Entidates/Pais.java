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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "pais")
@XmlRootElement
@NamedQueries(
{
    @NamedQuery(name = "Pais.findAll", query = "SELECT p FROM Pais p"),
    @NamedQuery(name = "Pais.findByIdpais", query = "SELECT p FROM Pais p WHERE p.idpais = :idpais"),
    @NamedQuery(name = "Pais.findByPaisnome", query = "SELECT p FROM Pais p WHERE p.paisnome = :paisnome")
})
public class Pais implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idpais")
    private Integer idpais;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "paisnome")
    private String paisnome;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idpais")
    private Collection<Cidade> cidadeCollection;
    @JoinColumn(name = "idcontinente", referencedColumnName = "idcontinente")
    @ManyToOne(optional = false)
    private Continente idcontinente;

    public Pais()
    {
    }

    public Pais(Integer idpais)
    {
        this.idpais = idpais;
    }

    public Pais(Integer idpais, String paisnome)
    {
        this.idpais = idpais;
        this.paisnome = paisnome;
    }

    public Integer getIdpais()
    {
        return idpais;
    }

    public void setIdpais(Integer idpais)
    {
        this.idpais = idpais;
    }

    public String getPaisnome()
    {
        return paisnome;
    }

    public void setPaisnome(String paisnome)
    {
        this.paisnome = paisnome;
    }

    @XmlTransient
    public Collection<Cidade> getCidadeCollection()
    {
        return cidadeCollection;
    }

    public void setCidadeCollection(Collection<Cidade> cidadeCollection)
    {
        this.cidadeCollection = cidadeCollection;
    }

    public Continente getIdcontinente()
    {
        return idcontinente;
    }

    public void setIdcontinente(Continente idcontinente)
    {
        this.idcontinente = idcontinente;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (idpais != null ? idpais.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pais))
        {
            return false;
        }
        Pais other = (Pais) object;
        if ((this.idpais == null && other.idpais != null) || (this.idpais != null && !this.idpais.equals(other.idpais)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "Entidates.Pais[ idpais=" + idpais + " ]";
    }
    
}
