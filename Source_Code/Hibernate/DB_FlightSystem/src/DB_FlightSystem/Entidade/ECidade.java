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
import DB_FlightSystem.IEntidade.ICidade;

/**
 *
 * @author rafael
 */
@Entity
@Table(name = "Cidade")
@XmlRootElement
public class ECidade extends EBaseNome implements ICidade
{
}
