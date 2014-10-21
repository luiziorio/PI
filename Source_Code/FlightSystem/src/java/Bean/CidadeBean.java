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
@Named(value = "cidadeBean")
@SessionScoped
public class CidadeBean implements Serializable
{

    /**
     * Creates a new instance of CidadeBean
     */
    public CidadeBean()
    {
    }
    
}
