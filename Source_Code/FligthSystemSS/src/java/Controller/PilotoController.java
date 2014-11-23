/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Base.Persistencia.BaseController;
import DAO.PilotoDAO;
import Model.EPiloto;

/**
 *
 * @author rafael
 */
public class PilotoController extends BaseController<EPiloto, PilotoDAO>
{

    public PilotoController(PilotoDAO dao)
    {
        super(dao);
    }
}
