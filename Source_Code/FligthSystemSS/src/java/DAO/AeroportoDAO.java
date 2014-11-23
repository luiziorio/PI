/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import Base.Persistencia.BaseDAO;
import Model.EAeroporto;
import org.springframework.stereotype.Repository;
     

/**
 *
 * @author rafaellf
 */
@Repository
public class AeroportoDAO extends BaseDAO<EAeroporto>
{
    @Override
    protected EAeroporto getInstanceEntidade()
    {
        return new EAeroporto();
    }
}
