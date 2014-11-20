/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Base.BaseController;
import DAO.CompanhiaAeriaDAO;
import Model.ECompanhiaAerea;

/**
 *
 * @author rafael
 */
public class CompanhiaAeriaController extends BaseController<ECompanhiaAerea, CompanhiaAeriaDAO>
{
    @Override
    protected CompanhiaAeriaDAO getInstanciaDAO()
    {
        return new CompanhiaAeriaDAO();
        //return  CompanhiaAeriaDAO.GetObjeto();
    }
    
}
