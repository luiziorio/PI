/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_FlightSystem.Entidade;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import DB_FlightSystem.Base.EBase;

/**
 *
 * @author rafael
 */
@Entity
@Table(name = "Escala")
public class EEscala extends EBase  
{
    @ManyToMany(mappedBy = "escalas")
    private List<EVoo> eVoos;
    @OneToOne(fetch = FetchType.LAZY)
    private EAeroporto aerportoDestino;
    @OneToOne(fetch = FetchType.LAZY)
    private EAeroporto aeroportoOrigem;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataChegadaPrevista;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataSaidaPrevista;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataChegadaEfetiva;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataSaidaEfetiva;
    
    private Integer status;
    private boolean atrasado;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private EVoo voo;

     
    public EAeroporto getAerportoDestino()
    {
        return aerportoDestino;
    }

     
    public void setAerportoDestino(EAeroporto aerportoDestino)
    {
        this.aerportoDestino = aerportoDestino;
    }

     
    public EAeroporto getAeroportoOrigem()
    {
        return aeroportoOrigem;
    }

     
    public void setAeroportoOrigem(EAeroporto aeroportoOrigem)
    {
        this.aeroportoOrigem = aeroportoOrigem;
    }

     
    public Date getDataChegadaPrevista()
    {
        return dataChegadaPrevista;
    }

     
    public void setDataChegadaPrevista(Date dataChegadaPrevista)
    {
        this.dataChegadaPrevista = dataChegadaPrevista;
    }

     
    public Date getDataSaidaPrevista()
    {
        return dataSaidaPrevista;
    }

     
    public void setDataSaidaPrevista(Date dataSaidaPrevista)
    {
        this.dataSaidaPrevista = dataSaidaPrevista;
    }

     
    public Date getDataChegadaEfetiva()
    {
        return dataChegadaEfetiva;
    }

     
    public void setDataChegadaEfetiva(Date dataChegadaEfetiva)
    {
        this.dataChegadaEfetiva = dataChegadaEfetiva;
    }

     
    public Date getDataSaidaEfetiva()
    {
        return dataSaidaEfetiva;
    }

     
    public void setDataSaidaEfetiva(Date dataSaidaEfetiva)
    {
        this.dataSaidaEfetiva = dataSaidaEfetiva;
    }

     
    public Integer getStatus()
    {
        return status;
    }

     
    public void setStatus(Integer status)
    {
        this.status = status;
    }

     
    public boolean isAtrasado()
    {
        return atrasado;
    }

     
    public void setAtrasado(boolean atrasado)
    {
        this.atrasado = atrasado;
    }

     
    public EVoo getVoo()
    {
        return voo;
    }

     
    public void setVoo(EVoo voo)
    {
        this.voo = voo;
    }
    
    
}
