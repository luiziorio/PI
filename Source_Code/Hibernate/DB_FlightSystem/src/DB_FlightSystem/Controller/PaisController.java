/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pi_hibernate.Controller;

import pi_hibernate.Base.BaseController;
import pi_hibernate.DAO.PaisDAO;
import pi_hibernate.Entidade.EPais;
import pi_hibernate.IEntidade.IPais;

/**
 *
 * @author rafaellf
 */
public class PaisController extends BaseController<EPais, PaisDAO, IPais>
{
    @Override
    protected PaisDAO getInstanciaDAO()
    {
        return PaisDAO.GetObjeto();
    }
    
}
