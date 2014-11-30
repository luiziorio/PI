/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compomentes.Dropview;

import Base.Compomente.DropViewBase;
import Controller.AeronaveController;
import Model.EAeronave;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author rafael
 */
public class DropViewAeronave extends DropViewBase<EAeronave>
{

    @Override
    public Set<EAeronave> getObjetos()
    {
        if(objetos == null)
        {
            try(AeronaveController ac = new AeronaveController())
            {
                objetos = ac.getAll();
            }
            if(objetos == null)
                objetos = new HashSet<>();
        }
        return objetos;
    }
    
}
