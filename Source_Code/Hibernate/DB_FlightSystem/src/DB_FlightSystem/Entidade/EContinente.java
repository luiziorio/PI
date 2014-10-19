/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pi_hibernate.Entidade;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import pi_hibernate.Base.EBaseNome;
import pi_hibernate.IEntidade.IContinente;

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
