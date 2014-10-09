/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entidade;

import EntidadesInterface.IBase;

/**
 * Entidade base
 * @author rafaellf
 */
public abstract class BaseVO implements IBase
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
