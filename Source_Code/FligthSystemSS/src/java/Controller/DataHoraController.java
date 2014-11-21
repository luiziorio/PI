/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Base.BaseController;
import DAO.DataHoraDAO;
import Model.EDataHora;
/**
 *
 * @author rafael
 */
public class DataHoraController extends BaseController<EDataHora, DataHoraDAO>
{

    public DataHoraController(DataHoraDAO dao)
    {
        super(dao);
    }
}
