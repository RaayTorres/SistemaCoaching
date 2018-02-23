package co.com.scl.dao;

import co.com.scl.modelo.TipoDocumento;
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
@Stateless(name = "TipoDocumentoDao", mappedName = "SCLatamLogic-TipoDocumentoDao")
public class TipoDocumentoDao
        implements ITipoDocumentoDao
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
    public TipoDocumentoDao() {
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
    public TipoDocumento persistTipoDocumento(TipoDocumento tipoDocumento) {
        em.persist(tipoDocumento);
        return tipoDocumento;
    }

    /**
     * @generated DT_ID=none
     */
    public TipoDocumento mergeTipoDocumento(TipoDocumento tipoDocumento) {
        return em.merge(tipoDocumento);
    }

    /**
     * @generated DT_ID=none
     */
    public void removeTipoDocumento(TipoDocumento tipoDocumento) {
        tipoDocumento = em.find(TipoDocumento.class, tipoDocumento.getIdDoc());
        em.remove(tipoDocumento);
    }

    /**
     * @generated DT_ID=none
     */
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<TipoDocumento> getTipoDocumentoFindAll() {
        return em.createNamedQuery("TipoDocumento.findAll").getResultList();
    }

}
