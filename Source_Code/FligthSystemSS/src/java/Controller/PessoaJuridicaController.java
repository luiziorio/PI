/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Base.Persistencia.BaseController;
import DAO.PessoaJuridicaDAO;
import Model.EPessoaJuridica;

/**
 *
 * @author rafael
 */
public class PessoaJuridicaController extends BaseController<EPessoaJuridica, PessoaJuridicaDAO>
{

    public PessoaJuridicaController(PessoaJuridicaDAO dao)
    {
        super(dao);
    }
}
