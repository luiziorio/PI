/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compomentes.Dropview;

import Model.EContinente;
import Model.EPais;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author rafael
 */
public class DropViewPais
{
    private EContinente continente;
    private Set<EPais> paises;

    public EContinente getContinente()
    {
        return continente;
    }

    public void setContinente(EContinente continente)
    {
        this.continente = continente;
    }
    
    public Set<EPais> getPaises()
    {
        if(continente != null && continente.getListaPaises() != null)
            paises = continente.getListaPaises();
        else
            paises = new HashSet<>();
        return paises;
    }

    public void setPaises(Set<EPais> paises)
    {
        //this.paises = paises;
    }
    
}
