/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Base.BaseDAO;
import Model.EEscala;

/**
 *
 * @author rafael
 */
public class EscalaDAO extends BaseDAO<EEscala>
{
    private EscalaDAO(){}
    
    private static EscalaDAO objeto;
    
    public static EscalaDAO GetObjeto()
    {
        if(objeto == null)
            objeto = new EscalaDAO();
        return objeto;
    }

    @Override
    protected EEscala getInstanceEntidade()
    {
        return new EEscala();
    }
}
