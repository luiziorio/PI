/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Base.BaseDAO;
import Model.ECompanhiaAerea;

/**
 *
 * @author rafael
 */
public class CompanhiaAeriaDAO extends BaseDAO<ECompanhiaAerea>
{
    public CompanhiaAeriaDAO(){}
    
    /*private static CompanhiaAeriaDAO objeto;
    
    public static CompanhiaAeriaDAO GetObjeto()
    {
        if(objeto == null)
            objeto = new CompanhiaAeriaDAO();
        return objeto;
    }*/

    @Override
    protected ECompanhiaAerea getInstanceEntidade()
    {
        return new ECompanhiaAerea();
    }
}
