/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compomentes.Dropview;

import Model.EContinente;
import Util.ObjetosStaticos;
import java.util.Set;

/**
 *
 * @author rafael
 */
public class DropViewContinente
{
    private EContinente continente;
    private Set<EContinente> continentes;

    public EContinente getContinente()
    {
        return continente;
    }

    public void setContinente(EContinente continente)
    {
        this.continente = continente;
    }

    public Set<EContinente> getContinentes()
    {
        if(continentes == null)
          continentes = ObjetosStaticos.getInstance().getContinentes();
        return continentes;
    }

    public void setContinentes(Set<EContinente> continentes)
    {
        //this.continentes = continentes;
    }
    
    
}
