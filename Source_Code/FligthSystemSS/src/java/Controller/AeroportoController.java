/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import Base.BaseController;
import DAO.AeroportoDAO;
import Model.EAeroporto;

/**
 *
 * @author rafaellf
 */
public class AeroportoController extends BaseController<EAeroporto, AeroportoDAO>
{

    public AeroportoController(AeroportoDAO dao)
    {
        super(dao);
    }

    @Override
    protected AeroportoDAO getInstanciaDAO()
    {
       return AeroportoDAO.GetObjeto(); 
    }
    
}
