/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_FlightSystem.Controller;

import DB_FlightSystem.Base.BaseController;
import DB_FlightSystem.DAO.AeronaveDAO;
import DB_FlightSystem.Entidade.EAeronave;

/**
 *
 * @author rafael
 */
public class AeronaveController extends BaseController<EAeronave, AeronaveDAO>
{

    @Override
    protected AeronaveDAO getInstanciaDAO()
    {
        return AeronaveDAO.GetObjeto();
    }
    
}
