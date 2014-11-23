/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compomentes.Dropview;

import Base.Compomente.DropViewBase;
import Controller.CompanhiaAeriaController;
import Model.ECompanhiaAerea;
import java.util.Set;

/**
 *
 * @author rafael
 */
public class DropViewCia extends DropViewBase<ECompanhiaAerea>
{
    @Override
    public Set<ECompanhiaAerea> getObjetos()
    {
        if(objetos == null)
        {
            try(CompanhiaAeriaController cac = new CompanhiaAeriaController())
            {
                objetos = cac.getAll();
            }
        }
        return objetos;
    }
}
