/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_FlightSystem.IEntidade;

import java.util.Set;
import DB_FlightSystem.Base.IBase;
import DB_FlightSystem.Entidade.EAeronave;
import DB_FlightSystem.Entidade.ECompanhiaAeria;
import DB_FlightSystem.Entidade.EEscala;
import DB_FlightSystem.Entidade.EUsuario;

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
    
    Set<EEscala> getEscalas();
    void setEscalas(Set<EEscala> escalas);
}
