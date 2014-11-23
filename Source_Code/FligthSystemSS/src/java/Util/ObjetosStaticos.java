/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import Controller.CidadeController;
import Controller.ContinenteController;
import Controller.PaisController;
import HibernateUtility.HibernateUtility;
import Model.EContinente;
import Model.EPais;
import java.util.Set;
import org.hibernate.Session;

/**
 *
 * @author rafael
 */
public class ObjetosStaticos
{
    private ObjetosStaticos(){}
    private static ObjetosStaticos instance;
    public static  ObjetosStaticos getInstance()
    {
        if(instance == null)
            instance = new ObjetosStaticos();
        return instance;
    }
    
    private Set<EContinente> continentes;

    public Set<EContinente> getContinentes()
    {
        if(continentes == null)
            carregaContinentes();
        return continentes;
    }
    
    public void updateContinente()
    {
        carregaContinentes();
    }
    
    private void carregaContinentes()
    {
        try(ContinenteController cc = new ContinenteController())
        {
            continentes = cc.getAll();
        }
    }
    
}
