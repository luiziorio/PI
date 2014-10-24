/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package HibernateUtil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author rafaellf
 */
class HibernateUtility
{
    private SessionFactory factory;
    private Configuration configuration;

    public HibernateUtility()
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

    public Session getSession()
    {
        return factory.openSession();
    }   
    
}
