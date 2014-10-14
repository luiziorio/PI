/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi_hibernate.DAO;

import pi_hibernate.Base.BaseDAO;
import pi_hibernate.Entidade.ECompanhiaAeria;

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
}
