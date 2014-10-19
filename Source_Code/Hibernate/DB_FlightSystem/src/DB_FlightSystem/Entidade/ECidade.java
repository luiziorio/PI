/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pi_hibernate.Entidade;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import pi_hibernate.Base.EBaseNome;
import pi_hibernate.IEntidade.ICidade;

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
