/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_FlightSystem.IEntidade;

import java.util.Date;
import DB_FlightSystem.Base.IBase;

/**
 *
 * @author rafael
 */
public interface IDataHora extends IBase
{
    Date getDataHora();
    void setDataHora(Date dataHora);
}
