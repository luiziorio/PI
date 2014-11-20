/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Bean;

import Base.BaseBean;
import Controller.AeroportoController;
import Model.EAeroporto;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author Flavinha
 */
@Named(value = "aeroportoBean")
@SessionScoped
public class AeroportoBean extends BaseBean<AeroportoController, EAeroporto>
{

    public AeroportoBean(AeroportoController controller, EAeroporto model)
    {
        super(controller, model);
    }
}
