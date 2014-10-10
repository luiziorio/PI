/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pi_hibernate.Base;

/**
 *
 * @author rafaellf
 */
public abstract class EBase
{
    protected int sequencial;
    protected String codigo;

    public int getSequencial()
    {
        return sequencial;
    }

    public void setSequencial(int sequencial)
    {
        this.sequencial = sequencial;
    }
    
}
