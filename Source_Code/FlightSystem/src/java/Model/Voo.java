/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import DB_FlightSystem.Entidade.EAeronave;
import DB_FlightSystem.Entidade.ECompanhiaAeria;
import DB_FlightSystem.Entidade.EEscala;
import DB_FlightSystem.Entidade.EUsuario;
import DB_FlightSystem.IEntidade.IVoo;
import java.util.Set;

/**
 *
 * @author Flavinha
 */
public class Voo implements IVoo
{

    private ECompanhiaAeria companhia;
    private EUsuario usuario;
    private EAeronave aeronave;
    private Set<EEscala> escalas;

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

    @Override
    public Set<EEscala> getEscalas()
    {
        return escalas;
    }

    @Override
    public void setEscalas(Set<EEscala> escalas)
    {
        this.escalas = escalas;
    }

    @Override
    public int getSequencial()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setSequencial(int sequencial)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
