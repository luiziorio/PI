/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Base.Persistencia.BaseController;
import DAO.CidadeDAO;
import Model.ECidade;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author rafael
 */
@Service
public class CidadeController extends BaseController<ECidade, CidadeDAO>
{

    public CidadeController()
    {
        super(new CidadeDAO());
    }
    
    @Autowired
    public CidadeController(CidadeDAO dao)
    {
        super(dao);
    }
    
    public List<ECidade> getCidadeByPais(Integer paisSequencial)
    {
        return dao.getCidadePorPais(paisSequencial);
    }
}
