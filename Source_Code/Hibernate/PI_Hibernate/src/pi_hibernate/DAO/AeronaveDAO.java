/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi_hibernate.DAO;

import pi_hibernate.Base.BaseDAO;
import pi_hibernate.Entidade.EAeronave;

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
}
