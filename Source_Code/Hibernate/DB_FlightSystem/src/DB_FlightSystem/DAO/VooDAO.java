/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_FlightSystem.DAO;

import DB_FlightSystem.Base.BaseDAO;
import DB_FlightSystem.Entidade.EVoo;

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
