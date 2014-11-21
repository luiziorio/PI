/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Base.EBaseNome;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author rafael
 */
@Entity
@Table(name = "PessoaBase")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class EPessoaBase extends EBaseNome
{
    @Column(length = 20)
    protected String telefone;
    @Column(length = 50)
    protected String email;
    
    @Column(length = 11)
    protected String cpfCnpj;
    
    @ManyToOne
    protected EEndereco endereco;
    
    @OneToOne(fetch = FetchType.LAZY)
    protected EUsuario usuario;

    public EPessoaBase()
    {
    }
    
    public String getTelefone()
    {
        return telefone;
    }

    public void setTelefone(String telefone)
    {
        this.telefone = telefone;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public EEndereco getEndereco()
    {
        return endereco;
    }

    public void setEndereco(EEndereco endereco)
    {
        this.endereco = endereco;
    }

    public EUsuario getUsuario()
    {
        return usuario;
    }

    public void setUsuario(EUsuario usuario)
    {
        this.usuario = usuario;
    }

    public String getCpfCnpj()
    {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj)
    {
        this.cpfCnpj = cpfCnpj;
    }

    public EPessoaBase(String telefone, String email, String cpfCnpj, EEndereco endereco, EUsuario usuario, String nome, Integer sequencial)
    {
        super(nome, sequencial);
        this.telefone = telefone;
        this.email = email;
        this.cpfCnpj = cpfCnpj;
        this.endereco = endereco;
        this.usuario = usuario;
    }

    public EPessoaBase(String telefone, String email, String cpfCnpj, EEndereco endereco, String nome, Integer sequencial)
    {
        super(nome, sequencial);
        this.telefone = telefone;
        this.email = email;
        this.cpfCnpj = cpfCnpj;
        this.endereco = endereco;
    }
}
