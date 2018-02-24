package co.com.scl.dao;

import co.com.scl.modelo.TipoEstado;
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
@Stateless(name = "TipoEstadoDao", mappedName = "SCLatamLogic-TipoEstadoDao")
public class TipoEstadoDao  implements ITipoEstadoDao
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
    public TipoEstadoDao() {
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
    public TipoEstado persistTipoEstado(TipoEstado tipoEstado) {
        em.persist(tipoEstado);
        return tipoEstado;
    }

    /**
     * @generated DT_ID=none
     */
    public TipoEstado mergeTipoEstado(TipoEstado tipoEstado) {
        return em.merge(tipoEstado);
    }

    /**
     * @generated DT_ID=none
     */
    public void removeTipoEstado(TipoEstado tipoEstado) {
        tipoEstado = em.find(TipoEstado.class, tipoEstado.getIdTestado());
        em.remove(tipoEstado);
    }

    /**
     * @generated DT_ID=none
     */
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<TipoEstado> getTipoEstadoFindAll() {
        return em.createNamedQuery("TipoEstado.findAll").getResultList();
    }



	@Override
	public TipoEstado findByIdTipoEstado(TipoEstado tipoEstado) {
		
		return em.find(TipoEstado.class, tipoEstado.getIdTestado());
	}

}
