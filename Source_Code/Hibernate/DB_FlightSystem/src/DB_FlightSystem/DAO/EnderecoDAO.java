/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_FlightSystem.DAO;

import DB_FlightSystem.Base.BaseDAO;
import DB_FlightSystem.Entidade.EEndereco;

/**
 *
 * @author rafael
 */
public class EnderecoDAO extends BaseDAO<EEndereco>
{
    
    private EnderecoDAO(){}
    
    private static EnderecoDAO objeto;
    
    public static EnderecoDAO GetObjeto()
    {
        if(objeto == null)
            objeto = new EnderecoDAO();
        return objeto;
    }
    
    @Override
    protected EEndereco getInstanceEntidade()
    {
        return new EEndereco();
    }
    
}
