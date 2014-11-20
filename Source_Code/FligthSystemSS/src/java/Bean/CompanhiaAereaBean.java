/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import Base.BaseBean;
import Controller.CompanhiaAeriaController;
import Model.ECompanhiaAerea;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import org.primefaces.model.UploadedFile;
import org.springframework.stereotype.Controller;

/**
 *
 * @author rafael
 */
@Named(value = "companhiaAereaBean")
@SessionScoped
@Controller
public class CompanhiaAereaBean extends BaseBean<CompanhiaAeriaController, ECompanhiaAerea>
{
    
    private UploadedFile file;

    public UploadedFile getFile()
    {
        return file;
    }

    public void setFile(UploadedFile file)
    {
        this.file = file;
    }

    @Override
    public void salva()
    {
        if(file != null)
            objeto.setLogoTipoCIA(file.getContents());
        super.salva(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    @Override
    protected CompanhiaAeriaController instanciaController()
    {
        return new CompanhiaAeriaController();
    }

    @Override
    protected ECompanhiaAerea instanceModel()
    {
        return new ECompanhiaAerea();
    }
    
}
