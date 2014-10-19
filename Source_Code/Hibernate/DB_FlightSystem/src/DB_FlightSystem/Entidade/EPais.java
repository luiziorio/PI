/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pi_hibernate.Entidade;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import pi_hibernate.Base.EBaseNome;
import pi_hibernate.IEntidade.IPais;

/**
 *
 * @author rafael
 */
@Entity
@Table(name = "Pais")
public class EPais extends EBaseNome implements IPais
{
    @OneToMany (fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<ECidade> listaCidades;


    @Override
    public Set<ECidade> getListaCidades()
    {
        return listaCidades;
    }

    @Override
    public void setListaCidades(Set<ECidade> listaCidades)
    {
        this.listaCidades = listaCidades;
    }
    
}
