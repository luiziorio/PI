/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import DB_FlightSystem.Entidade.ECidade;
import DB_FlightSystem.Entidade.EContinente;
import DB_FlightSystem.Entidade.EPais;
import DB_FlightSystem.IEntidade.IAeropoto;
/**
 *
 * @author Flavinha
 */
public class Aeroporto implements IAeropoto
{
    private String codigo;
    private EContinente continente;
    private EPais pais;
    private ECidade cidade;

    @Override
    public String getCodigo()
    {
        return codigo;
    }

    @Override
    public void setCodigo(String codigo)
    {
        this.codigo = codigo;
    }

    @Override
    public EContinente getContinente()
    {
        return continente;
    }

    @Override
    public void setContinente(EContinente continente)
    {
        this.continente = continente;
    }

    @Override
    public EPais getPais()
    {
        return pais;
    }

    @Override
    public void setPais(EPais pais)
    {
        this.pais = pais;
    }

    @Override
    public ECidade getCidade()
    {
        return cidade;
    }

    @Override
    public void setCidade(ECidade cidade)
    {
        this.cidade = cidade;
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
