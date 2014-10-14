/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi_hibernate.DAO;

import pi_hibernate.Base.BaseDAO;
import pi_hibernate.Entidade.EDataHora;

/**
 *
 * @author rafael
 */
public class DataHoraDAO extends BaseDAO<EDataHora>
{
     private DataHoraDAO(){}
    
    private static DataHoraDAO objeto;
    
    public static DataHoraDAO GetObjeto()
    {
        if(objeto == null)
            objeto = new DataHoraDAO();
        return objeto;
    }
}