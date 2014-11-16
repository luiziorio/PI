/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidade;

import java.io.Serializable;
import java.util.List;
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
@Table(name = "diasemana")
@XmlRootElement
@NamedQueries(
{
    @NamedQuery(name = "Diasemana.findAll", query = "SELECT d FROM Diasemana d"),
    @NamedQuery(name = "Diasemana.findByIddiasemana", query = "SELECT d FROM Diasemana d WHERE d.iddiasemana = :iddiasemana"),
    @NamedQuery(name = "Diasemana.findByDiasemananome", query = "SELECT d FROM Diasemana d WHERE d.diasemananome = :diasemananome")
})
public class Diasemana implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "iddiasemana")
    private Integer iddiasemana;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "diasemananome")
    private String diasemananome;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iddiasemana")
    private List<Slot> slotList;

    public Diasemana()
    {
    }

    public Diasemana(Integer iddiasemana)
    {
        this.iddiasemana = iddiasemana;
    }

    public Diasemana(Integer iddiasemana, String diasemananome)
    {
        this.iddiasemana = iddiasemana;
        this.diasemananome = diasemananome;
    }

    public Integer getIddiasemana()
    {
        return iddiasemana;
    }

    public void setIddiasemana(Integer iddiasemana)
    {
        this.iddiasemana = iddiasemana;
    }

    public String getDiasemananome()
    {
        return diasemananome;
    }

    public void setDiasemananome(String diasemananome)
    {
        this.diasemananome = diasemananome;
    }

    @XmlTransient
    public List<Slot> getSlotList()
    {
        return slotList;
    }

    public void setSlotList(List<Slot> slotList)
    {
        this.slotList = slotList;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (iddiasemana != null ? iddiasemana.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Diasemana))
        {
            return false;
        }
        Diasemana other = (Diasemana) object;
        if ((this.iddiasemana == null && other.iddiasemana != null) || (this.iddiasemana != null && !this.iddiasemana.equals(other.iddiasemana)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "Entidade.Diasemana[ iddiasemana=" + iddiasemana + " ]";
    }
    
}
