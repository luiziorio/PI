/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import Base.Persistencia.BaseController;
import DAO.PaisDAO;
import Model.EPais;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author rafaellf
 */
@Service
public class PaisController extends BaseController<EPais, PaisDAO>
{

    public PaisController()
    {
        super(new PaisDAO());
    }
    
    @Autowired
    public PaisController(PaisDAO dao)
    {
        super(dao);
    }

    public List<EPais> getAllPaisPorContinente(Integer idContinente)
    {
        return (List<EPais>)dao.getAllPaisPorContinente(idContinente);
    }
    
}
