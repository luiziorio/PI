/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HibernateUtil;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rafael
 */
class HibernateSessoThread implements Runnable
{
    private final ArrayList<ICarregouXML> listaInscrito = new ArrayList<>();
    
    public void addOnCarregouXML(ICarregouXML carregou)
    {
        listaInscrito.add(carregou);
    }
    
    @Override
    public synchronized void run()
    {
        try
        {
            disparaEvento(new HibernateUtility());
            this.wait(60000);
        }
        catch (InterruptedException ex)
        {
            Logger.getLogger(HibernateSessoThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    private void disparaEvento(HibernateUtility hibernate)
    {
        listaInscrito.stream().forEach((inscrito) ->
        {
            inscrito.onCarregouXML(hibernate);
        });
    }
    
    
    
}
