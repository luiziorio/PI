/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Base.BaseController;
import DAO.PessoaJuridicaDAO;
import Model.EPessoaJuridica;

/**
 *
 * @author rafael
 */
public class PessoaJuridicaController extends BaseController<EPessoaJuridica, PessoaJuridicaDAO>
{
    @Override
    protected PessoaJuridicaDAO getInstanciaDAO()
    {
        return PessoaJuridicaDAO.GetObjeto();
    }
}
