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
@Table(name = "funcionario")
public abstract class EFuncionario extends EPessoaFisica
{
    protected Double salario;

    public Double getSalario()
    {
        return salario;
    }

    public void setSalario(Double salario)
    {
        this.salario = salario;
    }

    public EFuncionario()
    {
    }

    public EFuncionario(Double salario, String telefone, String email, EEndereco endereco, EUsuario usuario)
    {
        super(telefone, email, endereco, usuario);
        this.salario = salario;
    }

    public EFuncionario(Double salario, String sexo, Date dataNascimento, String telefone, String email, EEndereco endereco, EUsuario usuario)
    {
        super(sexo, dataNascimento, telefone, email, endereco, usuario);
        this.salario = salario;
    }
    
    
}
