/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidade.Aeroporto;
import Hibernate.GenericoDAO;
import Hibernate.IHibernateUtility;

/**
 *
 * @author rafael
 */
public class AeroportoDAO extends GenericoDAO<Aeroporto>
{
    private static AeroportoDAO objeto;
    
    private AeroportoDAO()
    {
    }
    
    public static AeroportoDAO getInstance()
    {
        if (objeto == null)
        {
            objeto = new AeroportoDAO();
        }
        return objeto;
    }

    @Override
    protected IHibernateUtility getHibernateInstance()
    {
        return HibernateUtility.HibernateUtility.getInstance();
    }
}
