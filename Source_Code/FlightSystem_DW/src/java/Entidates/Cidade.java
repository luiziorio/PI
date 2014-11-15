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
@Table(name = "cidade")
@XmlRootElement
@NamedQueries(
{
    @NamedQuery(name = "Cidade.findAll", query = "SELECT c FROM Cidade c"),
    @NamedQuery(name = "Cidade.findByIdcidade", query = "SELECT c FROM Cidade c WHERE c.idcidade = :idcidade"),
    @NamedQuery(name = "Cidade.findByCidadenome", query = "SELECT c FROM Cidade c WHERE c.cidadenome = :cidadenome"),
    @NamedQuery(name = "Cidade.findByCidadefusohorario", query = "SELECT c FROM Cidade c WHERE c.cidadefusohorario = :cidadefusohorario")
})
public class Cidade implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idcidade")
    private Integer idcidade;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "cidadenome")
    private String cidadenome;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cidadefusohorario")
    private int cidadefusohorario;
    @JoinColumn(name = "idpais", referencedColumnName = "idpais")
    @ManyToOne(optional = false)
    private Pais idpais;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcidade")
    private Collection<Aeroporto> aeroportoCollection;

    public Cidade()
    {
    }

    public Cidade(Integer idcidade)
    {
        this.idcidade = idcidade;
    }

    public Cidade(Integer idcidade, String cidadenome, int cidadefusohorario)
    {
        this.idcidade = idcidade;
        this.cidadenome = cidadenome;
        this.cidadefusohorario = cidadefusohorario;
    }

    public Integer getIdcidade()
    {
        return idcidade;
    }

    public void setIdcidade(Integer idcidade)
    {
        this.idcidade = idcidade;
    }

    public String getCidadenome()
    {
        return cidadenome;
    }

    public void setCidadenome(String cidadenome)
    {
        this.cidadenome = cidadenome;
    }

    public int getCidadefusohorario()
    {
        return cidadefusohorario;
    }

    public void setCidadefusohorario(int cidadefusohorario)
    {
        this.cidadefusohorario = cidadefusohorario;
    }

    public Pais getIdpais()
    {
        return idpais;
    }

    public void setIdpais(Pais idpais)
    {
        this.idpais = idpais;
    }

    @XmlTransient
    public Collection<Aeroporto> getAeroportoCollection()
    {
        return aeroportoCollection;
    }

    public void setAeroportoCollection(Collection<Aeroporto> aeroportoCollection)
    {
        this.aeroportoCollection = aeroportoCollection;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (idcidade != null ? idcidade.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cidade))
        {
            return false;
        }
        Cidade other = (Cidade) object;
        if ((this.idcidade == null && other.idcidade != null) || (this.idcidade != null && !this.idcidade.equals(other.idcidade)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "Entidates.Cidade[ idcidade=" + idcidade + " ]";
    }
    
}
