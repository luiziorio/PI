/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import Base.BaseDAO;
import HibernateUtility.HibernateUtility;
import Model.EContinente;
import java.util.Set;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

/**
 *
 * @author rafael
 */
@Repository
public class ContinenteDAO extends BaseDAO<EContinente>
{
    @Override
    protected EContinente getInstanceEntidade()
    {
        return new EContinente();
    }
    
    public void atualizaPais(Set<EContinente> continete)
    {
        Session s = HibernateUtility.getSession();
        s.update(s);
    }
    
}
