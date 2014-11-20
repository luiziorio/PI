package Model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(EEscala.class)
public abstract class EEscala_ extends Base.EBase_ {

	public static volatile SingularAttribute<EEscala, Date> dataSaidaPrevista;
	public static volatile SingularAttribute<EEscala, Boolean> atrasado;
	public static volatile SingularAttribute<EEscala, EAeroporto> aeroportoOrigem;
	public static volatile SingularAttribute<EEscala, String> numero;
	public static volatile SingularAttribute<EEscala, Date> dataSaidaEfetiva;
	public static volatile SingularAttribute<EEscala, EVoo> voo;
	public static volatile SetAttribute<EEscala, EVoo> eVoos;
	public static volatile SingularAttribute<EEscala, EAeroporto> aeroportoDestino;
	public static volatile SingularAttribute<EEscala, Date> dataChegadaPrevista;
	public static volatile SingularAttribute<EEscala, Date> dataChegadaEfetiva;

}

