/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Base.Persistencia.BaseDAO;
import Model.EVoo;

/**
 *
 * @author rafael
 */
public class VooDAO extends BaseDAO<EVoo>
{
    @Override
    protected EVoo getInstanceEntidade()
    {
        return new EVoo();
    }
}
