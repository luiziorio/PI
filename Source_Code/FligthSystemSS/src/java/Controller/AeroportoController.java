/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import Base.Persistencia.BaseController;
import DAO.AeroportoDAO;
import Model.EAeroporto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author rafaellf
 */
@Service
public class AeroportoController extends BaseController<EAeroporto, AeroportoDAO>
{

    public AeroportoController()
    {
        super(new AeroportoDAO());
        
    }
    @Autowired
    public AeroportoController(AeroportoDAO dao)
    {
        super(dao);
    }
}
