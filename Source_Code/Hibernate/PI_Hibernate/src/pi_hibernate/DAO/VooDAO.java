/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi_hibernate.DAO;

import pi_hibernate.Base.BaseDAO;
import pi_hibernate.Entidade.EVoo;

/**
 *
 * @author rafael
 */
public class VooDAO extends BaseDAO<EVoo>
{
    private VooDAO(){}
    
    private static VooDAO objeto;
    
    public static VooDAO GetObjeto()
    {
        if(objeto == null)
            objeto = new VooDAO();
        return objeto;
    }

    @Override
    protected EVoo getInstanceEntidade()
    {
        return new EVoo();
    }
}
