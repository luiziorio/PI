/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ANAC;

import RJThreadPool.RjThreadPool;
import pi_hibernate.Base.EBase;

/**
 *
 * @author rafaellf
 */
public class GravaAnac 
{
    private GravaAnac()
    {
        RjThreadPool.getObjeto().AddThread(anac);
    }
    
    private final ThreadAddAnac anac = new ThreadAddAnac();
    
    private static GravaAnac objeto;
    
    public static GravaAnac getObjeto()
    {
        if(objeto == null)
            objeto = new GravaAnac();
        return objeto;
    }
    
    public void saveEEntidade(EBase entidade)
    {
        anac.addEEntidadeSave(entidade);
    }            
}
