/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base;

import java.io.Serializable;
import javax.ws.rs.POST;

/**
 * Classe base para os beans, aqui já possui os metodos de salvar e pesquisar simples
 * @author rafael
 * @param <T> Classe que herda de base controle
 * @param <TM> Classe que é o Model
 */
public abstract class BaseBean < T extends BaseController, TM extends  EBase> implements Serializable
{
    protected TM objeto;
    private final T controller;    

    public BaseBean(T controller, TM model)
    {
        this.controller = controller;
        model = objeto;
    }
    
    public TM getObjeto()
    {
        return objeto;
    }

    public void setObjeto(TM objeto)
    {
        this.objeto = objeto;
    }
    
    @POST
    public void salva()
    {
        controller.Salvar(objeto);
    }
}