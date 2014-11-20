/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Base.BaseController;
import DAO.EnderecoDAO;
import Model.EEndereco;

/**
 *
 * @author rafael
 */
public class EnderecoController extends BaseController<EEndereco, EnderecoDAO>
{

    public EnderecoController(EnderecoDAO dao)
    {
        super(dao);
    }
    @Override
    protected EnderecoDAO getInstanciaDAO()
    {
        return EnderecoDAO.GetObjeto();
    }
}
