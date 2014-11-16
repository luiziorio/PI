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

/**
 *
 * @author rafael
 */
@Entity
@Table(name = "CompanhiaAeria")
public class ECompanhiaAerea extends EBaseNome  
{
    @Column(length = 3)
    private String sigla;
    private String logoTipoCaminho;
    
    @Transient
    private Image logoTipo;
    
     
    public String getSigla()
    {
        return sigla;
    }

     
    public void setSigla(String sigla)
    {
        this.sigla = sigla;
    }

     
    public String getLogoTipoCaminho()
    {
        return logoTipoCaminho;
    }

     
    public void setLogoTipoCaminho(String logoTipoCaminho)
    {
        this.logoTipoCaminho = logoTipoCaminho;
    }

     
    public Image getLogoTipo()
    {
        return logoTipo;
    }

     
    public void setLogoTipo(Image logoTipo)
    {
        this.logoTipo = logoTipo;
    }

    public ECompanhiaAerea()
    {
    }

    public ECompanhiaAerea(String sigla, String logoTipoCaminho, Image logoTipo, String nome, Integer sequencial)
    {
        super(nome, sequencial);
        this.sigla = sigla;
        this.logoTipoCaminho = logoTipoCaminho;
        this.logoTipo = logoTipo;
    }
    
    
}
