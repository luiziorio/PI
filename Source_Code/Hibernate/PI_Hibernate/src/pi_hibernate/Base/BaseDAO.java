/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pi_hibernate.Base;

/**
 *
 * @author rafaellf
 * @param <T>
 */
public abstract class BaseDAO<T extends BaseVO>
{
    public abstract void Salva(T objeto);
    
    public abstract void Delete(T objeto);
}
