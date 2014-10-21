/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DB_FlightSystem.Base;

/**
 * Interface para expor dados sem precisar expor a classe
 * @author rafael
 * @version 1.0.0
 */
public interface IBaseNome extends IBase
{
    String getNome();
    void setNome(String nome);
}
