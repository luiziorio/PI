/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DB_FlightSystem.Controller;

import DB_FlightSystem.Base.BaseController;
import DB_FlightSystem.DAO.PaisDAO;
import DB_FlightSystem.Entidade.EPais;
import java.util.List;

/**
 *
 * @author rafaellf
 */
public class PaisController extends BaseController<EPais, PaisDAO>
{
    @Override
    protected PaisDAO getInstanciaDAO()
    {
        return PaisDAO.GetObjeto();
    }
    
    public List<EPais> getAllPaisPorContinente(Integer idContinente)
    {
        return (List<EPais>)getInstanciaDAO().getAllPaisPorContinente(idContinente);
    }
    
}
