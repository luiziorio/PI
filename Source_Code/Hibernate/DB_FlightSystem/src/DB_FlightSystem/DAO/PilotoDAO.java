/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_FlightSystem.DAO;

import DB_FlightSystem.Base.BaseDAO;
import DB_FlightSystem.Entidade.EPais;
import DB_FlightSystem.Entidade.EPiloto;

/**
 *
 * @author rafael
 */
public class PilotoDAO extends BaseDAO<EPiloto>
{
    private static PilotoDAO objeto;
    
    private PilotoDAO()
    {
    }
    
    public static PilotoDAO GetObjeto()
    {
        if (objeto == null)
        {
            objeto = new PilotoDAO();
        }
        return objeto;
    }

    @Override
    protected EPiloto getInstanceEntidade()
    {
        return new EPiloto();
    }
    
}
