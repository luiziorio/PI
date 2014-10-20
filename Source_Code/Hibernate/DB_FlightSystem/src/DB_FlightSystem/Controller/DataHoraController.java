/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_FlightSystem.Controller;

import DB_FlightSystem.Base.BaseController;
import DB_FlightSystem.DAO.DataHoraDAO;
import DB_FlightSystem.Entidade.EDataHora;
import DB_FlightSystem.IEntidade.IDataHora;

/**
 *
 * @author rafael
 */
public class DataHoraController extends BaseController<EDataHora, DataHoraDAO, IDataHora>
{

    @Override
    protected DataHoraDAO getInstanciaDAO()
    {
        return DataHoraDAO.GetObjeto();
    }
    
}
