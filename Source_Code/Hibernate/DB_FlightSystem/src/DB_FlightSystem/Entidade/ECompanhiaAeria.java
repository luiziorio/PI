/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_FlightSystem.Entidade;

import java.awt.Image;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import DB_FlightSystem.Base.EBaseNome;
import DB_FlightSystem.IEntidade.ICompanhiaAeria;

/**
 *
 * @author rafael
 */
@Entity
@Table(name = "CompanhiaAeria")
public class ECompanhiaAeria extends EBaseNome implements ICompanhiaAeria
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
}
