package Model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(EVoo.class)
public abstract class EVoo_ extends Base.Persistencia.EBase_ {

	public static volatile SetAttribute<EVoo, EEscala> escalas;
	public static volatile SingularAttribute<EVoo, EUsuario> usuario;
	public static volatile SingularAttribute<EVoo, EAeronave> aeronave;
	public static volatile SingularAttribute<EVoo, ECompanhiaAerea> companhia;
	public static volatile SingularAttribute<EVoo, EEquipe> equipe;

}

