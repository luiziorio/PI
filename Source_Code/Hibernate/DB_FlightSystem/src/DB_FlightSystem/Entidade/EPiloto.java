/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_FlightSystem.Entidade;

import java.util.Date;
import java.util.Set;
import javax.persistence.Entity;
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
public class EPiloto extends EFuncionario
{
    @ManyToMany
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

    public EPiloto(Set<EAeronave> aeronaveDirigi, Double salario, String telefone, String email, EEndereco endereco, EUsuario usuario)
    {
        super(salario, telefone, email, endereco, usuario);
        this.aeronaveDirigi = aeronaveDirigi;
    }

    public EPiloto(Set<EAeronave> aeronaveDirigi, Double salario, String sexo, Date dataNascimento, String telefone, String email, EEndereco endereco, EUsuario usuario)
    {
        super(salario, sexo, dataNascimento, telefone, email, endereco, usuario);
        this.aeronaveDirigi = aeronaveDirigi;
    }    
}
