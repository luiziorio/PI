/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_FlightSystem.Entidade;

import java.util.Date;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author rafael
 */
@Entity
@Table(name = "comissariaBordo")
public class EComissariaBoardo extends EFuncionario
{
    protected Set<String> curso;

    public Set<String> getCurso()
    {
        return curso;
    }

    public void setCurso(Set<String> curso)
    {
        this.curso = curso;
    }

    public EComissariaBoardo()
    {
    }

    public EComissariaBoardo(Set<String> curso, Double salario, String telefone, String email, EEndereco endereco, EUsuario usuario)
    {
        super(salario, telefone, email, endereco, usuario);
        this.curso = curso;
    }

    public EComissariaBoardo(Set<String> curso, Double salario, String sexo, Date dataNascimento, String telefone, String email, EEndereco endereco, EUsuario usuario)
    {
        super(salario, sexo, dataNascimento, telefone, email, endereco, usuario);
        this.curso = curso;
    }
    
    
}
