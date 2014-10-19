/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi_hibernate.IEntidade;

import java.util.Date;
import pi_hibernate.Base.IBase;
import pi_hibernate.Entidade.EAeroporto;
import pi_hibernate.Entidade.EVoo;

/**
 *
 * @author rafael
 */
public interface IEscala extends IBase
{
    EAeroporto getAerportoDestino();
    void setAerportoDestino(EAeroporto aerportoDestino);
    
    EAeroporto getAeroportoOrigem();
    void setAeroportoOrigem(EAeroporto aeroportoOrigem);
    
    Date getDataChegadaPrevista();
    void setDataChegadaPrevista(Date dataChegadaPrevista);
    
    Date getDataSaidaPrevista();
    public void setDataSaidaPrevista(Date dataSaidaPrevista);
    
    Date getDataChegadaEfetiva();
    void setDataChegadaEfetiva(Date dataChegadaEfetiva);
    
    Date getDataSaidaEfetiva();
    public void setDataSaidaEfetiva(Date dataSaidaEfetiva);
    
    Integer getStatus();
    void setStatus(Integer status);

    boolean isAtrasado();
    void setAtrasado(boolean atrasado);

    EVoo getVoo();
    void setVoo(EVoo voo);
    
}
