package ec.edu.espe_ctt_investigacion.entity;

import ec.edu.espe_ctt_investigacion.entity.SeaFormatoDifusion;
import ec.edu.espe_ctt_investigacion.entity.SeaFormatoLargo;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-03T00:15:11")
@StaticMetamodel(SeaFdifusionEvento.class)
public class SeaFdifusionEvento_ { 

    public static volatile SingularAttribute<SeaFdifusionEvento, String> sfdeDescripcion;
    public static volatile SingularAttribute<SeaFdifusionEvento, BigDecimal> sfdeId;
    public static volatile SingularAttribute<SeaFdifusionEvento, SeaFormatoLargo> sflId;
    public static volatile ListAttribute<SeaFdifusionEvento, SeaFormatoDifusion> seaFormatoDifusionList;

}