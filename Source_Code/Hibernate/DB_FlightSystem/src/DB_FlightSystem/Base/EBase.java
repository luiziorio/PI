/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DB_FlightSystem.Base;

import java.io.Serializable;

/**
 * Classe base ppara a persistencia de dados
 * @author rafaellf
 * @version 1.0.0
 */
public abstract class EBase implements IBase, Serializable
{
    protected int sequencial;


    @Override
    public int getSequencial()
    {
        return sequencial;
    }

    @Override
    public void setSequencial(int sequencial)
    {
        this.sequencial = sequencial;
    }
    
}
