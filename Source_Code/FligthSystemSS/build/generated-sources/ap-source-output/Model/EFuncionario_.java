package Model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(EFuncionario.class)
public abstract class EFuncionario_ extends Model.EPessoaFisica_ {

	public static volatile SetAttribute<EFuncionario, EEquipe> equipes;
	public static volatile SingularAttribute<EFuncionario, Double> salario;

}

