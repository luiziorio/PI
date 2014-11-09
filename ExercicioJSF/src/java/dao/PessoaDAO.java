/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;
import model.Pessoa;
/**
 *
 * @author Flavinha
 */
public class PessoaDAO {
    
    private final Pessoa pessoa;
    
    public PessoaDAO(Pessoa pessoa){
        this.pessoa = pessoa;
        this.toString();
    }

    @Override
    public String toString() {
        return "PessoaDAO{" + "pessoa=" + pessoa + '}';
    }
    
}
