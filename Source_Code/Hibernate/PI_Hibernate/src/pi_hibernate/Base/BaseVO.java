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
public abstract class BaseVO
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

    public String getCodigo()
    {
        return codigo;
    }

    public void setCodigo(String codigo)
    {
        this.codigo = codigo;
    }
    
}
