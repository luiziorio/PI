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
import java.util.ArrayList;

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
    private ArrayList<EEscala> escalas;
    
    @OneToOne
    private EEquipe equipe;

    public EEquipe getEquipe()
    {
        return equipe;
    }

    public void setEquipe(EEquipe equipe)
    {
        this.equipe = equipe;
    }
     
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

     
    public ArrayList<EEscala> getEscalas()
    {
        return escalas;
    }

     
    public void setEscalas(ArrayList<EEscala> escalas)
    {
        this.escalas = escalas;
    }
    public  EVoo(){}

    public EVoo(ECompanhiaAerea companhia, EUsuario usuario, EAeronave aeronave, ArrayList<EEscala> escalas, EEquipe equipe)
    {
        this.companhia = companhia;
        this.usuario = usuario;
        this.aeronave = aeronave;
        this.escalas = escalas;
        this.equipe = equipe;
    }
    
}
