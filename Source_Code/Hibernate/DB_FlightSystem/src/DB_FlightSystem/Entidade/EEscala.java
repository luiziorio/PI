/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi_hibernate.Entidade;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import pi_hibernate.Base.EBase;
import pi_hibernate.IEntidade.IEscala;

/**
 *
 * @author rafael
 */
@Entity
@Table(name = "Escala")
public class EEscala extends EBase implements IEscala
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

    @Override
    public EAeroporto getAerportoDestino()
    {
        return aerportoDestino;
    }

    @Override
    public void setAerportoDestino(EAeroporto aerportoDestino)
    {
        this.aerportoDestino = aerportoDestino;
    }

    @Override
    public EAeroporto getAeroportoOrigem()
    {
        return aeroportoOrigem;
    }

    @Override
    public void setAeroportoOrigem(EAeroporto aeroportoOrigem)
    {
        this.aeroportoOrigem = aeroportoOrigem;
    }

    @Override
    public Date getDataChegadaPrevista()
    {
        return dataChegadaPrevista;
    }

    @Override
    public void setDataChegadaPrevista(Date dataChegadaPrevista)
    {
        this.dataChegadaPrevista = dataChegadaPrevista;
    }

    @Override
    public Date getDataSaidaPrevista()
    {
        return dataSaidaPrevista;
    }

    @Override
    public void setDataSaidaPrevista(Date dataSaidaPrevista)
    {
        this.dataSaidaPrevista = dataSaidaPrevista;
    }

    @Override
    public Date getDataChegadaEfetiva()
    {
        return dataChegadaEfetiva;
    }

    @Override
    public void setDataChegadaEfetiva(Date dataChegadaEfetiva)
    {
        this.dataChegadaEfetiva = dataChegadaEfetiva;
    }

    @Override
    public Date getDataSaidaEfetiva()
    {
        return dataSaidaEfetiva;
    }

    @Override
    public void setDataSaidaEfetiva(Date dataSaidaEfetiva)
    {
        this.dataSaidaEfetiva = dataSaidaEfetiva;
    }

    @Override
    public Integer getStatus()
    {
        return status;
    }

    @Override
    public void setStatus(Integer status)
    {
        this.status = status;
    }

    @Override
    public boolean isAtrasado()
    {
        return atrasado;
    }

    @Override
    public void setAtrasado(boolean atrasado)
    {
        this.atrasado = atrasado;
    }

    @Override
    public EVoo getVoo()
    {
        return voo;
    }

    @Override
    public void setVoo(EVoo voo)
    {
        this.voo = voo;
    }
    
    
}
