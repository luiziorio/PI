/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pi_hibernate.IEntidade;

import java.util.HashSet;
import pi_hibernate.Base.IBaseNome;
import pi_hibernate.Entidade.ECidade;
import pi_hibernate.Entidade.EContinente;

/**
 *
 * @author rafael
 */
public interface IPais extends IBaseNome
{
    Integer getContinenteID();
    void setContinenteID(Integer continenteID);

    EContinente getContinente();
    void setContinente(EContinente continente);
    
    HashSet<ECidade> getListaCidades();
    void setListaCidades(HashSet<ECidade> listaCidades); 
}
