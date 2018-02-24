package co.com.scl.dao;

import co.com.scl.modelo.Estado;
import java.util.List;
import javax.annotation.Resource;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


/**
 * @generated DT_ID=none
 */
@Stateless(name = "EstadoDao", mappedName = "SCLatamLogic-EstadoDao")
public class EstadoDao  implements  IEstadoDao
{

    /**
     * @generated DT_ID=none
     */
	@Resource
	SessionContext sessionContext;

    /**
     * @generated DT_ID=none
     */
	    @PersistenceContext(unitName="SCLatamLogic")
        private EntityManager em;

    /**
     * @generated DT_ID=none
     */
    public EstadoDao() {
    }
    
    

    /**
     * @generated DT_ID=none
     */
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Object queryByRange(String jpqlStmt, int firstResult,
                               int maxResults) {
        Query query = em.createQuery(jpqlStmt);
        if (firstResult > 0) {
            query = query.setFirstResult(firstResult);
        }
        if (maxResults > 0) {
            query = query.setMaxResults(maxResults);
        }

        return query.getResultList();
    }

    /**
     * @generated DT_ID=none
     */
    public Estado persistEstado(Estado estado) {
        em.persist(estado);
        return estado;
    }

    /**
     * @generated DT_ID=none
     */
    public Estado mergeEstado(Estado estado) {
        return em.merge(estado);
    }

    /**
     * @generated DT_ID=none
     */
    public void removeEstado(Estado estado) {
        estado = em.find(Estado.class, estado.getIdEstado());
        em.remove(estado);
    }

    /**
     * @generated DT_ID=none
     */
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<Estado> getEstadoFindAll() {
        return em.createNamedQuery("Estado.findAll").getResultList();
    }



	@Override
	public Estado findByIdEstado(Estado est) {
	
		return em.find(Estado.class, est.getIdEstado());
	}

}
