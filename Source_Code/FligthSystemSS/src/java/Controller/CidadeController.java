/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Base.BaseController;
import DAO.CidadeDAO;
import Model.ECidade;
import java.util.List;

/**
 *
 * @author rafael
 */
public class CidadeController extends BaseController<ECidade, CidadeDAO>
{

    @Override
    protected CidadeDAO getInstanciaDAO()
    {
        return CidadeDAO.GetObjeto();
    }
    
    public List<ECidade> getCidadeByPais(Integer paisSequencial)
    {
        return getInstanciaDAO().getCidadePorPais(paisSequencial);
    }
}
