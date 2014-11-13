/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_FlightSystem.Entidade;

import java.util.Date;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author rafael
 */
@Entity
@Table(name = "comissariaBordo")
public class EComissariaBoardo extends EFuncionario
{
    public EComissariaBoardo()
    {
    }
}
