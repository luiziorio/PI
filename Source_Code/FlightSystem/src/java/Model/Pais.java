/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import DB_FlightSystem.Entidade.ECidade;
import DB_FlightSystem.IEntidade.IPais;
import java.util.Set;

/**
 *
 * @author Flavinha
 */
public class Pais implements IPais
{
    private Set<ECidade> listaCidades;


    @Override
    public Set<ECidade> getListaCidades()
    {
        return listaCidades;
    }

    @Override
    public void setListaCidades(Set<ECidade> listaCidades)
    {
        this.listaCidades = listaCidades;
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
