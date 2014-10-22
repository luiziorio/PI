/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import DB_FlightSystem.IEntidade.ICompanhiaAeria;
import java.awt.Image;
import javax.persistence.Column;
import javax.persistence.Transient;

/**
 *
 * @author Flavinha
 */
public class CompanhiaAerea implements ICompanhiaAeria
{
    @Column(length = 3)
    private String sigla;
    private String logoTipoCaminho;
    
    @Transient
    private Image logoTipo;
    
    @Override
    public String getSigla()
    {
        return sigla;
    }

    @Override
    public void setSigla(String sigla)
    {
        this.sigla = sigla;
    }

    @Override
    public String getLogoTipoCaminho()
    {
        return logoTipoCaminho;
    }

    @Override
    public void setLogoTipoCaminho(String logoTipoCaminho)
    {
        this.logoTipoCaminho = logoTipoCaminho;
    }

    @Override
    public Image getLogoTipo()
    {
        return logoTipo;
    }

    @Override
    public void setLogoTipo(Image logoTipo)
    {
        this.logoTipo = logoTipo;
    }

    @Override
    public String getNome()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNome(String nome)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getSequencial()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setSequencial(int sequencial)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
