/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi_hibernate.IEntidade;

import pi_hibernate.Base.IBase;
import pi_hibernate.Entidade.EAeronave;
import pi_hibernate.Entidade.ECompanhiaAeria;
import pi_hibernate.Entidade.EUsuario;

/**
 *
 * @author rafael
 */
public interface IVoo extends IBase
{
    ECompanhiaAeria getCompanhia();
    void setCompanhia(ECompanhiaAeria companhia);

    EUsuario getUsuario();
    void setUsuario(EUsuario usuario);
            
    EAeronave getAeronave();
    void setAeronave(EAeronave aeronave);
}
