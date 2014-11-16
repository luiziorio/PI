/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS;

import DAO.AeroportoDAO;
import DAO.CiaAereaDAO;
import DAO.CidadeDAO;
import DAO.ContinenteDAO;
import DAO.EscalaDAO;
import DAO.PaisDAO;
import DAO.SlotDAO;
import DAO.VoohistoricoDAO;
import Entidade.Aeroporto;
import Entidade.Ciaaerea;
import Entidade.Cidade;
import Entidade.Continente;
import Entidade.Escala;
import Entidade.Pais;
import Entidade.Slot;
import Entidade.Voohistorico;
import java.util.Collection;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author rafael
 */
@WebService(serviceName = "FlightSystem_DW_SOA")
public class FlightSystem_DW_SOA
{
    /**
     * Salva um aeroporto no DW
     * @param aeroporto Aeropoto a ser salvo
     * @return TRUE se consegui salvar
     */
    @WebMethod(operationName = "salvaAeroporto")
    public boolean salvaAeroporto(@WebParam(name = "aeroporto")Aeroporto aeroporto)
    {
        return AeroportoDAO.getInstance().salva(aeroporto);
    }
    
    /**
     * Salva uma coleção de aeroportos
     * @param aeroportos Coleção de aeroportos a ser salvo
     * @return TRUE se consegui salvar
     */
    @WebMethod(operationName = "salvaAeroportos")
    public boolean salvaAeroportos(@WebParam(name = "aeroportos")Collection<Aeroporto> aeroportos)
    {
        return AeroportoDAO.getInstance().salva(aeroportos);
    }
    
    /**
     * Salva uma companhia aerea
     * @param ciaaerea companhia a ser salvo
     * @return TRUE se consegui salvar
     */
    @WebMethod(operationName = "salvaCiaAerea")
    public boolean salvaCiaAerea(@WebParam(name = "ciaaerea")Ciaaerea ciaaerea)
    {
        return CiaAereaDAO.getInstance().salva(ciaaerea);
    }
    
     /**
     * Salva uma  coleção de companhia aerea
     * @param ciaaereas coleção de companhia a ser salva
     * @return TRUE se consegui salvar
     */
    @WebMethod(operationName = "salvaCiaAereas")
    public boolean salvaCiaAereas(@WebParam(name = "ciaaereas")Collection<Ciaaerea> ciaaereas)
    {
        return CiaAereaDAO.getInstance().salva(ciaaereas);
    }
    
    /**
     * Salva uma cidade a 
     * @param cidade cidade a ser salvo
     * @return TRUE se consegui salvar
     */
    @WebMethod(operationName = "salvaCidade")
    public boolean salvaCidade(@WebParam(name = "cidade")Cidade cidade)
    {
        return CidadeDAO.getInstance().salva(cidade);
    }
    
    /**
     * Salva uma  coleção de cidades
     * @param cidades coleção de cidades a ser salvo
     * @return TRUE se consegui salvar
     */
    @WebMethod(operationName = "salvaCidades")
    public boolean salvaCidades(@WebParam(name = "cidades")Collection<Cidade> cidades)
    {
        return CidadeDAO.getInstance().salva(cidades);
    }
    
    
    /**
     * Salva um  continente
     * @param continente continente a ser salvo
     * @return TRUE se consegui salvar
     */
    @WebMethod(operationName = "salvaContinete")
    public boolean salvaContinente(@WebParam(name = "continente")Continente continente)
    {
        return ContinenteDAO.getInstance().salva(continente);
    }
    
    /**
     * Salva uma  coleção de continente
     * @param continentes coleção de continente a ser salvo
     * @return TRUE se consegui salvar
     */
    @WebMethod(operationName = "salvaContinetes")
    public boolean salvaContinentes(@WebParam(name = "continentes")Collection<Continente> continentes)
    {
        return ContinenteDAO.getInstance().salva(continentes);
    }
    
    /**
     * Salva uma  escala
     * @param escala coleção de escala a ser salvo
     * @return TRUE se consegui salvar
     */
    @WebMethod(operationName = "salvaEscala")
    public boolean salvaEscala(@WebParam(name = "escala")Escala escala)
    {
        return EscalaDAO.getInstance().salva(escala);
    }
    
    /**
     * Salva uma  coleção de escala
     * @param escalas coleção de escala a ser salvo
     * @return TRUE se consegui salvar
     */
    @WebMethod(operationName = "salvaEscalas")
    public boolean salvaEscalas(@WebParam(name = "escalas")Collection<Escala> escalas)
    {
        return EscalaDAO.getInstance().salva(escalas);
    }
    
    /**
     * Salva um pais
     * @param pais pais a ser salvo
     * @return TRUE se consegui salvar
     */
    @WebMethod(operationName = "salvaPais")
    public boolean salvaPais(@WebParam(name = "pais")Pais pais)
    {
        return PaisDAO.getInstance().salva(pais);
    }
    
    /**
     * Salva uma  coleção de paises
     * @param paises coleção de paises a ser salvo
     * @return TRUE se consegui salvar
     */
    @WebMethod(operationName = "salvaPaises")
    public boolean salvaPaises(@WebParam(name = "paises")Collection<Pais> paises)
    {
        return PaisDAO.getInstance().salva(paises);
    }
    
    /**
     * Salva um slot
     * @param slot slot a ser salvo
     * @return TRUE se consegui salvar
     */
    @WebMethod(operationName = "salvaSlot")
    public boolean salvaSlot(@WebParam(name = "slot")Slot slot)
    {
        return SlotDAO.getInstance().salva(slot);
    }
    
    /**
     * Salva uma  coleção de slots
     * @param slots coleção de slots a ser salvo
     * @return TRUE se consegui salvar
     */
    @WebMethod(operationName = "salvaSlots")
    public boolean salvaSlots(@WebParam(name = "slots")Collection<Slot> slots)
    {
        return SlotDAO.getInstance().salva(slots);
    }
    
    /**
     * Salva um voo historicos
     * @param voohistorico voo historicos a ser salvo
     * @return TRUE se consegui salvar
     */
    @WebMethod(operationName = "salvaVooHistorico")
    public boolean salvaVooHistorico(@WebParam(name = "voohistorico")Voohistorico voohistorico)
    {
        return VoohistoricoDAO.getInstance().salva(voohistorico);
    }
    
    /**
     * Salva uma  coleção de voo historicos
     * @param voohistoricos coleção de voo historicos a ser salvo
     * @return TRUE se consegui salvar
     */
    @WebMethod(operationName = "salvaVooHistoricos")
    public boolean salvaVooHistoricos(@WebParam(name = "voohistoricos")Collection<Voohistorico> voohistoricos)
    {
        return VoohistoricoDAO.getInstance().salva(voohistoricos);
    }
}
