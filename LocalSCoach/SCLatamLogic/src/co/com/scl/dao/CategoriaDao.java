package co.com.scl.dao;

import co.com.scl.modelo.Categoria;
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
@Stateless(name = "CategoriaDao", mappedName = "SCLatamLogic-CategoriaDao")
public class CategoriaDao
        implements  ICategoriaDao
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
    public CategoriaDao() {
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
    public Categoria persistCategoria(Categoria categoria) {
        em.persist(categoria);
        return categoria;
    }

    /**
     * @generated DT_ID=none
     */
    public Categoria mergeCategoria(Categoria categoria) {
        return em.merge(categoria);
    }

    /**
     * @generated DT_ID=none
     */
    public void removeCategoria(Categoria categoria) {
        categoria = em.find(Categoria.class, categoria.getIdCat());
        em.remove(categoria);
    }

    /**
     * @generated DT_ID=none
     */
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<Categoria> getCategoriaFindAll() {
        return em.createNamedQuery("Categoria.findAll").getResultList();
    }

    public Categoria findByIdCategoria(Categoria categoria){
    	return em.find(Categoria.class, categoria.getIdCat());
    	
    }
    
}
