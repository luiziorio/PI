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
 * @author rafael
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
        criaUsuario();
    }
    
    @Test
    public void criaUsuario()
    {
        try(UsuarioController usuarioController = new UsuarioController())
        {
            EUsuario usuario = new EUsuario();
            usuario.setLogin("ABC");
            usuario.setEmail("aa@aaa.ca");
            usuario.setNome("Teste");
            usuario.setSenha("123");
            usuario.setTipo(1);
            usuarioController.Salvar(usuario);
        }
        catch(Exception e)
        {
            
        }
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
