/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_FlightSystem.DAO;

import DB_FlightSystem.Base.BaseDAO;
import DB_FlightSystem.Entidade.EEquipe;

/**
 *
 * @author rafael
 */
public class EquipeDAO extends BaseDAO<EEquipe>
{
    
    private static EquipeDAO objeto;

    private EquipeDAO()
    {
    }
    
    public static final EquipeDAO getInstance()
    {
        if (objeto == null)
            objeto = new EquipeDAO();
        return objeto;
    }

    @Override
    protected EEquipe getInstanceEntidade()
    {
        return new EEquipe();
    }

}
