/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;

import HibernateUtility.HibernateUtility;
import Model.EContinente;
import Util.ObjetosStaticos;
import java.util.List;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rafael
 */
public class Hibernate
{
    
    public Hibernate()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }

    
    @Test
    public void testConexao()
    {
        Session s = HibernateUtility.getSession();
        Transaction t = s.getTransaction();
        t.begin();
        
        t.commit();
        s.close();
    }
    
    //@Test
    public void testGetContinente()
    {
        Set<EContinente> c = ObjetosStaticos.getInstance().getContinentes();
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
