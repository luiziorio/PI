/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Base.BaseDAO;
import Model.EPessoaFisica;

/**
 *
 * @author rafael
 */
public class PessoaFisicaDAO extends BaseDAO<EPessoaFisica>
{
    private static PessoaFisicaDAO objeto;

    private PessoaFisicaDAO()
    {
    }

    public static final PessoaFisicaDAO GetObjeto()
    {
        if (objeto == null)
            objeto = new PessoaFisicaDAO();
        return objeto;
    }

    @Override
    protected EPessoaFisica getInstanceEntidade()
    {
        return new EPessoaFisica();
    }
    
}
