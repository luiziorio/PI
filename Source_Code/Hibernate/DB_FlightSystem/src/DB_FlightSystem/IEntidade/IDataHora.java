/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi_hibernate.IEntidade;

import java.util.Date;
import pi_hibernate.Base.IBase;

/**
 *
 * @author rafael
 */
public interface IDataHora extends IBase
{
    Date getDataHora();
    void setDataHora(Date dataHora);
}
