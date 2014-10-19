/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi_hibernate.Controller;

import pi_hibernate.Base.BaseController;
import pi_hibernate.DAO.EscalaDAO;
import pi_hibernate.Entidade.EEscala;
import pi_hibernate.IEntidade.IEscala;

/**
 *
 * @author rafael
 */
public class EscalaController extends BaseController<EEscala,EscalaDAO,IEscala>
{

    @Override
    protected EscalaDAO getInstanciaDAO()
    {
        return EscalaDAO.GetObjeto();
    }
    
}
