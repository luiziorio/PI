/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FSThreadPool;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rafaellf
 */
public class FS_ThreadPool
{
    private static FS_ThreadPool instancia;
    private FS_ThreadPool() { listaThread = new ArrayList<>(); }
    
    public static FS_ThreadPool getInstance()
    {
        if(instancia == null)
            instancia = new FS_ThreadPool();
        return instancia;
    }
    
    
    private final ArrayList<Thread> listaThread;
    private final String nameDefault = "Thread";
    
    public void addThread(Runnable runnable)
    {
        String name = nameDefault + listaThread.size();
        addThread(runnable,name);
    }
    
    public void addThread(Runnable runnable, String name)
    {
        Thread t = new Thread(runnable);
        t.setName(name);
        addThread(t);
    }
    
    public void addThread(Thread thread)
    {
        thread.start();
        listaThread.add(thread);
    }
    
    public void startAll()
    {
        listaThread.forEach(x->x.start());
    }
    
    public void stopAll()
    {
        listaThread.forEach(x->x.interrupt());
    }
    
    public void waitAll()
    {
      for(Thread thread : listaThread)
      {
          try
          {
              thread.join();
          }
          catch (InterruptedException ex)
          {
              Logger.getLogger(FS_ThreadPool.class.getName()).log(Level.SEVERE, null, ex);
          }
      }
    }
}
