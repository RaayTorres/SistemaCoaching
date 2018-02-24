package co.com.scl.dao;

import co.com.scl.modelo.Parametro;
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
@Stateless(name = "ParametroDao", mappedName = "SCLatamLogic-ParametroDao")
public class ParametroDao  implements  IParametroDao
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
    public ParametroDao() {
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
    public Parametro persistParametro(Parametro parametro) {
        em.persist(parametro);
        return parametro;
    }

    /**
     * @generated DT_ID=none
     */
    public Parametro mergeParametro(Parametro parametro) {
        return em.merge(parametro);
    }

    /**
     * @generated DT_ID=none
     */
    public void removeParametro(Parametro parametro) {
        parametro = em.find(Parametro.class, parametro.getIdParam());
        em.remove(parametro);
    }

    /**
     * @generated DT_ID=none
     */
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<Parametro> getParametroFindAll() {
        return em.createNamedQuery("Parametro.findAll").getResultList();
    }



	@Override
	public Parametro findByIdParametro(Parametro param) {
		
		return em.find(Parametro.class, param.getIdParam());
	}

}
