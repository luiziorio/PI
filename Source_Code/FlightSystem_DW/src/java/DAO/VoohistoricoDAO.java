/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidade.Voohistorico;
import Hibernate.GenericoDAO;
import Hibernate.IHibernateUtility;

/**
 *
 * @author rafael
 */
public class VoohistoricoDAO extends GenericoDAO<Voohistorico>
{
    @Override
    protected IHibernateUtility getHibernateInstance()
    {
        return HibernateUtility.HibernateUtility.getInstance();
    }
    
    private static VoohistoricoDAO objeto;
    
    private VoohistoricoDAO()
    {
    }
    
    public static VoohistoricoDAO getInstance()
    {
        if (objeto == null)
        {
            objeto = new VoohistoricoDAO();
        }
        return objeto;
    }
}
