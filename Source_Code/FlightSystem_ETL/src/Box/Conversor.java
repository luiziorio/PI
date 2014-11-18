/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Box;

import DB_FlightSystem.Entidade.EAeroporto;
import DB_FlightSystem.Entidade.ECidade;
import DB_FlightSystem.Entidade.ECompanhiaAerea;
import DB_FlightSystem.Entidade.EContinente;
import DB_FlightSystem.Entidade.EEscala;
import DB_FlightSystem.Entidade.EPais;
import DB_FlightSystem.Entidade.EVoo;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import ws.Aeroporto;
import ws.Ciaaerea;
import ws.Cidade;
import ws.Continente;
import ws.Diasemana;
import ws.Escala;
import ws.Pais;
import ws.Slot;
import ws.Voohistorico;

/**
 * Classe responsavel por fazer a magica de conversão
 * @author rafael
 */
public class Conversor
{           
    private Diasemana getDiaSemana(Date date)
    {
        return new Diasemana();
    }
    
    public Aeroporto converteAeroporto(EAeroporto e,Cidade cidade)
    {
        Aeroporto retorno = new Aeroporto();      
        
        retorno.setAeroportonome(e.getNome());
        retorno.setIdaeroporto(e.getSequencial().toString());
        retorno.setIdcidade(cidade);
        
        return retorno;
    }
    
    public Cidade convertCidade(ECidade cidade,Pais pais)
    {
        Cidade retorno = new Cidade();
        
        retorno.setIdpais(pais);
        retorno.setCidadenome(cidade.getNome());
        retorno.setIdcidade(cidade.getSequencial());
        
        return retorno;
    }
    
    public Pais convertPais(EPais ePais,Continente continente)
    {
        Pais retorno = new Pais();
        
        retorno.setIdcontinente(continente);
        retorno.setIdpais(ePais.getSequencial());
        retorno.setPaisnome(ePais.getNome());
        
        return retorno;
    }
    
    public Continente convertContinente(EContinente eContinente)
    {
        Continente retorno = new Continente();
        
        retorno.setContinentenome(eContinente.getNome());
        retorno.setIdcontinente(eContinente.getSequencial());
        
        return retorno;
    }
    
    public Ciaaerea convertCIA(ECompanhiaAerea aerea)
    {
        Ciaaerea retorno = new Ciaaerea();
        
        retorno.setCiaaereadescricao(aerea.getNome());
        retorno.setCiaaerealogotipo(aerea.getLogoTipoCaminho());
        retorno.setCiaaereasigla(aerea.getSigla());
        
        return retorno;
    }
    
    public Escala convertEscala(EEscala eEscala)
    {
        //TODO: Terminar
        Escala e= new Escala();
        
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setGregorianChange(eEscala.getDataChegadaEfetiva());
        try
        {
            XMLGregorianCalendar  data = DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
            e.setEscalahorachegada(data);
            
            calendar.setGregorianChange(eEscala.getDataSaidaEfetiva());
            data = DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
            e.setEscalahorapartida(data);
        }
        catch (DatatypeConfigurationException ex)
        {
            Logger.getLogger(Conversor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        e.setIdaeroporto(eEscala.getAeroportoDestino().getSequencial().toString());
        e.setIdescala(eEscala.getSequencial());
        
        return  e;
    }
    
    
    public Slot convertSlot(EEscala eEscala, Ciaaerea cia, Aeroporto destino, Aeroporto origem)
    {
        Slot s = new Slot();
        
        s.setCiaaereasigla(cia);
        s.setIdaeroportodestino(destino);
        s.setIdaeroportoorigem(origem);
        s.setIdslot(eEscala.getSequencial());
        s.setSlothorachegada(convertDateTime(eEscala.getDataChegadaEfetiva()));
        s.setSlothorapartida(convertDateTime(eEscala.getDataSaidaEfetiva()));
        s.setSlotnumero(eEscala.getNumero());
        
        //s.setIddiasemana(eEscala.get);
        
        return s;
    }
    
    public Voohistorico convertVoo(EVoo voo,Slot slot)
    {
        Voohistorico v = new Voohistorico();
        
        //String aeroportoDestino = voo.getEscalas().get(0).getAeroportoOrigem().getCodigo();
        //String aeroportoOrigem = voo.getEscalas().get(voo.getEscalas().size() - 1).getAeroportoOrigem().getCodigo();
        
        //v.setIdaeroportodestino(aeroportoDestino);
        //v.setIdaeroportoorigem(aeroportoOrigem);
        v.setIdvoo(voo.getSequencial());
        v.setIdslot(slot.getIdslot());
        
        
        return v;
    }
    
    private XMLGregorianCalendar convertDateTime(Date data)
    {
        XMLGregorianCalendar  retorno = null;
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setGregorianChange(data);
        try
        {
            retorno = DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
        }
        catch(Exception e)
        {
            
        }
        return  retorno;
    }
}
