/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author rafael
 */
@Entity
@Table(name = "comissariaBordo")
@NamedQueries(
{
    @NamedQuery(name = "EComissariaBordo.getAll", query = "SELECT a FROM EComissariaBordo a"),
})
@DiscriminatorValue(value = "C")
public class EComissariaBordo extends EFuncionario
{

}
