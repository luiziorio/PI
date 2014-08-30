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
public abstract class BaseVO implements IBase
{
    protected int sequencial;
    protected String codigo;

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

    @Override
    public String getCodigo()
    {
        return codigo;
    }

    @Override
    public void setCodigo(String codigo)
    {
        this.codigo = codigo;
    }
    
}
