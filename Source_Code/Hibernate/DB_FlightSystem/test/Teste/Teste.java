/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Teste;

import DB_FlightSystem.Controller.UsuarioController;
import DB_FlightSystem.Entidade.EUsuario;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Flavinha
 */
public class Teste
{
    
    public Teste()
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
        teste();
    }
    
    @Test
    public void teste()
    {
        try( UsuarioController u = new UsuarioController() )
        {
            EUsuario eUsuario = new EUsuario();
            u.Salvar(eUsuario);
        }
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
