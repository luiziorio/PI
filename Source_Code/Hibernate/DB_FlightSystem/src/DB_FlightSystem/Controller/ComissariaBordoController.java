/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_FlightSystem.Controller;

import DB_FlightSystem.Base.BaseController;
import DB_FlightSystem.DAO.ComissariaBordoDAO;
import DB_FlightSystem.Entidade.EComissariaBordo;

/**
 *
 * @author rafael
 */
public class ComissariaBordoController extends BaseController<EComissariaBordo, ComissariaBordoDAO>
{

    @Override
    protected ComissariaBordoDAO getInstanciaDAO()
    {
        return ComissariaBordoDAO.GetObjeto();
    }
    
}
