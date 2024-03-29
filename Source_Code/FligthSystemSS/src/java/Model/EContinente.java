/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import Base.Persistencia.EBaseNome;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import org.springframework.stereotype.Component;
/**
 *
 * @author rafael
 */
@Entity
@Table(name = "Continente")
@NamedQueries(
{
    @NamedQuery(name = "Model.EContinente.getAll", query = "SELECT a FROM EContinente a")
})
@Component
public class EContinente extends EBaseNome  
{
   @OneToMany(mappedBy = "continente",fetch = FetchType.EAGER)
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
        this.nome = new String();
        this.listaPaises = new HashSet<>();
    }

    public EContinente(Set<EPais> listaPaises, String nome, Integer sequencial)
    {
        super(nome, sequencial);
        this.listaPaises = listaPaises;
    }
    
}
