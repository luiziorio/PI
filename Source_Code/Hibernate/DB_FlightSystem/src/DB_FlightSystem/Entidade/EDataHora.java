/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_FlightSystem.Entidade;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import DB_FlightSystem.Base.EBase;


/**
 *
 * @author rafael
 */
@Entity
@Table(name = "DataHora")
public class EDataHora extends EBase  
{
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataHora;

     
    public Date getDataHora()
    {
        return dataHora;
    }

     
    public void setDataHora(Date dataHora)
    {
        this.dataHora = dataHora;
    }
}
