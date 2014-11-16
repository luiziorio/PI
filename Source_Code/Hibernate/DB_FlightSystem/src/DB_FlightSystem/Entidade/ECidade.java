/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DB_FlightSystem.Entidade;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import DB_FlightSystem.Base.EBaseNome;

/**
 *
 * @author rafael
 */
@Entity
@Table(name = "Cidade")
@XmlRootElement
public class ECidade extends EBaseNome
{
    private Integer fusoHorario;

    public Integer getFusoHorario()
    {
        return fusoHorario;
    }

    public void setFusoHorario(Integer fusoHorario)
    {
        this.fusoHorario = fusoHorario;
    }

    public ECidade()
    {
    }

    public ECidade(Integer fusoHorario, String nome, Integer sequencial)
    {
        super(nome, sequencial);
        this.fusoHorario = fusoHorario;
    }
    
    
    
}
