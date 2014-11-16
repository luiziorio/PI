/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidade.Diasemana;
import Hibernate.GenericoDAO;
import Hibernate.IHibernateUtility;

/**
 *
 * @author rafael
 */
public class DiasemanaDAO extends GenericoDAO<Diasemana>
{
    @Override
    protected IHibernateUtility getHibernateInstance()
    {
        return HibernateUtility.HibernateUtility.getInstance();
    }
    
    private static DiasemanaDAO objeto;
    
    private DiasemanaDAO()
    {
    }
    
    public static DiasemanaDAO getInstance()
    {
        if (objeto == null)
        {
            objeto = new DiasemanaDAO();
        }
        return objeto;
    }
}
