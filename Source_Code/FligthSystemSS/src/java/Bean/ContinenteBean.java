/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Bean;

import Base.BaseBean;
import Controller.ContinenteController;
import Model.EContinente;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author Flavinha
 */
//Todo bean tem que herdar de beanbase
@Named(value = "continenteBean")
@SessionScoped
@Controller//Annotation do sprign para falar que ele  um controller
public class ContinenteBean extends BaseBean<ContinenteController, EContinente>
{

    @Autowired
    //Na hora que for aberta uma conexao com esse bean, o java automagicamente
    //vai preencher o contrutor
    public ContinenteBean(ContinenteController controller, EContinente model)
    {
        super(controller, model);
    }
    
}
