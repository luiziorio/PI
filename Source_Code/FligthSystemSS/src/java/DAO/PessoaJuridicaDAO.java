/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Base.BaseDAO;
import Model.EPessoaJuridica;

/**
 *
 * @author rafael
 */
public class  PessoaJuridicaDAO  extends BaseDAO<EPessoaJuridica> 
{
    private static PessoaJuridicaDAO objeto;
    
    private PessoaJuridicaDAO()
    {
    }
    
    public static PessoaJuridicaDAO GetObjeto()
    {
        if (objeto == null)
        {
            objeto = new PessoaJuridicaDAO();
        }
        return objeto;
    }
    
    @Override
    protected EPessoaJuridica getInstanceEntidade()
    {
        return new EPessoaJuridica();
    }
    
}
