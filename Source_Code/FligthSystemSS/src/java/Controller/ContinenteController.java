/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import Base.BaseController;
import DAO.ContinenteDAO;
import Model.EContinente;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author rafael
 */
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
}
