/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compomentes.Dropview;

import Base.Compomente.DropViewBase;
import Model.EContinente;
import Util.ObjetosStaticos;
import java.util.Set;

/**
 *
 * @author rafael
 */
public class DropViewContinente extends DropViewBase<EContinente>
{
    @Override
    public Set<EContinente> getObjetos()
    {
        if(objetos == null)
          objetos = ObjetosStaticos.getInstance().getContinentes();
        return objetos;
    }
}
