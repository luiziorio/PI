/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Base.BaseController;
import DAO.ComissariaBordoDAO;
import Model.EComissariaBordo;

/**
 *
 * @author rafael
 */
public class ComissariaBordoController extends BaseController<EComissariaBordo, ComissariaBordoDAO>
{

    public ComissariaBordoController(ComissariaBordoDAO dao)
    {
        super(dao);
    }

    @Override
    protected ComissariaBordoDAO getInstanciaDAO()
    {
       return ComissariaBordoDAO.GetObjeto();
    }
    
}
