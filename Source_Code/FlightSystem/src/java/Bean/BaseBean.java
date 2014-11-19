/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import Controller.BaseControle;
import DB_FlightSystem.Base.EBase;
import java.io.Serializable;

/**
 * Classe base para os beans, aqui já possui os metodos de salvar e pesquisar simples
 * @author rafael
 * @param <T> Classe que herda de base controle
 * @param <TM> Classe que é o Model
 */
public abstract class BaseBean < T extends BaseControle, TM extends  EBase> implements Serializable
{
    protected TM objeto;
    private T controle;
    
    protected abstract T instanciaControle();
    protected abstract TM instanceModel();
    
    protected T getInstanciaControle()
    {
        if(controle == null)
            controle = instanciaControle();
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

    
    /**
     *  get um instancia de um Controle
     * @return retorna uma instancia
     */
    protected abstract T getControleInstancia();
    
    public void insert()
    {
        T t = getControleInstancia();
        t.insert(objeto);
    }
}
