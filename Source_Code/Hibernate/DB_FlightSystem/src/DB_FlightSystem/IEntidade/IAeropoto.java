/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DB_FlightSystem.IEntidade;

import DB_FlightSystem.Base.IBase;
import DB_FlightSystem.Entidade.ECidade;
import DB_FlightSystem.Entidade.EContinente;
import DB_FlightSystem.Entidade.EPais;

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
