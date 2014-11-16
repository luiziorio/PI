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
@Table(name = "escala")
@XmlRootElement
@NamedQueries(
{
    @NamedQuery(name = "Escala.findAll", query = "SELECT e FROM Escala e"),
    @NamedQuery(name = "Escala.findByIdescala", query = "SELECT e FROM Escala e WHERE e.idescala = :idescala"),
    @NamedQuery(name = "Escala.findByIdslot", query = "SELECT e FROM Escala e WHERE e.idslot = :idslot"),
    @NamedQuery(name = "Escala.findByIdaeroporto", query = "SELECT e FROM Escala e WHERE e.idaeroporto = :idaeroporto"),
    @NamedQuery(name = "Escala.findByEscalahorachegada", query = "SELECT e FROM Escala e WHERE e.escalahorachegada = :escalahorachegada"),
    @NamedQuery(name = "Escala.findByEscalahorapartida", query = "SELECT e FROM Escala e WHERE e.escalahorapartida = :escalahorapartida")
})
public class Escala implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idescala")
    private Integer idescala;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idslot")
    private int idslot;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "idaeroporto")
    private String idaeroporto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "escalahorachegada")
    @Temporal(TemporalType.TIMESTAMP)
    private Date escalahorachegada;
    @Basic(optional = false)
    @NotNull
    @Column(name = "escalahorapartida")
    @Temporal(TemporalType.TIMESTAMP)
    private Date escalahorapartida;

    public Escala()
    {
    }

    public Escala(Integer idescala)
    {
        this.idescala = idescala;
    }

    public Escala(Integer idescala, int idslot, String idaeroporto, Date escalahorachegada, Date escalahorapartida)
    {
        this.idescala = idescala;
        this.idslot = idslot;
        this.idaeroporto = idaeroporto;
        this.escalahorachegada = escalahorachegada;
        this.escalahorapartida = escalahorapartida;
    }

    public Integer getIdescala()
    {
        return idescala;
    }

    public void setIdescala(Integer idescala)
    {
        this.idescala = idescala;
    }

    public int getIdslot()
    {
        return idslot;
    }

    public void setIdslot(int idslot)
    {
        this.idslot = idslot;
    }

    public String getIdaeroporto()
    {
        return idaeroporto;
    }

    public void setIdaeroporto(String idaeroporto)
    {
        this.idaeroporto = idaeroporto;
    }

    public Date getEscalahorachegada()
    {
        return escalahorachegada;
    }

    public void setEscalahorachegada(Date escalahorachegada)
    {
        this.escalahorachegada = escalahorachegada;
    }

    public Date getEscalahorapartida()
    {
        return escalahorapartida;
    }

    public void setEscalahorapartida(Date escalahorapartida)
    {
        this.escalahorapartida = escalahorapartida;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (idescala != null ? idescala.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Escala))
        {
            return false;
        }
        Escala other = (Escala) object;
        if ((this.idescala == null && other.idescala != null) || (this.idescala != null && !this.idescala.equals(other.idescala)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "Entidade.Escala[ idescala=" + idescala + " ]";
    }
    
}
