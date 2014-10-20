/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DB_FlightSystem.IEntidade;

import java.util.Set;
import DB_FlightSystem.Base.IBaseNome;
import DB_FlightSystem.Entidade.ECidade;

/**
 *
 * @author rafael
 */
public interface IPais extends IBaseNome
{    
    Set<ECidade> getListaCidades();
    void setListaCidades(Set<ECidade> listaCidades); 
}
