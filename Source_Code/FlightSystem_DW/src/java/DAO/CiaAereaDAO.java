/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidade.Ciaaerea;
import Hibernate.GenericoDAO;
import Hibernate.IHibernateUtility;

/**
 *
 * @author rafael
 */
public class CiaAereaDAO extends GenericoDAO<Ciaaerea>
{
    @Override
    protected IHibernateUtility getHibernateInstance()
    {
        return HibernateUtility.HibernateUtility.getInstance();
    }
    
    private static CiaAereaDAO objeto;
    
    private CiaAereaDAO()
    {
    }
    
    public static CiaAereaDAO getInstance()
    {
        if (objeto == null)
        {
            objeto = new CiaAereaDAO();
        }
        return objeto;
    }
}
