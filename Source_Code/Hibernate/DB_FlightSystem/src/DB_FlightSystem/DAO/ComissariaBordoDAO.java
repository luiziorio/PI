/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_FlightSystem.DAO;

import DB_FlightSystem.Base.BaseDAO;
import DB_FlightSystem.Entidade.EComissariaBordo;

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
