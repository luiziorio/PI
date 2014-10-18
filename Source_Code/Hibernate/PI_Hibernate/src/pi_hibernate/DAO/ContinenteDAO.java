/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pi_hibernate.DAO;

import pi_hibernate.Base.BaseDAO;
import pi_hibernate.Entidade.EContinente;

/**
 *
 * @author rafael
 */
public class ContinenteDAO extends BaseDAO<EContinente>
{
    private ContinenteDAO(){}
    
    private static ContinenteDAO objeto;
    
    public static ContinenteDAO GetObjeto()
    {
        if(objeto == null)
            objeto = new ContinenteDAO();
        return objeto;
    }

    @Override
    protected EContinente getInstanceEntidade()
    {
        return new EContinente();
    }
    
}
