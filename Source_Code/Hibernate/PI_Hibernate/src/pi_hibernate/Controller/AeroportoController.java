/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pi_hibernate.Controller;

import pi_hibernate.Base.BaseController;
import pi_hibernate.DAO.AeroportoDAO;
import pi_hibernate.IVO.IAeropoto;
import pi_hibernate.VO.AeroportoVO;

/**
 *
 * @author rafaellf
 */
public class AeroportoController extends BaseController<AeroportoVO, AeroportoDAO,IAeropoto>
{

    @Override
    protected AeroportoDAO GetInstanciaDAO()
    {
       return AeroportoDAO.GetObjeto(); 
    }
    
}
