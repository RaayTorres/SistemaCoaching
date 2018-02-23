package co.com.scl.dao;

import co.com.scl.modelo.Coach;
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
@Stateless(name = "CoachDao", mappedName = "SCLatamLogic-CoachDao")
public class CoachDao
        implements  ICoachDao
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
    public CoachDao() {
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
    public Coach persistCoach(Coach coach) {
        em.persist(coach);
        return coach;
    }

    /**
     * @generated DT_ID=none
     */
    public Coach mergeCoach(Coach coach) {
        return em.merge(coach);
    }

    /**
     * @generated DT_ID=none
     */
    public void removeCoach(Coach coach) {
        coach = em.find(Coach.class, coach.getIdCoach());
        em.remove(coach);
    }

    /**
     * @generated DT_ID=none
     */
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<Coach> getCoachFindAll() {
        return em.createNamedQuery("Coach.findAll").getResultList();
    }

}
