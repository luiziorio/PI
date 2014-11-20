package Model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(EPessoaBase.class)
public abstract class EPessoaBase_ extends Base.EBaseNome_ {

	public static volatile SingularAttribute<EPessoaBase, String> telefone;
	public static volatile SingularAttribute<EPessoaBase, EEndereco> endereco;
	public static volatile SingularAttribute<EPessoaBase, EUsuario> usuario;
	public static volatile SingularAttribute<EPessoaBase, String> email;

}

