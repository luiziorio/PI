/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_FlightSystem.Controller;

import DB_FlightSystem.Base.BaseController;
import DB_FlightSystem.DAO.EscalaDAO;
import DB_FlightSystem.Entidade.EEscala;
import DB_FlightSystem.IEntidade.IEscala;

/**
 *
 * @author rafael
 */
public class EscalaController extends BaseController<EEscala,EscalaDAO,IEscala>
{

    @Override
    protected EscalaDAO getInstanciaDAO()
    {
        return EscalaDAO.GetObjeto();
    }
    
}