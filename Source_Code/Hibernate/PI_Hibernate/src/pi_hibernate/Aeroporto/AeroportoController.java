/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pi_hibernate.Aeroporto;

import pi_hibernate.Base.BaseController;

/**
 *
 * @author rafaellf
 */
public class AeroportoController extends BaseController<AeroportoVO, AeroportoDAO>
{

    @Override
    protected AeroportoDAO GetInstanciaDAO()
    {
       return AeroportoDAO.GetObjeto(); 
    }
    
}
