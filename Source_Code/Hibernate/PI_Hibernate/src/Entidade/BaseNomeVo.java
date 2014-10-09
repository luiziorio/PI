/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entidade;

import EntidadesInterface.IBaseNome;

/**
 *
 * @author rafaellf
 */
public class BaseNomeVo extends BaseVO implements IBaseNome
{
    private String nome;

    @Override
    public String getNome()
    {
    return nome;
    }
    
    @Override
    public void setNome(String nome)
    {
    this.nome = nome;
    }
}
