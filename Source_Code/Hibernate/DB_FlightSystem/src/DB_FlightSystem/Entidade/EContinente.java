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
import DB_FlightSystem.IEntidade.IContinente;

/**
 *
 * @author rafael
 */
@Entity
@Table(name = "Continente")
public class EContinente extends EBaseNome implements IContinente
{
   @OneToMany(fetch = FetchType.LAZY)
   private Set<EPais> listaPaises;

   @Override
    public Set<EPais> getListaPaises()
    {
        return listaPaises;
    }

   @Override
    public void setListaPaises(Set<EPais> listaPaises)
    {
        this.listaPaises = listaPaises;
    }
}
