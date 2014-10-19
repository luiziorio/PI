/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pi_hibernate.Base;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 *
 * @author rafael
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class EBaseNome extends EBase implements IBaseNome
{
    @Column(length = 30)
    protected String nome;

    @Override
    public String getNome()
    {
        return nome;
    }

    @Override
    public void setNome(String nome)
    {
        this.nome = nome;
    }
}
