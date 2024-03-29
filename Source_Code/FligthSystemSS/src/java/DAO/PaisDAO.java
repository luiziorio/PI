/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import Base.Persistencia.BaseDAO;
import HibernateUtility.HibernateUtility;
import Model.EPais;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

/**
 *
 * @author rafaellf
 */
@Repository
public class PaisDAO extends BaseDAO<EPais>
{
    
    private static PaisDAO objeto;
    protected final String Q_GET_PAIS_PELO_CONTINETE = "EPais.getAllPaisPorContinete";
    protected final String P_GET_PAIS_PELO_CONTINETE_ID = "id";    

    @Override
    protected EPais getInstanceEntidade()
    {
        return new EPais();
    }
    
    public List<EPais> getAllPaisPorContinente(Integer idContinente)
    {
        List<EPais> retorno = null;
        Session sessao = HibernateUtility.getSession();
        try
        {
            Query query = sessao.getNamedQuery(Q_GET_PAIS_PELO_CONTINETE).setInteger(P_GET_PAIS_PELO_CONTINETE_ID, idContinente);
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
