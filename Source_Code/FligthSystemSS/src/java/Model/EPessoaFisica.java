/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author rafael
 */
 
@Entity
@Table(name = "PessoaFisica")
@DiscriminatorValue(value = "PF")
public class EPessoaFisica extends EPessoaBase
{
    @Column
    protected char sexo;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    protected Date dataNascimento;

    public char getSexo()
    {
        return sexo;
    }

    public void setSexo(char sexo)
    {
        this.sexo = sexo;
    }

    public Date getDataNascimento()
    {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento)
    {
        this.dataNascimento = dataNascimento;
    }
    
    

    public EPessoaFisica()
    {
    }

    public EPessoaFisica(char sexo, Date dataNascimento, String telefone, String email, String cpfCnpj, EEndereco endereco, EUsuario usuario, String nome, Integer sequencial)
    {
        super(telefone, email, cpfCnpj, endereco, usuario, nome, sequencial);
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
    }

    public EPessoaFisica(char sexo, Date dataNascimento, String telefone, String email, String cpfCnpj, EEndereco endereco, String nome, Integer sequencial)
    {
        super(telefone, email, cpfCnpj, endereco, nome, sequencial);
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
    }
}
