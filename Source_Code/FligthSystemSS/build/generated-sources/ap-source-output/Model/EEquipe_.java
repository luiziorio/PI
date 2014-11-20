package Model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(EEquipe.class)
public abstract class EEquipe_ extends Base.EBaseNome_ {

	public static volatile SetAttribute<EEquipe, EComissariaBordo> comissaria;
	public static volatile SingularAttribute<EEquipe, EPiloto> copiloto;
	public static volatile SingularAttribute<EEquipe, EFuncionario> eFuncionario;
	public static volatile SingularAttribute<EEquipe, EPiloto> piloto;

}

