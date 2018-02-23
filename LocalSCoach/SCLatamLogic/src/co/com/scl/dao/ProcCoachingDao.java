package co.com.scl.dao;

import co.com.scl.modelo.ProcCoaching;
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
@Stateless(name = "ProcCoachingDao", mappedName = "SCLatamLogic-ProcCoachingDao")
public class ProcCoachingDao
        implements  IProcCoachingDao
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
    public ProcCoachingDao() {
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
    public ProcCoaching persistProcCoaching(ProcCoaching procCoaching) {
        em.persist(procCoaching);
        return procCoaching;
    }

    /**
     * @generated DT_ID=none
     */
    public ProcCoaching mergeProcCoaching(ProcCoaching procCoaching) {
        return em.merge(procCoaching);
    }

    /**
     * @generated DT_ID=none
     */
    public void removeProcCoaching(ProcCoaching procCoaching) {
        procCoaching = em.find(ProcCoaching.class, procCoaching.getIdProc());
        em.remove(procCoaching);
    }

    /**
     * @generated DT_ID=none
     */
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<ProcCoaching> getProcCoachingFindAll() {
        return em.createNamedQuery("ProcCoaching.findAll").getResultList();
    }

}
