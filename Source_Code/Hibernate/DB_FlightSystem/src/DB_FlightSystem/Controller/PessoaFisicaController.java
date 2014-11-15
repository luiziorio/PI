/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_FlightSystem.Controller;

import DB_FlightSystem.Base.BaseController;
import DB_FlightSystem.Base.BaseDAO;
import DB_FlightSystem.DAO.PessoaFisicaDAO;
import DB_FlightSystem.Entidade.EPessoaFisica;

/**
 *
 * @author rafael
 */
public class PessoaFisicaController extends BaseController<EPessoaFisica, PessoaFisicaDAO>
{
    @Override
    protected PessoaFisicaDAO getInstanciaDAO()
    {
        return PessoaFisicaDAO.GetObjeto();
    }   
}
