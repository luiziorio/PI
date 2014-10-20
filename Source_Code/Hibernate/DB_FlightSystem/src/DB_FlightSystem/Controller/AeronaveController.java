/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_FlightSystem.Controller;

import DB_FlightSystem.Base.BaseController;
import DB_FlightSystem.DAO.AeronaveDAO;
import DB_FlightSystem.Entidade.EAeronave;
import DB_FlightSystem.IEntidade.IAeronave;

/**
 *
 * @author rafael
 */
public class AeronaveController extends BaseController<EAeronave, AeronaveDAO, IAeronave>
{

    @Override
    protected AeronaveDAO getInstanciaDAO()
    {
        return AeronaveDAO.GetObjeto();
    }
    
}
