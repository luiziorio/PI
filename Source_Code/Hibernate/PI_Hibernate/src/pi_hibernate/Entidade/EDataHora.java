/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi_hibernate.Entidade;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import pi_hibernate.Base.EBase;
import pi_hibernate.IEntidade.IDataHora;

/**
 *
 * @author rafael
 */
@Entity
@Table(name = "DataHora")
public class EDataHora extends EBase implements IDataHora
{
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataHora;

    @Override
    public Date getDataHora()
    {
        return dataHora;
    }

    @Override
    public void setDataHora(Date dataHora)
    {
        this.dataHora = dataHora;
    }
}
