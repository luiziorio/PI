/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_FlightSystem.Controller;

import DB_FlightSystem.Base.BaseController;
import DB_FlightSystem.DAO.VooDAO;
import DB_FlightSystem.Entidade.EVoo;

/**
 *
 * @author rafael
 */
public class VooController extends BaseController<EVoo, VooDAO>
{

    @Override
    protected VooDAO getInstanciaDAO()
    {
        return VooDAO.GetObjeto();
    }
    
}
