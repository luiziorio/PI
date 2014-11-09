/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bean;

import dao.PessoaDAO;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import model.Pessoa;

/**
 *
 * @author Flavinha
 */
@Named(value = "pessoaBean")
@SessionScoped
public class PessoaBean implements Serializable {

    private Pessoa pessoa = new Pessoa();
    private PessoaDAO pessoaDAO;

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public PessoaDAO getPessoaDAO() {
        return pessoaDAO;
    }

    public void setPessoaDAO(PessoaDAO pessoaDAO) {
        this.pessoaDAO = pessoaDAO;
    }
    
    
    public PessoaBean() {
    }
    
    public String inserir(){
        pessoaDAO = new PessoaDAO(pessoa);
        String resultado = "/html/pessoasInseridas";
        return resultado;
    }
    
}
