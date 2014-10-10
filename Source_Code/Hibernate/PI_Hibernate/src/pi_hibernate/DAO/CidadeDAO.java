/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pi_hibernate.DAO;

import pi_hibernate.Base.BaseDAO;
import pi_hibernate.Entidade.ECidade;

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
}
