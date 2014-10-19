/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pi_hibernate.Controller;

import pi_hibernate.Base.BaseController;
import pi_hibernate.DAO.AeroportoDAO;
import pi_hibernate.IEntidade.IAeropoto;
import pi_hibernate.Entidade.EAeroporto;

/**
 *
 * @author rafaellf
 */
public class AeroportoController extends BaseController<EAeroporto, AeroportoDAO,IAeropoto>
{

    @Override
    protected AeroportoDAO getInstanciaDAO()
    {
       return AeroportoDAO.GetObjeto(); 
    }
    
}
