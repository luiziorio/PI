/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DB_FlightSystem.Base;

import java.io.Serializable;

/**
 *
 * @author 032126421
 */
public interface IBase extends Serializable
{
    int getSequencial();
    void setSequencial(int sequencial);
}
