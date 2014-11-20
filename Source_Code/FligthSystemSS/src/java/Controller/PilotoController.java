/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Base.BaseController;
import DAO.PilotoDAO;
import Model.EPiloto;

/**
 *
 * @author rafael
 */
public class PilotoController extends BaseController<EPiloto, PilotoDAO>
{
    @Override
    protected PilotoDAO getInstanciaDAO()
    {
        return PilotoDAO.GetObjeto();
    }
}
