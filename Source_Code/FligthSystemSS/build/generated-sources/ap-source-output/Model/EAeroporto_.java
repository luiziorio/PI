package Model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(EAeroporto.class)
public abstract class EAeroporto_ extends Base.Persistencia.EBaseNome_ {

	public static volatile SingularAttribute<EAeroporto, EContinente> continente;
	public static volatile SingularAttribute<EAeroporto, String> codigo;
	public static volatile SingularAttribute<EAeroporto, ECidade> cidade;
	public static volatile SingularAttribute<EAeroporto, EPais> pais;

}

