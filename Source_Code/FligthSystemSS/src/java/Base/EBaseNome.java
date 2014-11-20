/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Base;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * Classe que herdar de EBase, possuindo apenas o attributo nome a mais
 * Classe abstrata e base para classes de persistencia de dados
 * @author rafael
 * @version 1.0.0 
 */
@Entity
@Table(name = "basenome")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class EBaseNome extends EBase
{
    @Column(length = 50)
    protected String nome;

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public EBaseNome()
    {
    }

    public EBaseNome(String nome, Integer sequencial)
    {
        super(sequencial);
        this.nome = nome;
    }
    
    
    
    
}
