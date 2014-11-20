/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Base.BaseController;
import DAO.EscalaDAO;
import Model.EEscala;

/**
 *
 * @author rafael
 */
public class EscalaController extends BaseController<EEscala,EscalaDAO>
{

    public EscalaController(EscalaDAO dao)
    {
        super(dao);
    }

    @Override
    protected EscalaDAO getInstanciaDAO()
    {
        return EscalaDAO.GetObjeto();
    }
    
}
