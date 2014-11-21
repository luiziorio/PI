/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constantes;

/**
 *
 * @author rafael
 */
public class Sessao
{
   private static Sessao instancia;
   public static Sessao getInstancia()
   {
       if(instancia == null)
           instancia = new Sessao();
       return instancia;
   }
   public final String USUARIO = "USUARIO";
}
