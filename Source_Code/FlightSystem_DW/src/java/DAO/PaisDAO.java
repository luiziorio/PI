/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidade.Pais;
import Hibernate.GenericoDAO;
import Hibernate.IHibernateUtility;

/**
 *
 * @author rafael
 */
public class PaisDAO extends GenericoDAO<Pais>
{
    @Override
    protected IHibernateUtility getHibernateInstance()
    {
        return HibernateUtility.HibernateUtility.getInstance();
    }
    
    private static PaisDAO objeto;
    
    private PaisDAO()
    {
    }
    
    public static PaisDAO getInstance()
    {
        if (objeto == null)
        {
            objeto = new PaisDAO();
        }
        return objeto;
    }   
}
