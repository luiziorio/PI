/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;
import java.util.Set;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author rafael
 */
@Entity
@Table(name = "funcionario")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Disc", discriminatorType = DiscriminatorType.CHAR)
public abstract class EFuncionario extends EPessoaFisica
{
    protected Double salario;
    @OneToMany(mappedBy = "eFuncionario",fetch = FetchType.LAZY)
    protected Set<EEquipe> equipes;

    public Set<EEquipe> getEquipes()
    {
        return equipes;
    }

    public void setEquipes(Set<EEquipe> equipes)
    {
        this.equipes = equipes;
    }
    
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

    public EFuncionario(Double salario, char sexo, Date dataNascimento, String telefone, String email, String cpfCnpj, EEndereco endereco, EUsuario usuario, String nome, Integer sequencial)
    {
        super(sexo, dataNascimento, telefone, email, cpfCnpj, endereco, usuario, nome, sequencial);
        this.salario = salario;
    }

    public EFuncionario(Double salario, Set<EEquipe> equipes, char sexo, Date dataNascimento, String telefone, String email, String cpfCnpj, EEndereco endereco, EUsuario usuario, String nome, Integer sequencial)
    {
        super(sexo, dataNascimento, telefone, email, cpfCnpj, endereco, usuario, nome, sequencial);
        this.salario = salario;
        this.equipes = equipes;
    }

    public EFuncionario(Double salario, char sexo, Date dataNascimento, String telefone, String email, String cpfCnpj, EEndereco endereco, String nome, Integer sequencial)
    {
        super(sexo, dataNascimento, telefone, email, cpfCnpj, endereco, nome, sequencial);
        this.salario = salario;
    }

    public EFuncionario(Double salario, Set<EEquipe> equipes, char sexo, Date dataNascimento, String telefone, String email, String cpfCnpj, EEndereco endereco, String nome, Integer sequencial)
    {
        super(sexo, dataNascimento, telefone, email, cpfCnpj, endereco, nome, sequencial);
        this.salario = salario;
        this.equipes = equipes;
    }
}
