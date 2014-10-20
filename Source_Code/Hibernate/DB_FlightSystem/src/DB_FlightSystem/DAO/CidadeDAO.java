/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DB_FlightSystem.DAO;

import DB_FlightSystem.Base.BaseDAO;
import DB_FlightSystem.Entidade.ECidade;

/**
 *
 * @author rafaellf
 */
public class CidadeDAO extends BaseDAO<ECidade>
{
    private CidadeDAO(){}
    
    private static CidadeDAO objeto;
    
    public static CidadeDAO GetObjeto()
    {
        if(objeto == null)
            objeto = new CidadeDAO();
        return objeto;
    }

    @Override
    protected ECidade getInstanceEntidade()
    {
       return new ECidade();
    }
}
