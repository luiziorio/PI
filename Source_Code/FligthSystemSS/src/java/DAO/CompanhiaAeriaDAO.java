/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Base.BaseDAO;
import Model.ECompanhiaAerea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author rafael
 */
@Repository
public class CompanhiaAeriaDAO extends BaseDAO<ECompanhiaAerea>
{
    @Autowired
    public CompanhiaAeriaDAO()
    {
        
    }
    
    @Override
    protected ECompanhiaAerea getInstanceEntidade()
    {
        return new ECompanhiaAerea();
    }
}
