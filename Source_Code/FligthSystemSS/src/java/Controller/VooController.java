/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Base.BaseController;
import DAO.VooDAO;
import Model.EVoo;

/**
 *
 * @author rafael
 */
public class VooController extends BaseController<EVoo, VooDAO>
{

    @Override
    protected VooDAO getInstanciaDAO()
    {
        return VooDAO.GetObjeto();
    }
    
}
