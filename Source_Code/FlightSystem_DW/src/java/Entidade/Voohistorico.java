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
@Table(name = "voohistorico")
@XmlRootElement
@NamedQueries(
{
    @NamedQuery(name = "Voohistorico.findAll", query = "SELECT v FROM Voohistorico v"),
    @NamedQuery(name = "Voohistorico.findByIdvoo", query = "SELECT v FROM Voohistorico v WHERE v.idvoo = :idvoo"),
    @NamedQuery(name = "Voohistorico.findByIdslot", query = "SELECT v FROM Voohistorico v WHERE v.idslot = :idslot"),
    @NamedQuery(name = "Voohistorico.findByIdaeroportoorigem", query = "SELECT v FROM Voohistorico v WHERE v.idaeroportoorigem = :idaeroportoorigem"),
    @NamedQuery(name = "Voohistorico.findByIdaeroportodestino", query = "SELECT v FROM Voohistorico v WHERE v.idaeroportodestino = :idaeroportodestino"),
    @NamedQuery(name = "Voohistorico.findByVoohorapartida", query = "SELECT v FROM Voohistorico v WHERE v.voohorapartida = :voohorapartida"),
    @NamedQuery(name = "Voohistorico.findByVoohorachegada", query = "SELECT v FROM Voohistorico v WHERE v.voohorachegada = :voohorachegada")
})
public class Voohistorico implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idvoo")
    private Integer idvoo;
    @Column(name = "idslot")
    private Integer idslot;
    @Size(max = 3)
    @Column(name = "idaeroportoorigem")
    private String idaeroportoorigem;
    @Size(max = 3)
    @Column(name = "idaeroportodestino")
    private String idaeroportodestino;
    @Column(name = "voohorapartida")
    @Temporal(TemporalType.TIMESTAMP)
    private Date voohorapartida;
    @Column(name = "voohorachegada")
    @Temporal(TemporalType.TIMESTAMP)
    private Date voohorachegada;

    public Voohistorico()
    {
    }

    public Voohistorico(Integer idvoo)
    {
        this.idvoo = idvoo;
    }

    public Integer getIdvoo()
    {
        return idvoo;
    }

    public void setIdvoo(Integer idvoo)
    {
        this.idvoo = idvoo;
    }

    public Integer getIdslot()
    {
        return idslot;
    }

    public void setIdslot(Integer idslot)
    {
        this.idslot = idslot;
    }

    public String getIdaeroportoorigem()
    {
        return idaeroportoorigem;
    }

    public void setIdaeroportoorigem(String idaeroportoorigem)
    {
        this.idaeroportoorigem = idaeroportoorigem;
    }

    public String getIdaeroportodestino()
    {
        return idaeroportodestino;
    }

    public void setIdaeroportodestino(String idaeroportodestino)
    {
        this.idaeroportodestino = idaeroportodestino;
    }

    public Date getVoohorapartida()
    {
        return voohorapartida;
    }

    public void setVoohorapartida(Date voohorapartida)
    {
        this.voohorapartida = voohorapartida;
    }

    public Date getVoohorachegada()
    {
        return voohorachegada;
    }

    public void setVoohorachegada(Date voohorachegada)
    {
        this.voohorachegada = voohorachegada;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (idvoo != null ? idvoo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Voohistorico))
        {
            return false;
        }
        Voohistorico other = (Voohistorico) object;
        if ((this.idvoo == null && other.idvoo != null) || (this.idvoo != null && !this.idvoo.equals(other.idvoo)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "Entidade.Voohistorico[ idvoo=" + idvoo + " ]";
    }
    
}
