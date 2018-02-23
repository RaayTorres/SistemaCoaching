package co.com.scl.dao;

import co.com.scl.modelo.Coachee;
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
@Stateless(name = "CoacheeDao", mappedName = "SCLatamLogic-CoacheeDao")
public class CoacheeDao
        implements  ICoacheeDao
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
    public CoacheeDao() {
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
    public Coachee persistCoachee(Coachee coachee) {
        em.persist(coachee);
        return coachee;
    }

    /**
     * @generated DT_ID=none
     */
    public Coachee mergeCoachee(Coachee coachee) {
        return em.merge(coachee);
    }

    /**
     * @generated DT_ID=none
     */
    public void removeCoachee(Coachee coachee) {
        coachee = em.find(Coachee.class, coachee.getIdCoachee());
        em.remove(coachee);
    }

    /**
     * @generated DT_ID=none
     */
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<Coachee> getCoacheeFindAll() {
        return em.createNamedQuery("Coachee.findAll").getResultList();
    }

}
