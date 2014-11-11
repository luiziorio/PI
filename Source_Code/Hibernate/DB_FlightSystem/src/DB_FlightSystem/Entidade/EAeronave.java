/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_FlightSystem.Entidade;

import javax.persistence.Entity;
import javax.persistence.Table;
import DB_FlightSystem.Base.EBaseNome;
import java.util.List;
import javax.persistence.ManyToMany;

/**
 *
 * @author rafael
 */
@Entity
@Table(name = "Aeronave")
public class EAeronave extends EBaseNome
{
    @ManyToMany(mappedBy = "aeronaveDirigi")
    private List<EPiloto> ePilotos;
   
}
