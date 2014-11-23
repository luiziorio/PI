/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Base.Persistencia.BaseController;
import DAO.PessoaFisicaDAO;
import Model.EPessoaFisica;

/**
 *
 * @author rafael
 */
public class PessoaFisicaController extends BaseController<EPessoaFisica, PessoaFisicaDAO>
{

    public PessoaFisicaController(PessoaFisicaDAO dao)
    {
        super(dao);
    }
}
