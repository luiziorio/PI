/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Bean;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author Flavinha
 */
@Named(value = "aeronaveBean")
@SessionScoped
public class AeronaveBean implements Serializable
{

    
    /**
     * Creates a new instance of AeronaveBean
     */
    public AeronaveBean()
    {
    }
    
}
