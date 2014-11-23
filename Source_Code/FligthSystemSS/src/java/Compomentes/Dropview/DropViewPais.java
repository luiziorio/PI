/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compomentes.Dropview;

import Base.Compomente.DropViewBase;
import Model.EContinente;
import Model.EPais;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author rafael
 */
public class DropViewPais extends DropViewBase<EPais>
{
    private EContinente continente;

    public EContinente getContinente()
    {
        return continente;
    }

    public void setContinente(EContinente continente)
    {
        this.continente = continente;
    }
    
    @Override
    public Set<EPais> getObjetos()
    {
        if(continente != null && continente.getListaPaises() != null)
            objetos = continente.getListaPaises();
        else
            objetos = new HashSet<>();
        return objetos;
    }

    @Override
    public void setObjetos(Set<EPais> objetos)
    {
        
    }

}
