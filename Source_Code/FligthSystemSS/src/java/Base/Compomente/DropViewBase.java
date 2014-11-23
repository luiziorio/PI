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
 */
public class DropViewBase<T>
{
    protected T objeto;
    protected Set<T> objetos;

    public T getObjeto()
    {
        return objeto;
    }

    public void setObjeto(T objeto)
    {
        this.objeto = objeto;
    }

    public Set<T> getObjetos()
    {
        return objetos;
    }

    public void setObjetos(Set<T> objetos)
    {
        this.objetos = objetos;
    }
    
    
    
}
