/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compomentes.Dropview;

import Base.Compomente.DropViewBase;
import Controller.AeroportoController;
import Model.EAeroporto;
import java.util.Set;

/**
 *
 * @author rafael
 */
public class DropViewAeroporto extends DropViewBase<EAeroporto>
{

    @Override
    public Set<EAeroporto> getObjetos()
    {
        if(objetos == null)
        {
            try(AeroportoController ac = new AeroportoController())
            {
                objetos = ac.getAll();
            }
        }
        return objetos;
    }
    
}
