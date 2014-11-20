/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import Base.BaseController;
import DAO.PaisDAO;
import Model.EPais;
import java.util.List;

/**
 *
 * @author rafaellf
 */
public class PaisController extends BaseController<EPais, PaisDAO>
{

    public PaisController(PaisDAO dao)
    {
        super(dao);
    }
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
