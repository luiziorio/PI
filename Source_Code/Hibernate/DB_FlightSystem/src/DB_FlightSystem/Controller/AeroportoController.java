/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DB_FlightSystem.Controller;

import DB_FlightSystem.Base.BaseController;
import DB_FlightSystem.DAO.AeroportoDAO;
import DB_FlightSystem.Entidade.EAeroporto;

/**
 *
 * @author rafaellf
 */
public class AeroportoController extends BaseController<EAeroporto, AeroportoDAO>
{

    @Override
    protected AeroportoDAO getInstanciaDAO()
    {
       return AeroportoDAO.GetObjeto(); 
    }
    
}
