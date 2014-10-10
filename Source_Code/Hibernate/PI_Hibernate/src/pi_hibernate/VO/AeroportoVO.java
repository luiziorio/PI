/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pi_hibernate.VO;


import pi_hibernate.Base.BaseNomeVO;
import pi_hibernate.IVO.IAeropoto;

/**
 *
 * @author rafaellf
 */
public class AeroportoVO extends BaseNomeVO implements IAeropoto
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
