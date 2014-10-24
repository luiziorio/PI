/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_FlightSystem.Entidade;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import DB_FlightSystem.Base.EBase;

/**
 *
 * @author rafael
 */
@Entity
@Table(name = "Voo")
public class EVoo extends EBase  
{
    @OneToOne
    private ECompanhiaAerea companhia;
    @OneToOne
    private EUsuario usuario;
    @OneToOne
    private EAeronave aeronave;
    
    @OneToMany(fetch = FetchType.LAZY)
    private Set<EEscala> escalas;

     
    public ECompanhiaAerea getCompanhia()
    {
        return companhia;
    }

     
    public void setCompanhia(ECompanhiaAerea companhia)
    {
        this.companhia = companhia;
    }

     
    public EUsuario getUsuario()
    {
        return usuario;
    }

     
    public void setUsuario(EUsuario usuario)
    {
        this.usuario = usuario;
    }

     
    public EAeronave getAeronave()
    {
        return aeronave;
    }

     
    public void setAeronave(EAeronave aeronave)
    {
        this.aeronave = aeronave;
    }

     
    public Set<EEscala> getEscalas()
    {
        return escalas;
    }

     
    public void setEscalas(Set<EEscala> escalas)
    {
        this.escalas = escalas;
    }
    
}
