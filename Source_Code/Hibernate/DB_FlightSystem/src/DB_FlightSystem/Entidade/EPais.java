/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DB_FlightSystem.Entidade;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import DB_FlightSystem.Base.EBaseNome;


/**
 *
 * @author rafael
 */
@Entity
@Table(name = "Pais")
public class EPais extends EBaseNome  
{
    @OneToMany (fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<ECidade> listaCidades;


     
    public Set<ECidade> getListaCidades()
    {
        return listaCidades;
    }

     
    public void setListaCidades(Set<ECidade> listaCidades)
    {
        this.listaCidades = listaCidades;
    }

    public EPais()
    {
    }

    public EPais(Set<ECidade> listaCidades, String nome, Integer sequencial)
    {
        super(nome, sequencial);
        this.listaCidades = listaCidades;
    }
    
    
    
}
