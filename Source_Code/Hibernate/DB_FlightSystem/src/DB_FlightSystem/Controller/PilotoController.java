/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_FlightSystem.Controller;

import DB_FlightSystem.Base.BaseController;
import DB_FlightSystem.Base.BaseDAO;
import DB_FlightSystem.DAO.PilotoDAO;
import DB_FlightSystem.Entidade.EPiloto;

/**
 *
 * @author rafael
 */
public class PilotoController extends BaseController<EPiloto, PilotoDAO>
{
    @Override
    protected PilotoDAO getInstanciaDAO()
    {
        return PilotoDAO.GetObjeto();
    }
}
