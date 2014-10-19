/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pi_hibernate.IEntidade;

import pi_hibernate.Base.IBase;
import pi_hibernate.Entidade.ECidade;
import pi_hibernate.Entidade.EContinente;
import pi_hibernate.Entidade.EPais;

/**
 *
 * @author rafaellf
 */
public interface IAeropoto extends IBase
{
    String getCodigo();
    void setCodigo(String codigo);
    
    EContinente getContinente();
    void setContinente(EContinente continente);

    EPais getPais();
    void setPais(EPais pais);

    ECidade getCidade();
    void setCidade(ECidade cidade);
}
