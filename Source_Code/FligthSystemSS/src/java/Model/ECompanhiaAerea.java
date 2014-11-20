/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Base.EBaseNome;
import java.awt.Image;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import org.springframework.stereotype.Component;

/**
 *
 * @author rafael
 */
@Entity
@Table(name = "CompanhiaAeria")
@NamedQueries(
{
    @NamedQuery(name = "ECompanhiaAerea.getAll", query = "SELECT a FROM ECompanhiaAerea a")
})
@Component
public class ECompanhiaAerea extends EBaseNome  
{
    
    @Column(length = 3)
    protected String sigla;
    
    @Lob
    protected byte[] logoTipoCIA;
    
    @Transient
    private Image logoTipo;

    public byte[] getLogoTipoCIA()
    {
        return logoTipoCIA;
    }

    public void setLogoTipoCIA(byte[] logoTipoCIA)
    {
        this.logoTipoCIA = logoTipoCIA;
    }
    
    public String getSigla()
    {
        return sigla;
    }

     
    public void setSigla(String sigla)
    {
        this.sigla = sigla;
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

    public ECompanhiaAerea(String sigla, String nome, Integer sequencial)
    {
        super(nome, sequencial);
        this.sigla = sigla;
    }

    public ECompanhiaAerea(String sigla, byte[] logoTipoCIA, String nome, Integer sequencial)
    {
        super(nome, sequencial);
        this.sigla = sigla;
        this.logoTipoCIA = logoTipoCIA;
    }
}
