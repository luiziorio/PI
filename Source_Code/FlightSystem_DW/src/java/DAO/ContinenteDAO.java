/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidade.Continente;
import Hibernate.GenericoDAO;
import Hibernate.IHibernateUtility;

/**
 *
 * @author rafael
 */
public class ContinenteDAO extends GenericoDAO<Continente>
{
    
    @Override
    protected IHibernateUtility getHibernateInstance()
    {
        return HibernateUtility.HibernateUtility.getInstance();
    }
    
    private static ContinenteDAO objeto;
    
    private ContinenteDAO()
    {
    }
    
    public static ContinenteDAO getInstance()
    {
        if (objeto == null)
        {
            objeto = new ContinenteDAO();
        }
        return objeto;
    }
}
