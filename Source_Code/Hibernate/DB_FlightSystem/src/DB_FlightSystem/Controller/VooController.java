/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi_hibernate.Controller;

import pi_hibernate.Base.BaseController;
import pi_hibernate.DAO.VooDAO;
import pi_hibernate.Entidade.EVoo;
import pi_hibernate.IEntidade.IVoo;

/**
 *
 * @author rafael
 */
public class VooController extends BaseController<EVoo, VooDAO, IVoo>
{

    @Override
    protected VooDAO getInstanciaDAO()
    {
        return VooDAO.GetObjeto();
    }
    
}
