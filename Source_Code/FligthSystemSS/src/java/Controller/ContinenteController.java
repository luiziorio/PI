/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import Base.BaseController;
import DAO.ContinenteDAO;
import Model.EContinente;

/**
 *
 * @author rafael
 */
public class ContinenteController extends BaseController<EContinente, ContinenteDAO>
{

    public ContinenteController(ContinenteDAO dao)
    {
        super(dao);
    }

    @Override
    protected ContinenteDAO getInstanciaDAO()
    {
        return ContinenteDAO.GetObjeto();
    }
}
