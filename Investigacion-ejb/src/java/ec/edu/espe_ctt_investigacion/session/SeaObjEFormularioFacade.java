/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.espe_ctt_investigacion.session;

import ec.edu.espe_ctt_investigacion.entity.SeaObjEFormulario;
import java.math.BigDecimal;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Administrador
 */
@Stateless
public class SeaObjEFormularioFacade extends AbstractFacade<SeaObjEFormulario> {
    @PersistenceContext(unitName = "Investigacion-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SeaObjEFormularioFacade() {
        super(SeaObjEFormulario.class);
    }
    public List<SeaObjEFormulario> findObjEFormularioByCodObjForm(BigDecimal codObj){
        List<SeaObjEFormulario> result = null;
        Query query = em.createQuery("SELECT o FROM SeaObjEFormulario o WHERE o.sofId.sofId =:codObj");
        query.setParameter("codObj", codObj);
        query.setHint("eclipselink.refresh", true);
        result = query.getResultList();
        return result== null || result.isEmpty() ? null: result;
    }
    
}
