/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_FlightSystem.Entidade;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author rafael
 */
 
@Entity
@Table(name = "PessoaFisica")
public class EPessoaFisica extends EPessoaBase
{
    protected String sexo;
    protected String cpf;
    protected String rg;
    protected Date dataNascimento;

    public EPessoaFisica()
    {
    }

    public EPessoaFisica(String telefone, String email, EEndereco endereco, EUsuario usuario)
    {
        super(telefone, email, endereco, usuario);
    }

    public EPessoaFisica(String sexo, Date dataNascimento, String telefone, String email, EEndereco endereco, EUsuario usuario)
    {
        super(telefone, email, endereco, usuario);
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
    }
    
    public String getSexo()
    {
        return sexo;
    }

    public void setSexo(String sexo)
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

    public String getCpf()
    {
        return cpf;
    }

    public void setCpf(String cpf)
    {
        this.cpf = cpf;
    }

    public String getRg()
    {
        return rg;
    }

    public void setRg(String rg)
    {
        this.rg = rg;
    }    
}
