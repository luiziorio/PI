/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_FlightSystem.Controller;

import DB_FlightSystem.Base.BaseController;
import DB_FlightSystem.DAO.CompanhiaAeriaDAO;
import DB_FlightSystem.Entidade.ECompanhiaAerea;

/**
 *
 * @author rafael
 */
public class CompanhiaAeriaController extends BaseController<ECompanhiaAerea, CompanhiaAeriaDAO>
{

    @Override
    protected CompanhiaAeriaDAO getInstanciaDAO()
    {
        return  CompanhiaAeriaDAO.GetObjeto();
    }
    
}
