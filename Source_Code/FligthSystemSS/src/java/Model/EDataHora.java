/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Base.EBase;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;


/**
 *
 * @author rafael
 */
@Entity
@Table(name = "DataHora")
@NamedQueries(
{
    @NamedQuery(name = "EDataHora.getAll", query = "SELECT a FROM EDataHora a"),
})
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

    public EDataHora()
    {
    }

    public EDataHora(Date dataHora, Integer sequencial)
    {
        super(sequencial);
        this.dataHora = dataHora;
    }
    
    
}
