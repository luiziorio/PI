/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Base.Persistencia.BaseDAO;
import Model.EAeronave;

/**
 *
 * @author rafael
 */
public class AeronaveDAO extends BaseDAO<EAeronave>
{
    @Override
    protected EAeronave getInstanceEntidade()
    {
        return new EAeronave();
    }
}
