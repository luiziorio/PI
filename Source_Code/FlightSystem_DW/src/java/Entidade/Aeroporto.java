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
@Table(name = "aeroporto")
@XmlRootElement
@NamedQueries(
{
    @NamedQuery(name = "Aeroporto.findAll", query = "SELECT a FROM Aeroporto a"),
    @NamedQuery(name = "Aeroporto.findByIdaeroporto", query = "SELECT a FROM Aeroporto a WHERE a.idaeroporto = :idaeroporto"),
    @NamedQuery(name = "Aeroporto.findByAeroportonome", query = "SELECT a FROM Aeroporto a WHERE a.aeroportonome = :aeroportonome")
})
public class Aeroporto implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "idaeroporto")
    private String idaeroporto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "aeroportonome")
    private String aeroportonome;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idaeroportoorigem")
    private List<Slot> slotList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idaeroportodestino")
    private List<Slot> slotList1;
    @JoinColumn(name = "idcidade", referencedColumnName = "idcidade")
    @ManyToOne(optional = false)
    private Cidade idcidade;

    public Aeroporto()
    {
    }

    public Aeroporto(String idaeroporto)
    {
        this.idaeroporto = idaeroporto;
    }

    public Aeroporto(String idaeroporto, String aeroportonome)
    {
        this.idaeroporto = idaeroporto;
        this.aeroportonome = aeroportonome;
    }

    public String getIdaeroporto()
    {
        return idaeroporto;
    }

    public void setIdaeroporto(String idaeroporto)
    {
        this.idaeroporto = idaeroporto;
    }

    public String getAeroportonome()
    {
        return aeroportonome;
    }

    public void setAeroportonome(String aeroportonome)
    {
        this.aeroportonome = aeroportonome;
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

    @XmlTransient
    public List<Slot> getSlotList1()
    {
        return slotList1;
    }

    public void setSlotList1(List<Slot> slotList1)
    {
        this.slotList1 = slotList1;
    }

    public Cidade getIdcidade()
    {
        return idcidade;
    }

    public void setIdcidade(Cidade idcidade)
    {
        this.idcidade = idcidade;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (idaeroporto != null ? idaeroporto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Aeroporto))
        {
            return false;
        }
        Aeroporto other = (Aeroporto) object;
        if ((this.idaeroporto == null && other.idaeroporto != null) || (this.idaeroporto != null && !this.idaeroporto.equals(other.idaeroporto)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "Entidade.Aeroporto[ idaeroporto=" + idaeroporto + " ]";
    }
    
}
