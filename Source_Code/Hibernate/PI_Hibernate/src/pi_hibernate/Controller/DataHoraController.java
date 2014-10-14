/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi_hibernate.Controller;

import pi_hibernate.Base.BaseController;
import pi_hibernate.DAO.DataHoraDAO;
import pi_hibernate.Entidade.EDataHora;
import pi_hibernate.IEntidade.IDataHora;

/**
 *
 * @author rafael
 */
public class DataHoraController extends BaseController<EDataHora, DataHoraDAO, IDataHora>
{

    @Override
    protected DataHoraDAO getInstanciaDAO()
    {
        return DataHoraDAO.GetObjeto();
    }
    
}
