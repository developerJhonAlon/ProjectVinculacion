package ec.edu.espe_ctt_investigacion.entity;

import ec.edu.espe_ctt_investigacion.entity.SeaParametrosDet;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-03T00:15:11")
@StaticMetamodel(SeaParametros.class)
public class SeaParametros_ { 

    public static volatile ListAttribute<SeaParametros, SeaParametrosDet> seaParametrosDetList;
    public static volatile SingularAttribute<SeaParametros, String> parNemonico;
    public static volatile SingularAttribute<SeaParametros, String> parDescripcion;
    public static volatile SingularAttribute<SeaParametros, String> parEstado;
    public static volatile SingularAttribute<SeaParametros, Long> parId;

}