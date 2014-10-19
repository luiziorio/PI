/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi_hibernate.Controller;

import pi_hibernate.Base.BaseController;
import pi_hibernate.DAO.AeronaveDAO;
import pi_hibernate.Entidade.EAeronave;
import pi_hibernate.IEntidade.IAeronave;

/**
 *
 * @author rafael
 */
public class AeronaveController extends BaseController<EAeronave, AeronaveDAO, IAeronave>
{

    @Override
    protected AeronaveDAO getInstanciaDAO()
    {
        return AeronaveDAO.GetObjeto();
    }
    
}
