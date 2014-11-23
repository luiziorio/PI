/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Base.Persistencia.BaseDAO;
import Model.EComissariaBordo;

/**
 *
 * @author rafael
 */
public class ComissariaBordoDAO extends BaseDAO<EComissariaBordo>
{
    
    private ComissariaBordoDAO(){}
    
    private static ComissariaBordoDAO objeto;
    
    public static ComissariaBordoDAO GetObjeto()
    {
        if(objeto == null)
            objeto = new ComissariaBordoDAO();
        return objeto;
    }

    @Override
    protected EComissariaBordo getInstanceEntidade()
    {
        return new EComissariaBordo();
    }
    
}
