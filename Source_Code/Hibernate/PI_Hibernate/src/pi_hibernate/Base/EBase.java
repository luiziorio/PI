/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pi_hibernate.Base;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 *
 * @author rafaellf
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class EBase implements Serializable
{
    @Id
    protected int sequencial;


    public int getSequencial()
    {
        return sequencial;
    }

    public void setSequencial(int sequencial)
    {
        this.sequencial = sequencial;
    }
    
}
