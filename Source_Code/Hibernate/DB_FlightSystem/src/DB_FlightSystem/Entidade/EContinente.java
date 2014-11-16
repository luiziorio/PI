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
import javax.persistence.Table;
import DB_FlightSystem.Base.EBaseNome;
/**
 *
 * @author rafael
 */
@Entity
@Table(name = "Continente")
public class EContinente extends EBaseNome  
{
   @OneToMany(fetch = FetchType.LAZY)
   private Set<EPais> listaPaises;

    
    public Set<EPais> getListaPaises()
    {
        return listaPaises;
    }

    
    public void setListaPaises(Set<EPais> listaPaises)
    {
        this.listaPaises = listaPaises;
    }

    public EContinente()
    {
    }

    public EContinente(Set<EPais> listaPaises, String nome, Integer sequencial)
    {
        super(nome, sequencial);
        this.listaPaises = listaPaises;
    }
    
}
