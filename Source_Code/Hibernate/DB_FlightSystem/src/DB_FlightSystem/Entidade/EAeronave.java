/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_FlightSystem.Entidade;

import javax.persistence.Entity;
import javax.persistence.Table;
import DB_FlightSystem.Base.EBaseNome;
import DB_FlightSystem.IEntidade.IAeronave;

/**
 *
 * @author rafael
 */
@Entity
@Table(name = "Aeronave")
public class EAeronave extends EBaseNome implements IAeronave
{
    
}
