/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Base.BaseController;
import DAO.CompanhiaAeriaDAO;
import Model.ECompanhiaAerea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author rafael
 */
@Service
public class CompanhiaAeriaController extends BaseController<ECompanhiaAerea, CompanhiaAeriaDAO>
{
    /*public CompanhiaAeriaController()
    {
    super(new CompanhiaAeriaDAO());
    }*/
    
    @Autowired
    public CompanhiaAeriaController(CompanhiaAeriaDAO dao)
    {
        super(dao);
    } 
}
