/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_FlightSystem.Controller;

import DB_FlightSystem.Base.BaseController;
import DB_FlightSystem.Base.BaseDAO;
import DB_FlightSystem.DAO.PessoaJuridicaDAO;
import DB_FlightSystem.Entidade.EPessoaJuridica;

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
