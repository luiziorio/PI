/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi_hibernate.Controller;

import pi_hibernate.Base.BaseController;
import pi_hibernate.DAO.CompanhiaAeriaDAO;
import pi_hibernate.Entidade.ECompanhiaAeria;
import pi_hibernate.IEntidade.ICompanhiaAeria;

/**
 *
 * @author rafael
 */
public class CompanhiaAeriaController extends BaseController<ECompanhiaAeria, CompanhiaAeriaDAO, ICompanhiaAeria>
{

    @Override
    protected CompanhiaAeriaDAO getInstanciaDAO()
    {
        return  CompanhiaAeriaDAO.GetObjeto();
    }
    
}
