/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import Base.BaseDAO;
import HibernateUtility.HibernateUtility;
import Model.EUsuario;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

/**
 *
 * @author rafael
 */
@Repository
public class UsuarioDAO extends BaseDAO<EUsuario>
{
    private final String COMPARA_USUARIO = "EUsuario.comparaUsuario";
    private final String P_COMPARA_USUARIO = "e";
    private Object sessao;
    
    public boolean validaUsuario(EUsuario usuario)
    {
        Session s = HibernateUtility.getSession();
        try
        {
            if(usuario.getSequencial() == null)
                return false;
            EUsuario u = super.getObjeto(usuario.getSequencial());
            if(u == null)
                return false;
            return (u.getNome().equals(usuario.getNome()) && (u.getSenha() == null ? usuario.getSenha() == null : u.getSenha().equals(usuario.getSenha())));
                
        }
        catch(Exception e)
        {
            return false;
        }
    }
    
    @Override
    protected EUsuario getInstanceEntidade()
    {
       return new EUsuario();
    }
}
