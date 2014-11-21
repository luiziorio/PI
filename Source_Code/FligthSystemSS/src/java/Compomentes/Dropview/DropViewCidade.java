/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compomentes.Dropview;

import Model.ECidade;
import Model.EContinente;
import Model.EPais;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author rafael
 */
public class DropViewCidade
{
    private EPais pais;
    private Set<ECidade> cidades;

    public EPais getPais()
    {
        return pais;
    }

    public void setPais(EPais pais)
    {
        this.pais = pais;
    }

    public Set<ECidade> getCidades()
    {
        if(pais != null && pais.getListaCidades() != null)
            cidades = pais.getListaCidades();
        else
            cidades = new HashSet<>();
        return cidades;
    }

    public void setCidades(Set<ECidade> cidades)
    {
        //this.cidades = cidades;
    }
}
