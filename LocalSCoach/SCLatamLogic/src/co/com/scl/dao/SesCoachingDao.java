package co.com.scl.dao;

import co.com.scl.modelo.SesCoaching;
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
@Stateless(name = "SesCoachingDao", mappedName = "SCLatamLogic-SesCoachingDao")
public class SesCoachingDao  implements  ISesCoachingDao
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
    public SesCoachingDao() {
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
    public SesCoaching persistSesCoaching(SesCoaching sesCoaching) {
        em.persist(sesCoaching);
        return sesCoaching;
    }

    /**
     * @generated DT_ID=none
     */
    public SesCoaching mergeSesCoaching(SesCoaching sesCoaching) {
        return em.merge(sesCoaching);
    }

    /**
     * @generated DT_ID=none
     */
    public void removeSesCoaching(SesCoaching sesCoaching) {
        sesCoaching = em.find(SesCoaching.class, sesCoaching.getIdSesi());
        em.remove(sesCoaching);
    }

    /**
     * @generated DT_ID=none
     */
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<SesCoaching> getSesCoachingFindAll() {
        return em.createNamedQuery("SesCoaching.findAll").getResultList();
    }



	@Override
	public SesCoaching findByIdSesCoaching(SesCoaching sesCoaching) {
		
		return em.find(SesCoaching.class, sesCoaching.getIdSesi());
	}

}
