/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;

import Bean.CompanhiaAereaBean;
import Bean.ContinenteBean;
import Controller.CompanhiaAeriaController;
import Controller.ContinenteController;
import DAO.CompanhiaAeriaDAO;
import DAO.ContinenteDAO;
import HibernateUtility.HibernateUtility;
import Model.ECompanhiaAerea;
import Model.EContinente;
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
public class Site
{
    
    public Site()
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
    
    
    @Test
    public void testCompanhiaAerea()
    {
        ECompanhiaAerea e = new ECompanhiaAerea();
        CompanhiaAeriaController cc = new  CompanhiaAeriaController(new CompanhiaAeriaDAO());
        CompanhiaAereaBean c = new CompanhiaAereaBean();
        

        e.setNome("Test");
        e.setSigla("abc");

        c.setObjeto(e);

        c.salva();
    }
    
    
    @Test
    public void testContinente()
    {
        EContinente e = new EContinente();
        ContinenteController cc = new ContinenteController(new ContinenteDAO());
        ContinenteBean cb = new ContinenteBean();
        
        e.setNome("Teste");

        cb.setObjeto(e);
        
        cb.salva();
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
