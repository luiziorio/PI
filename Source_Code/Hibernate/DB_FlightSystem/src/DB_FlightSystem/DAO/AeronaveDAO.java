/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_FlightSystem.DAO;

import DB_FlightSystem.Base.BaseDAO;
import DB_FlightSystem.Entidade.EAeronave;

/**
 *
 * @author rafael
 */
public class AeronaveDAO extends BaseDAO<EAeronave>
{
    private AeronaveDAO(){}
    
    private static AeronaveDAO objeto;
    
    public static AeronaveDAO GetObjeto()
    {
        if(objeto == null)
            objeto = new AeronaveDAO();
        return objeto;
    }

    @Override
    protected EAeronave getInstanceEntidade()
    {
        return new EAeronave();
    }
}
