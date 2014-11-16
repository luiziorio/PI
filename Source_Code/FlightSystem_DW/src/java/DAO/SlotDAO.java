/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidade.Slot;
import Hibernate.GenericoDAO;
import Hibernate.IHibernateUtility;

/**
 *
 * @author rafael
 */
public class SlotDAO extends GenericoDAO<Slot>
{
    @Override
    protected IHibernateUtility getHibernateInstance()
    {
        return HibernateUtility.HibernateUtility.getInstance();
    }
    
    private static SlotDAO objeto;
    
    private SlotDAO()
    {
    }
    
    public static SlotDAO getInstance()
    {
        if (objeto == null)
        {
            objeto = new SlotDAO();
        }
        return objeto;
    }   
}
