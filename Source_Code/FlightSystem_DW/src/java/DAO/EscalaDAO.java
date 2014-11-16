/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidade.Escala;
import Hibernate.GenericoDAO;
import Hibernate.IHibernateUtility;

/**
 *
 * @author rafael
 */
public class EscalaDAO extends GenericoDAO<Escala>
{
    @Override
    protected IHibernateUtility getHibernateInstance()
    {
        return HibernateUtility.HibernateUtility.getInstance();
    }
    
    private static EscalaDAO objeto;
    
    private EscalaDAO()
    {
    }
    
    public static EscalaDAO getInstance()
    {
        if (objeto == null)
        {
            objeto = new EscalaDAO();
        }
        return objeto;
    }
}
