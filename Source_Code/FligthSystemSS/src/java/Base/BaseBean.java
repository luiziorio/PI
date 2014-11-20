/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base;

import java.io.Serializable;

/**
 * Classe base para os beans, aqui já possui os metodos de salvar e pesquisar simples
 * @author rafael
 * @param <T> Classe que herda de base controle
 * @param <TM> Classe que é o Model
 */
public abstract class BaseBean < T extends BaseController, TM extends  EBase> implements Serializable
{
    protected TM objeto;
    private T controle;
    
    protected abstract T instanciaController();
    protected abstract TM instanceModel();
    
    protected T getInstanciaControle()
    {
        if(controle == null)
            controle = instanciaController();
        return controle;
    }

    public TM getObjeto()
    {
        if(objeto == null)
            objeto = instanceModel();
        return objeto;
    }

    public void setObjeto(TM objeto)
    {
        this.objeto = objeto;
    }
    
    public void salva()
    {
        controle.Salvar(objeto);
    }
}
