/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import DB_FlightSystem.Entidade.EUsuario;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rafael
 */
public class Util
{
    public static String encripta(String texto)
    {
        String retonro = "";
        MessageDigest algorithm;
        try
        {
            algorithm = MessageDigest.getInstance("MD5");
            byte messageDigest[] = algorithm.digest(texto.getBytes("UTF-8"));
            StringBuilder hexString = new StringBuilder();
            for (byte b : messageDigest) 
                hexString.append(String.format("%02X", 0xFF & b));
            retonro = hexString.toString();
        }
        catch (NoSuchAlgorithmException ex)
        {
            Logger.getLogger(EUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(UnsupportedEncodingException ex)
        {
            
        }
        return retonro;
    }
}
