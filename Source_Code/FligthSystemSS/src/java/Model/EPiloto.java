/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;
import java.util.Set;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author rafael
 */
@Entity
@Table(name = "Piloto")
@NamedQueries(
{
    @NamedQuery(name = "EPiloto.getAll", query = "SELECT a FROM EPiloto a"),
})
@DiscriminatorValue(value = "PI")
public class EPiloto extends EFuncionario
{
    @ManyToMany(fetch = FetchType.LAZY)
    protected Set<EAeronave> aeronaveDirigi;

    public Set<EAeronave> getAeronaveDirigi()
    {
        return aeronaveDirigi;
    }

    public void setAeronaveDirigi(Set<EAeronave> aeronaveDirigi)
    {
        this.aeronaveDirigi = aeronaveDirigi;
    }

    public EPiloto()
    {
    }

    public EPiloto(Set<EAeronave> aeronaveDirigi, Double salario, char sexo, Date dataNascimento, String telefone, String email, String cpfCnpj, EEndereco endereco, EUsuario usuario, String nome, Integer sequencial)
    {
        super(salario, sexo, dataNascimento, telefone, email, cpfCnpj, endereco, usuario, nome, sequencial);
        this.aeronaveDirigi = aeronaveDirigi;
    }

    public EPiloto(Set<EAeronave> aeronaveDirigi, Double salario, Set<EEquipe> equipes, char sexo, Date dataNascimento, String telefone, String email, String cpfCnpj, EEndereco endereco, EUsuario usuario, String nome, Integer sequencial)
    {
        super(salario, equipes, sexo, dataNascimento, telefone, email, cpfCnpj, endereco, usuario, nome, sequencial);
        this.aeronaveDirigi = aeronaveDirigi;
    }

    public EPiloto(Set<EAeronave> aeronaveDirigi, Double salario, char sexo, Date dataNascimento, String telefone, String email, String cpfCnpj, EEndereco endereco, String nome, Integer sequencial)
    {
        super(salario, sexo, dataNascimento, telefone, email, cpfCnpj, endereco, nome, sequencial);
        this.aeronaveDirigi = aeronaveDirigi;
    }

    public EPiloto(Set<EAeronave> aeronaveDirigi, Double salario, Set<EEquipe> equipes, char sexo, Date dataNascimento, String telefone, String email, String cpfCnpj, EEndereco endereco, String nome, Integer sequencial)
    {
        super(salario, equipes, sexo, dataNascimento, telefone, email, cpfCnpj, endereco, nome, sequencial);
        this.aeronaveDirigi = aeronaveDirigi;
    }
}
