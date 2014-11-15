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
@Table(name = "ciaaerea")
@XmlRootElement
@NamedQueries(
{
    @NamedQuery(name = "Ciaaerea.findAll", query = "SELECT c FROM Ciaaerea c"),
    @NamedQuery(name = "Ciaaerea.findByCiaaereasigla", query = "SELECT c FROM Ciaaerea c WHERE c.ciaaereasigla = :ciaaereasigla"),
    @NamedQuery(name = "Ciaaerea.findByCiaaereadescricao", query = "SELECT c FROM Ciaaerea c WHERE c.ciaaereadescricao = :ciaaereadescricao"),
    @NamedQuery(name = "Ciaaerea.findByCiaaerealogotipo", query = "SELECT c FROM Ciaaerea c WHERE c.ciaaerealogotipo = :ciaaerealogotipo")
})
public class Ciaaerea implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "ciaaereasigla")
    private String ciaaereasigla;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 70)
    @Column(name = "ciaaereadescricao")
    private String ciaaereadescricao;
    @Size(max = 245)
    @Column(name = "ciaaerealogotipo")
    private String ciaaerealogotipo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ciaaereasigla")
    private Collection<Slot> slotCollection;

    public Ciaaerea()
    {
    }

    public Ciaaerea(String ciaaereasigla)
    {
        this.ciaaereasigla = ciaaereasigla;
    }

    public Ciaaerea(String ciaaereasigla, String ciaaereadescricao)
    {
        this.ciaaereasigla = ciaaereasigla;
        this.ciaaereadescricao = ciaaereadescricao;
    }

    public String getCiaaereasigla()
    {
        return ciaaereasigla;
    }

    public void setCiaaereasigla(String ciaaereasigla)
    {
        this.ciaaereasigla = ciaaereasigla;
    }

    public String getCiaaereadescricao()
    {
        return ciaaereadescricao;
    }

    public void setCiaaereadescricao(String ciaaereadescricao)
    {
        this.ciaaereadescricao = ciaaereadescricao;
    }

    public String getCiaaerealogotipo()
    {
        return ciaaerealogotipo;
    }

    public void setCiaaerealogotipo(String ciaaerealogotipo)
    {
        this.ciaaerealogotipo = ciaaerealogotipo;
    }

    @XmlTransient
    public Collection<Slot> getSlotCollection()
    {
        return slotCollection;
    }

    public void setSlotCollection(Collection<Slot> slotCollection)
    {
        this.slotCollection = slotCollection;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (ciaaereasigla != null ? ciaaereasigla.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ciaaerea))
        {
            return false;
        }
        Ciaaerea other = (Ciaaerea) object;
        if ((this.ciaaereasigla == null && other.ciaaereasigla != null) || (this.ciaaereasigla != null && !this.ciaaereasigla.equals(other.ciaaereasigla)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "Entidates.Ciaaerea[ ciaaereasigla=" + ciaaereasigla + " ]";
    }
    
}
