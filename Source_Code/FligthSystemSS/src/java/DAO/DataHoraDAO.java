/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Base.BaseDAO;
import Model.EDataHora;

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

    @Override
    protected EDataHora getInstanceEntidade()
    {
        return new EDataHora();
    }
    
    
}
