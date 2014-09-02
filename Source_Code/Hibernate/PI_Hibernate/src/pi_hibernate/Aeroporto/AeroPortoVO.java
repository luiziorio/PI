/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pi_hibernate.Aeroporto;
import pi_hibernate.Base.BaseVO;

/**
 *
 * @author rafaellf
 */
class AeroportoVO extends BaseVO
{

    String nome;

    public String getNome()
    {
        return this.nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }
}
