/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;

import Bean.CidadeBean;
import Bean.CompanhiaAereaBean;
import Bean.ContinenteBean;
import Bean.PaisBean;
import Controller.CompanhiaAeriaController;
import Controller.ContinenteController;
import DAO.CompanhiaAeriaDAO;
import DAO.ContinenteDAO;
import HibernateUtility.HibernateUtility;
import Model.ECidade;
import Model.ECompanhiaAerea;
import Model.EContinente;
import Model.EPais;
import Util.ObjetosStaticos;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

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

    @Test
    public void testPais()
    {
        EPais pais = new EPais();
        PaisBean p = new PaisBean();
        
        pais.setNome("Teste1");
        for(EContinente e : ObjetosStaticos.getInstance().getContinentes() )
        {
            pais.setContinente(e);
            break;
        }
        
        p.setObjeto(pais);
        
        p.salva();
        
        for(EContinente e : ObjetosStaticos.getInstance().getContinentes() )
        {
            Integer t = e.getListaPaises().size();
            System.out.println("quantiade paises: " + t.toString());
            for(EPais ps : e.getListaPaises())
                System.out.println("Nome: " + ps.getNome());
            break;
        }
    }
    
    @Test
    public void testCidade()
    {
        ECidade cidade = new ECidade();
        CidadeBean cb = new CidadeBean();
        
        cidade.setNome("TesteCidade");
        
        for(EContinente e : ObjetosStaticos.getInstance().getContinentes() )
        {
            for(EPais p : e.getListaPaises())
            {
                cidade.setPais(p);
                break;
            }
            break;
        }
        
        cb.setObjeto(cidade);
        cb.salva();
        
        for(EContinente e : ObjetosStaticos.getInstance().getContinentes() )
        {
            System.out.println("Nome Continente: " + e.getNome());
            Integer t = e.getListaPaises().size();
            System.out.println("quantiade paises: " + t.toString());
            for(EPais ps : e.getListaPaises())
            {
                System.out.println("Nome Pais: " + ps.getNome());
                for(ECidade c : ps.getListaCidades())
                    System.out.println("Nome Cidade: " + c.getNome());
            }
        }
                
    }
    
}
