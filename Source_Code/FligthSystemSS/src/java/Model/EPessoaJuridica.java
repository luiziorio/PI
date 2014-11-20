/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author rafael
 */
@Entity
@Table(name = "PessoaJuridica")
public class EPessoaJuridica extends EPessoaBase
{

    protected String cnpj;
    
    public EPessoaJuridica()
    {
    }

    
    public EPessoaJuridica(String telefone, String email, EEndereco endereco, EUsuario usuario)
    {
        super(telefone, email, endereco, usuario);
    }

    public EPessoaJuridica(String telefone, String email, EEndereco endereco, EUsuario usuario,String cnpj)
    {
        this.cnpj = cnpj;
    }
    
    

    public String getCnpj()
    {
        return cnpj;
    }

    public void setCnpj(String cnpj)
    {
        this.cnpj = cnpj;
    }
    
    
}
