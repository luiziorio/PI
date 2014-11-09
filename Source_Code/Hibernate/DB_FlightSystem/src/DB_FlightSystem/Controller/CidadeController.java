/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_FlightSystem.Controller;

import DB_FlightSystem.Base.BaseController;
import DB_FlightSystem.DAO.CidadeDAO;
import DB_FlightSystem.Entidade.ECidade;

/**
 *
 * @author rafael
 */
public class CidadeController extends BaseController<ECidade, CidadeDAO>
{

    @Override
    protected CidadeDAO getInstanciaDAO()
    {
        return CidadeDAO.GetObjeto();
    }
    
}
