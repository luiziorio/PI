/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import Base.BaseDAO;
import Model.EAeroporto;
     

/**
 *
 * @author rafaellf
 */
public class AeroportoDAO extends BaseDAO<EAeroporto>
{
    private AeroportoDAO(){}
    
    private static AeroportoDAO objeto;
    
    public static AeroportoDAO GetObjeto()
    {
        if(objeto == null)
            objeto = new AeroportoDAO();
        return objeto;
    }

    @Override
    protected EAeroporto getInstanceEntidade()
    {
        return new EAeroporto();
    }
}
