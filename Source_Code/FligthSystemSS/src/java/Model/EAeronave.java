/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Base.Persistencia.EBaseNome;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author rafael
 */
@Entity
@Table(name = "Aeronave")

@NamedQueries(
{
    @NamedQuery(name = "Model.EAeronave.getAll", query = "SELECT a FROM EAeronave a"),
})
public class EAeronave extends EBaseNome
{
    @ManyToMany(mappedBy = "aeronaveDirigi")
    private List<EPiloto> ePilotos;

    public List<EPiloto> getePilotos()
    {
        return ePilotos;
    }

    public void setePilotos(List<EPiloto> ePilotos)
    {
        this.ePilotos = ePilotos;
    }

    public EAeronave()
    {
    }
    
    public EAeronave(Integer sequencial,String nome ,List<EPiloto> ePilotos)
    {
        this.sequencial = sequencial;
        this.nome = nome;
        this.ePilotos = ePilotos;
    }

    public EAeronave(List<EPiloto> ePilotos)
    {
        this.ePilotos = ePilotos;
    }
   
    
}
