/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Base.Persistencia.EBase;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author rafael
 */
@Entity
@Table(name = "Endereco")
@NamedQueries(
{
    @NamedQuery(name = "Model.EEndereco.getAll", query = "SELECT a FROM EEndereco a"),
})
public class EEndereco extends EBase
{
    private String rua;
    private String cep;
    
    @OneToOne
    private ECidade cidade;

    public String getRua()
    {
        return rua;
    }

    public void setRua(String rua)
    {
        this.rua = rua;
    }

    public String getCep()
    {
        return cep;
    }

    public void setCep(String cep)
    {
        this.cep = cep;
    }

    public ECidade getCidade()
    {
        return cidade;
    }

    public void setCidade(ECidade cidade)
    {
        this.cidade = cidade;
    }

    public EEndereco()
    {
    }

    public EEndereco(String rua, String cep, ECidade cidade, Integer sequencial)
    {
        super(sequencial);
        this.rua = rua;
        this.cep = cep;
        this.cidade = cidade;
    }
    
    
}
