package co.com.scl.dao;

import co.com.scl.modelo.RegContable;
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
@Stateless(name = "RegContableDao", mappedName = "SCLatamLogic-RegContableDao")
public class RegContableDao
        implements  IRegContableDao
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
    public RegContableDao() {
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
    public RegContable persistRegContable(RegContable regContable) {
        em.persist(regContable);
        return regContable;
    }

    /**
     * @generated DT_ID=none
     */
    public RegContable mergeRegContable(RegContable regContable) {
        return em.merge(regContable);
    }

    /**
     * @generated DT_ID=none
     */
    public void removeRegContable(RegContable regContable) {
        regContable = em.find(RegContable.class, regContable.getIdHis());
        em.remove(regContable);
    }

    /**
     * @generated DT_ID=none
     */
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<RegContable> getRegContableFindAll() {
        return em.createNamedQuery("RegContable.findAll").getResultList();
    }

}
