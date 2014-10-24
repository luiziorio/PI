/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HibernateUtil;

/**
 * Interface para o disparo do evento onCarregouXML
 * @author rafael
 */
interface ICarregouXML
{
    /**
     * Quando terminou de carregar o XML de configuração do hibernate é 
     * disparado esse evento.
     * @param hibernate Informações do XML
     */
    void onCarregouXML(HibernateUtility hibernate);
}
