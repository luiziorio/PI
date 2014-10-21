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
@Named(value = "aeroportoBean")
@SessionScoped
public class AeroportoBean implements Serializable
{

    /**
     * Creates a new instance of AeroportoBean
     */
    public AeroportoBean()
    {
    }
    
}
