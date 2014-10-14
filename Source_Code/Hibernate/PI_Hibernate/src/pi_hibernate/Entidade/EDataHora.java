/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi_hibernate.Entidade;

import java.util.Date;
import pi_hibernate.Base.EBase;
import pi_hibernate.IEntidade.IDataHora;

/**
 *
 * @author rafael
 */
public class EDataHora extends EBase implements IDataHora
{
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
