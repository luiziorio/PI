/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base.Persistencia;

import java.io.Serializable;
import javax.ws.rs.POST;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Classe base para os beans, aqui já possui os metodos de salvar e pesquisar simples
 * @author rafael
 * @param <T> Classe que herda de base controle
 * @param <TM> Classe que é o Model
 */
@Controller
public abstract class BaseBean < T extends BaseController, TM extends  EBase> implements Serializable
{
    
    protected TM objeto;
    protected T controller;    
    
    protected abstract TM getNewModel();
    protected abstract T getNewController();

    public TM getObjeto()
    {
        if(objeto == null)
            objeto = getNewModel();
        return objeto;
    }

    public void setObjeto(TM objeto)
    {
        this.objeto = objeto;
    }
    
  
    public void salva()
    {
        if(controller == null)
            controller = getNewController();
        controller.Salvar(objeto);
    }
}
