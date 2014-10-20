/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_FlightSystem.Entidade;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import DB_FlightSystem.Base.EBase;
import DB_FlightSystem.IEntidade.IVoo;

/**
 *
 * @author rafael
 */
@Entity
@Table(name = "Voo")
public class EVoo extends EBase implements IVoo
{
    @OneToOne
    private ECompanhiaAeria companhia;
    @OneToOne
    private EUsuario usuario;
    @OneToOne
    private EAeronave aeronave;
    
    @OneToMany(fetch = FetchType.LAZY)
    private Set<EEscala> escalas;

    @Override
    public ECompanhiaAeria getCompanhia()
    {
        return companhia;
    }

    @Override
    public void setCompanhia(ECompanhiaAeria companhia)
    {
        this.companhia = companhia;
    }

    @Override
    public EUsuario getUsuario()
    {
        return usuario;
    }

    @Override
    public void setUsuario(EUsuario usuario)
    {
        this.usuario = usuario;
    }

    @Override
    public EAeronave getAeronave()
    {
        return aeronave;
    }

    @Override
    public void setAeronave(EAeronave aeronave)
    {
        this.aeronave = aeronave;
    }

    @Override
    public Set<EEscala> getEscalas()
    {
        return escalas;
    }

    @Override
    public void setEscalas(Set<EEscala> escalas)
    {
        this.escalas = escalas;
    }
    
}
