/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Base.Persistencia.BaseController;
import DAO.AeronaveDAO;
import Model.EAeronave;

/**
 *
 * @author rafael
 */
public class AeronaveController extends BaseController<EAeronave, AeronaveDAO>
{
    public AeronaveController()
    {
        super(new AeronaveDAO());
    }

    public AeronaveController(AeronaveDAO dao)
    {
        super(dao);
    }
}
