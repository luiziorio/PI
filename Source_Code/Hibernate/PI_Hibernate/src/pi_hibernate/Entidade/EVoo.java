/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi_hibernate.Entidade;

import pi_hibernate.Base.EBase;
import pi_hibernate.IEntidade.IVoo;

/**
 *
 * @author rafael
 */
public class EVoo extends EBase implements IVoo
{
    private ECompanhiaAeria companhia;
    private EUsuario usuario;
    private EAeronave aeronave;

    @Override
    public ECompanhiaAeria getCompanhia()
    {
        return companhia;
    }

    @Override
    public void setCompanhia(ECompanhiaAeria companhia)
    {
        this.companhia = companhia;
    }

    @Override
    public EUsuario getUsuario()
    {
        return usuario;
    }

    @Override
    public void setUsuario(EUsuario usuario)
    {
        this.usuario = usuario;
    }

    @Override
    public EAeronave getAeronave()
    {
        return aeronave;
    }

    @Override
    public void setAeronave(EAeronave aeronave)
    {
        this.aeronave = aeronave;
    }
    
}
