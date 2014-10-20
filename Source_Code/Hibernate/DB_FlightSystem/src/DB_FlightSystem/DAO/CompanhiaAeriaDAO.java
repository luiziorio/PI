/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_FlightSystem.DAO;

import DB_FlightSystem.Base.BaseDAO;
import DB_FlightSystem.Entidade.ECompanhiaAeria;

/**
 *
 * @author rafael
 */
public class CompanhiaAeriaDAO extends BaseDAO<ECompanhiaAeria>
{
    private CompanhiaAeriaDAO(){}
    
    private static CompanhiaAeriaDAO objeto;
    
    public static CompanhiaAeriaDAO GetObjeto()
    {
        if(objeto == null)
            objeto = new CompanhiaAeriaDAO();
        return objeto;
    }

    @Override
    protected ECompanhiaAeria getInstanceEntidade()
    {
        return new ECompanhiaAeria();
    }
}
