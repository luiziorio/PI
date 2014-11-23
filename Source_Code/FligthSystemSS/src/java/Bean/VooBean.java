/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import Base.Persistencia.BaseBean;
import Compomentes.Dropview.DropViewAeronave;
import Compomentes.Dropview.DropViewAeroporto;
import Compomentes.Dropview.DropViewCia;
import Compomentes.Dropview.DropViewCidade;
import Controller.VooController;
import Model.EEscala;
import Model.EVoo;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author rafael
 */
@Named(value = "vooBean")
@SessionScoped
public class VooBean extends BaseBean<VooController, EVoo>
{

    /**
     * Creates a new instance of VooBean
     */
    public VooBean()
    {
    }

    @Override
    protected EVoo getNewModel()
    {
        return new EVoo();
    }

    @Override
    protected VooController getNewController()
    {
        return new VooController();
    }
    
    
    private DropViewCia cia;
    private DropViewAeronave aeronave;
    private DropViewAeroporto destino;
    private DropViewAeroporto origem;

    private EEscala escala;

    public EEscala getEscala()
    {
        if(escala == null)
            escala = new EEscala();
        return escala;
    }

    public void setEscala(EEscala escala)
    {
        this.escala = escala;
    }    
    
    public DropViewCia getCia()
    {
        if(cia == null)
            cia = new DropViewCia();
        return cia;
    }

    public void setCia(DropViewCia cia)
    {
        this.cia = cia;
    }

    public DropViewAeronave getAeronave()
    {
        if(aeronave == null)
            aeronave = new DropViewAeronave();
        return aeronave;
    }

    public void setAeronave(DropViewAeronave aeronave)
    {
        this.aeronave = aeronave;
    }

    public DropViewAeroporto getDestino()
    {
        if(destino == null)
            destino = new DropViewAeroporto();
        return destino;
    }

    public void setDestino(DropViewAeroporto destino)
    {
        this.destino = destino;
    }

    public DropViewAeroporto getOrigem()
    {
        if(origem == null)
            origem = new DropViewAeroporto();
        return origem;
    }

    public void setOrigem(DropViewAeroporto origem)
    {
        this.origem = origem;
    }
}
