/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import Base.Persistencia.EBase;
import java.util.Set;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author rafael
 */
@Entity
@Table(name = "Voo")
@PrimaryKeyJoinColumn(name = "sequencial")
@NamedQueries(
{
    @NamedQuery(name = "Model.EVoo.getAll", query = "SELECT a FROM EVoo a"),
})
public class EVoo extends EBase  
{
    @OneToOne
    private ECompanhiaAerea companhia;
    @OneToOne
    private EUsuario usuario;
    
    @OneToOne
    private EAeronave aeronave;
    
    
    @ManyToMany(mappedBy = "eVoos")
    private Set<EEscala> escalas;
    
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

     
    public Set<EEscala> getEscalas()
    {
        return escalas;
    }

     
    public void setEscalas(Set<EEscala> escalas)
    {
        this.escalas = escalas;
    }
    public  EVoo(){}

    public EVoo(ECompanhiaAerea companhia, EUsuario usuario, EAeronave aeronave, Set<EEscala> escalas, EEquipe equipe)
    {
        this.companhia = companhia;
        this.usuario = usuario;
        this.aeronave = aeronave;
        this.escalas = escalas;
        this.equipe = equipe;
    }
    
}
