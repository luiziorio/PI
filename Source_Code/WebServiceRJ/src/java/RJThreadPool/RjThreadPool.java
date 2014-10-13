/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RJThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author rafaellf
 */
public class RjThreadPool 
{
    private RjThreadPool()
    {
        executor = Executors.newFixedThreadPool(5);
    }
     
    private static RjThreadPool objeto;
    
    public static RjThreadPool getObjeto()
    {
        if(objeto == null)
            objeto = new RjThreadPool();
        return objeto;
    }
    
    private final ExecutorService executor;
    
    public void AddThread(Runnable runnable)
    {
        executor.execute(runnable);
    }

}
