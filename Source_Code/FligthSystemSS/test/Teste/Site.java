/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;

import Bean.CompanhiaAereaBean;
import Bean.ContinenteBean;
import Controller.ContinenteController;
import DAO.ContinenteDAO;
import Model.ECompanhiaAerea;
import Model.EContinente;
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
    public void testCompanhiaAerea()
    {
        /*CompanhiaAereaBean c = new CompanhiaAereaBean();
        ECompanhiaAerea e = new ECompanhiaAerea();
        
        e.setNome("Test");
        e.setSigla("abc");
        
        c.setObjeto(e);
        
        c.salva();*/
    }
    
    @Test
    public void testContinente()
    {
        ContinenteDAO c = new ContinenteDAO();
        EContinente e = new EContinente();
        ContinenteController cc = new ContinenteController(c);
        ContinenteBean cb = new ContinenteBean(cc, e);
        
        e.setNome("Teste");

        cb.salva();
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
