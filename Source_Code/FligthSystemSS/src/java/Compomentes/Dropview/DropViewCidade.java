/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compomentes.Dropview;

import Base.Compomente.DropViewBase;
import Model.ECidade;
import Model.EPais;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author rafael
 */
public class DropViewCidade extends DropViewBase<ECidade>
{
    private EPais pais;

    public EPais getPais()
    {
        return pais;
    }

    public void setPais(EPais pais)
    {
        this.pais = pais;
    }

    @Override
    public Set<ECidade> getObjetos()
    {
        if(pais != null && pais.getListaCidades() != null)
            objetos = pais.getListaCidades();
        else
            objetos = new HashSet<>();
        return objetos;
    }

    @Override
    public void setObjetos(Set<ECidade> objetos)
    {
        
    }
}
