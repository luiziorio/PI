/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DB_FlightSystem.DAO;

import DB_FlightSystem.Base.BaseDAO;
import DB_FlightSystem.Entidade.EPais;

/**
 *
 * @author rafaellf
 */
public class PaisDAO extends BaseDAO<EPais>
{
    private PaisDAO(){}
    
    private static PaisDAO objeto;
    
    public static PaisDAO GetObjeto()
    {
        if(objeto == null)
            objeto = new PaisDAO();
        return objeto;
    }

    @Override
    protected EPais getInstanceEntidade()
    {
        return new EPais();
    }
}
