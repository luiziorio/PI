/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pi_hibernate.Aeroporto;

import pi_hibernate.Base.BaseDAO;

/**
 *
 * @author rafaellf
 */
class AeroportoDAO extends BaseDAO<AeroportoVO>
{
    private AeroportoDAO(){}
    
    private static AeroportoDAO objeto;
    
    public static AeroportoDAO GetObjeto()
    {
        if(objeto == null)
            objeto = new AeroportoDAO();
        return objeto;
    }
}
