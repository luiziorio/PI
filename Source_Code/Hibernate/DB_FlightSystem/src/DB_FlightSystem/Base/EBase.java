/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DB_FlightSystem.Base;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * Classe base ppara a persistencia de dados
 * @author rafaellf
 * @version 1.0.0
 */
@Entity
@Table(name = "base")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class EBase implements IBase, Serializable
{
    @Id @GeneratedValue
    protected int sequencial;


    @Override
    public int getSequencial()
    {
        return sequencial;
    }

    @Override
    public void setSequencial(int sequencial)
    {
        this.sequencial = sequencial;
    }
    
}
