/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DB_FlightSystem.DAO;

import DB_FlightSystem.Base.BaseDAO;
import DB_FlightSystem.Entidade.ECidade;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author rafaellf
 */
public class CidadeDAO extends BaseDAO<ECidade>
{
    private CidadeDAO(){}
    
    private final String Q_GET_CIDADE_PELO_PAIS = "ECidade.getAllCidadePorPais";
    private final String P_GET_CIDADE_PELO_PAIS = "id";
    private static CidadeDAO objeto;
    
    public static CidadeDAO GetObjeto()
    {
        if(objeto == null)
            objeto = new CidadeDAO();
        return objeto;
    }

    @Override
    protected ECidade getInstanceEntidade()
    {
       return new ECidade();
    }
    
    public List<ECidade> getCidadePorPais(Integer paisSequencial)
    {
        List<ECidade> retorno = null;
        Session sessao = getSession();
        try
        {
            Query query = sessao.getNamedQuery(Q_GET_CIDADE_PELO_PAIS).setInteger(P_GET_CIDADE_PELO_PAIS, paisSequencial);
            retorno = query.list();
            
        }
        catch(Exception e)
        {
        }
        finally
        {
            sessao.close();
        }
        return retorno;
    }
}
