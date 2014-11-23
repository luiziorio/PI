/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base.Compomente;

import java.util.Set;

/**
 *
 * @author rafael
 * @param <T>
 */
public abstract class DropViewBase<T>
{
    protected Set<T> objetos;

    public abstract Set<T> getObjetos();

    public void setObjetos(Set<T> objetos)
    {
        this.objetos = objetos;
    }
    
}
