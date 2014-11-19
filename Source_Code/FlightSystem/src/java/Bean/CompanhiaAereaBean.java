/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Bean;

import Controller.CompanhiaAereaControle;
import Model.CompanhiaAerea;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import org.primefaces.model.UploadedFile;

/**
 *
 * @author Flavinha
 */
@Named(value = "companhiaAereaBean")
@SessionScoped
public class CompanhiaAereaBean extends BaseBean<CompanhiaAereaControle, CompanhiaAerea>
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
   
    /**
     * Creates a new instance of CompanhiaAereaBean
     */
    public CompanhiaAereaBean()
    {
        super();
    }
   
    public List<CompanhiaAerea> getAllCompanhia()
    {
        return getInstanciaControle().getAll();
    }
    
    public CompanhiaAerea getCompanhiaPeloId(Integer id)
    {
        return getControleInstancia().getById(id);
    }
    
    @Override
    protected CompanhiaAereaControle getControleInstancia()
    {
        return new CompanhiaAereaControle();
    }

    @Override
    protected CompanhiaAereaControle instanciaControle()
    {
        return new CompanhiaAereaControle();
    }
}
