/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


import Base.EBaseNome;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author rafael
 */
@Entity
@Table(name = "Equipe")
@NamedQueries(
{
    @NamedQuery(name = "EEquipe.getAll", query = "SELECT a FROM EEquipe a"),
})
public class EEquipe extends EBaseNome
{
    @OneToOne
    private EPiloto piloto;
    @OneToOne
    private EPiloto copiloto;
    
    @OneToMany
    private Set<EComissariaBordo> comissaria;
    @ManyToOne
    private EFuncionario eFuncionario;

    public EPiloto getPiloto()
    {
        return piloto;
    }

    public void setPiloto(EPiloto piloto)
    {
        this.piloto = piloto;
    }

    public EPiloto getCopiloto()
    {
        return copiloto;
    }

    public void setCopiloto(EPiloto copiloto)
    {
        this.copiloto = copiloto;
    }

    public Set<EComissariaBordo> getComissaria()
    {
        return comissaria;
    }

    public void setComissaria(Set<EComissariaBordo> comissaria)
    {
        this.comissaria = comissaria;
    }

    public EEquipe()
    {
    }

    public EEquipe(EPiloto piloto, EPiloto copiloto, Set<EComissariaBordo> comissaria)
    {
        this.piloto = piloto;
        this.copiloto = copiloto;
        this.comissaria = comissaria;
    }

    public EEquipe(String nome, EPiloto piloto, EPiloto copiloto, Set<EComissariaBordo> comissaria)
    {
        this.nome = nome;
        this.piloto = piloto;
        this.copiloto = copiloto;
        this.comissaria = comissaria;
    }
    
    
}
