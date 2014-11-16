/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidade.Cidade;
import Hibernate.GenericoDAO;
import Hibernate.IHibernateUtility;

/**
 *
 * @author rafael
 */
public class CidadeDAO extends GenericoDAO<Cidade>
{
    
    @Override
    protected IHibernateUtility getHibernateInstance()
    {
        return HibernateUtility.HibernateUtility.getInstance();
    }
    
    private static CidadeDAO objeto;
    
    private CidadeDAO()
    {
    }
    
    public static CidadeDAO getInstance()
    {
        if (objeto == null)
        {
            objeto = new CidadeDAO();
        }
        return objeto;
    }
}
