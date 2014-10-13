/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pi_hibernate.Entidade;

import java.util.HashSet;
import pi_hibernate.Base.EBaseNome;
import pi_hibernate.IEntidade.IContinente;

/**
 *
 * @author rafael
 */
public class EContinente extends EBaseNome implements IContinente
{
   private HashSet<EPais> listaPaises;

   @Override
    public HashSet<EPais> getListaPaises()
    {
        return listaPaises;
    }

   @Override
    public void setListaPaises(HashSet<EPais> listaPaises)
    {
        this.listaPaises = listaPaises;
    }
}
