/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ANAC;

import java.util.ArrayList;
import pi_hibernate.Base.EBase;

/**
 *
 * @author rafaellf
 */
class ThreadAddAnac implements Runnable
{
    private ArrayList<EBase> listaSave;
    private boolean stopThread = false;
    
    synchronized void addEEntidadeSave(EBase obj)
    {
        boolean wakeUp = listaSave.isEmpty();
        listaSave.add(obj);
        if(wakeUp)
            this.notify();
    }
    
    
    @Override
    public synchronized void run()
    {
        while(!stopThread)
        {
            try
            {
                executeSave();
                if(listaSave.isEmpty())
                    this.wait();
            }
            catch(InterruptedException e)
            {

            }
        }
    }
    
    private void executeSave()
    {
        for (EBase listaSave1 : listaSave)
        {
        }
    }
    
    void stopThread()
    {
        stopThread = true;
        this.notify();
    }
    
}
