/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pi_hibernate.Controller;

import pi_hibernate.Base.BaseController;
import pi_hibernate.DAO.ContinenteDAO;
import pi_hibernate.IVO.IContinente;
import pi_hibernate.VO.ContinenteVO;

/**
 *
 * @author rafael
 */
public class ContinenteController extends BaseController<ContinenteVO, ContinenteDAO, IContinente>
{

    @Override
    protected ContinenteDAO GetInstanciaDAO()
    {
        return ContinenteDAO.GetObjeto();
    }
    
}
