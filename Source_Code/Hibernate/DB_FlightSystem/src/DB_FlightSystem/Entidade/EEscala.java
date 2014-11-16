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
    private String numero;
    @ManyToMany(mappedBy = "escalas")
    private List<EVoo> eVoos;
    @OneToOne(fetch = FetchType.LAZY)
    private EAeroporto aeroportoDestino;
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
    
    private boolean atrasado;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private EVoo voo;
    
    private EStatus status;

    public String getNumero()
    {
        return numero;
    }

    public void setNumero(String numero)
    {
        this.numero = numero;
    }

    public List<EVoo> geteVoos()
    {
        return eVoos;
    }

    public void seteVoos(List<EVoo> eVoos)
    {
        this.eVoos = eVoos;
    }

    
    public EAeroporto getAeroportoDestino()
    {
        return aeroportoDestino;
    }

     
    public void setAeroportoDestino(EAeroporto aerporotoDestino)
    {
        this.aeroportoDestino = aeroportoDestino;
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

     
    public EStatus getStatus()
    {
        return status;
    }

     
    public void setStatus(EStatus status)
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

    public EEscala()
    {
    }

    public EEscala(List<EVoo> eVoos, EAeroporto aerporotoDestino, EAeroporto aeroportoOrigem, Date dataChegadaPrevista, Date dataSaidaPrevista, Date dataChegadaEfetiva, Date dataSaidaEfetiva, boolean atrasado, EVoo voo, EStatus status, Integer sequencial)
    {
        super(sequencial);
        this.eVoos = eVoos;
        this.aeroportoDestino = aeroportoDestino;
        this.aeroportoOrigem = aeroportoOrigem;
        this.dataChegadaPrevista = dataChegadaPrevista;
        this.dataSaidaPrevista = dataSaidaPrevista;
        this.dataChegadaEfetiva = dataChegadaEfetiva;
        this.dataSaidaEfetiva = dataSaidaEfetiva;
        this.atrasado = atrasado;
        this.voo = voo;
        this.status = status;
    }

    public EEscala(String numero, List<EVoo> eVoos, EAeroporto aeroportoDestino, EAeroporto aeroportoOrigem, Date dataChegadaPrevista, Date dataSaidaPrevista, Date dataChegadaEfetiva, Date dataSaidaEfetiva, boolean atrasado, EVoo voo, EStatus status, Integer sequencial)
    {
        super(sequencial);
        this.numero = numero;
        this.eVoos = eVoos;
        this.aeroportoDestino = aeroportoDestino;
        this.aeroportoOrigem = aeroportoOrigem;
        this.dataChegadaPrevista = dataChegadaPrevista;
        this.dataSaidaPrevista = dataSaidaPrevista;
        this.dataChegadaEfetiva = dataChegadaEfetiva;
        this.dataSaidaEfetiva = dataSaidaEfetiva;
        this.atrasado = atrasado;
        this.voo = voo;
        this.status = status;
    }
    
    
    
    
}
