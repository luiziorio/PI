/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import Base.BaseController;
import DAO.ContinenteDAO;
import Model.EContinente;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author rafael
 */
@Service //Essa classe precisa disso, pois o spring precisa saber dele para Injecao de dependencias, no sei se fazer na base resolve
public class ContinenteController extends BaseController<EContinente, ContinenteDAO>
{
    
    public ContinenteController()
    {
        super(new ContinenteDAO());
    }
    
    @Autowired
    public ContinenteController(ContinenteDAO dao)
    {
        super(dao);
    }
    
    public void updatePais(Set<EContinente> continentes)
    {
        dao.atualizaPais(continentes);
    }
}
