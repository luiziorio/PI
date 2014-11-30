package Model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(EEndereco.class)
public abstract class EEndereco_ extends Base.Persistencia.EBase_ {

	public static volatile SingularAttribute<EEndereco, ECidade> cidade;
	public static volatile SingularAttribute<EEndereco, String> rua;
	public static volatile SingularAttribute<EEndereco, String> cep;

}

