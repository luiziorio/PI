/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi_hibernate.Entidade;

import java.awt.Image;
import pi_hibernate.Base.EBaseNome;
import pi_hibernate.IEntidade.ICompanhiaAeria;

/**
 *
 * @author rafael
 */
public class ECompanhiaAeria extends EBaseNome implements ICompanhiaAeria
{
    private String sigla;
    private String logoTipoCaminho;
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
}