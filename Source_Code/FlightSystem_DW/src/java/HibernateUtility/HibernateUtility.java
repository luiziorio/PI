/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package HibernateUtility;

import Hibernate.IHibernateUtility;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author rafaellf
 */
public class HibernateUtility implements IHibernateUtility
{
    private SessionFactory factory;
    private Configuration configuration;

    private HibernateUtility()
    {
        try
        {
            configuration = new Configuration().configure();
            //configuration.setProperty("hibernate.connection.username", "root");
            factory = configuration.buildSessionFactory();
        }
        catch (Exception e) 
        {
            e.printStackTrace();
            factory = null;
        }
    }
    
    private static HibernateUtility instance;
    
    public static HibernateUtility getInstance()
    {
        if(instance == null)
            instance = new HibernateUtility();
        return instance;
    }

    @Override
    public Session getSession()
    {
        return factory.openSession();
    }   
    
}
