/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidade;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rafael
 */
@Entity
@Table(name = "slot")
@XmlRootElement
@NamedQueries(
{
    @NamedQuery(name = "Slot.findAll", query = "SELECT s FROM Slot s"),
    @NamedQuery(name = "Slot.findByIdslot", query = "SELECT s FROM Slot s WHERE s.idslot = :idslot"),
    @NamedQuery(name = "Slot.findBySlotnumero", query = "SELECT s FROM Slot s WHERE s.slotnumero = :slotnumero"),
    @NamedQuery(name = "Slot.findBySlothorapartida", query = "SELECT s FROM Slot s WHERE s.slothorapartida = :slothorapartida"),
    @NamedQuery(name = "Slot.findBySlothorachegada", query = "SELECT s FROM Slot s WHERE s.slothorachegada = :slothorachegada")
})
public class Slot implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idslot")
    private Integer idslot;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "slotnumero")
    private String slotnumero;
    @Basic(optional = false)
    @NotNull
    @Column(name = "slothorapartida")
    @Temporal(TemporalType.TIMESTAMP)
    private Date slothorapartida;
    @Basic(optional = false)
    @NotNull
    @Column(name = "slothorachegada")
    @Temporal(TemporalType.TIMESTAMP)
    private Date slothorachegada;
    @JoinColumn(name = "idaeroportoorigem", referencedColumnName = "idaeroporto")
    @ManyToOne(optional = false)
    private Aeroporto idaeroportoorigem;
    @JoinColumn(name = "idaeroportodestino", referencedColumnName = "idaeroporto")
    @ManyToOne(optional = false)
    private Aeroporto idaeroportodestino;
    @JoinColumn(name = "ciaaereasigla", referencedColumnName = "ciaaereasigla")
    @ManyToOne(optional = false)
    private Ciaaerea ciaaereasigla;
    @JoinColumn(name = "iddiasemana", referencedColumnName = "iddiasemana")
    @ManyToOne(optional = false)
    private Diasemana iddiasemana;

    public Slot()
    {
    }

    public Slot(Integer idslot)
    {
        this.idslot = idslot;
    }

    public Slot(Integer idslot, String slotnumero, Date slothorapartida, Date slothorachegada)
    {
        this.idslot = idslot;
        this.slotnumero = slotnumero;
        this.slothorapartida = slothorapartida;
        this.slothorachegada = slothorachegada;
    }

    public Integer getIdslot()
    {
        return idslot;
    }

    public void setIdslot(Integer idslot)
    {
        this.idslot = idslot;
    }

    public String getSlotnumero()
    {
        return slotnumero;
    }

    public void setSlotnumero(String slotnumero)
    {
        this.slotnumero = slotnumero;
    }

    public Date getSlothorapartida()
    {
        return slothorapartida;
    }

    public void setSlothorapartida(Date slothorapartida)
    {
        this.slothorapartida = slothorapartida;
    }

    public Date getSlothorachegada()
    {
        return slothorachegada;
    }

    public void setSlothorachegada(Date slothorachegada)
    {
        this.slothorachegada = slothorachegada;
    }

    public Aeroporto getIdaeroportoorigem()
    {
        return idaeroportoorigem;
    }

    public void setIdaeroportoorigem(Aeroporto idaeroportoorigem)
    {
        this.idaeroportoorigem = idaeroportoorigem;
    }

    public Aeroporto getIdaeroportodestino()
    {
        return idaeroportodestino;
    }

    public void setIdaeroportodestino(Aeroporto idaeroportodestino)
    {
        this.idaeroportodestino = idaeroportodestino;
    }

    public Ciaaerea getCiaaereasigla()
    {
        return ciaaereasigla;
    }

    public void setCiaaereasigla(Ciaaerea ciaaereasigla)
    {
        this.ciaaereasigla = ciaaereasigla;
    }

    public Diasemana getIddiasemana()
    {
        return iddiasemana;
    }

    public void setIddiasemana(Diasemana iddiasemana)
    {
        this.iddiasemana = iddiasemana;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (idslot != null ? idslot.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Slot))
        {
            return false;
        }
        Slot other = (Slot) object;
        if ((this.idslot == null && other.idslot != null) || (this.idslot != null && !this.idslot.equals(other.idslot)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "Entidade.Slot[ idslot=" + idslot + " ]";
    }
    
}
