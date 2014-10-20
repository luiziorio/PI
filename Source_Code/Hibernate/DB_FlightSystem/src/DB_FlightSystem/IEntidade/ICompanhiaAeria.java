/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_FlightSystem.IEntidade;

import java.awt.Image;
import DB_FlightSystem.Base.IBaseNome;

/**
 *
 * @author rafael
 */
public interface ICompanhiaAeria extends IBaseNome
{
    String getSigla();
    void setSigla(String sigla);

    String getLogoTipoCaminho();
    void setLogoTipoCaminho(String logoTipoCaminho);

    Image getLogoTipo();
    void setLogoTipo(Image logoTipo);
}
