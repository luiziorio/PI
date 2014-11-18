/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DB_FlightSystem.Controller;

import DB_FlightSystem.Base.BaseController;
import DB_FlightSystem.DAO.ContinenteDAO;
import DB_FlightSystem.Entidade.EContinente;

/**
 *
 * @author rafael
 */
public class ContinenteController extends BaseController<EContinente, ContinenteDAO>
{

    @Override
    protected ContinenteDAO getInstanciaDAO()
    {
        return ContinenteDAO.GetObjeto();
    }
    
    
    
}
