/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pi_hibernate.Entidade;


import pi_hibernate.Base.EBaseNome;
import pi_hibernate.IEntidade.IAeropoto;

/**
 *
 * @author rafaellf
 */
public class EAeroporto extends EBaseNome implements IAeropoto
{
    private String codigo;

    @Override
    public String getCodigo()
    {
        return codigo;
    }

    @Override
    public void setCodigo(String codigo)
    {
        this.codigo = codigo;
    }
}
