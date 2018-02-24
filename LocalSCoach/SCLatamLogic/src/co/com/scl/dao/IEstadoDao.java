package co.com.scl.dao;

import co.com.scl.modelo.Coachee;
import co.com.scl.modelo.Estado;
import java.util.List;
import javax.ejb.Remote;


/**
 * @generated DT_ID=none
 */
@Remote
public interface IEstadoDao
{

    /**
     * @generated DT_ID=none
     */
    Object queryByRange(String jpqlStmt, int firstResult, int maxResults);

    /**
     * @generated DT_ID=none
     */
    public Estado persistEstado(Estado estado);

    /**
     * @generated DT_ID=none
     */
    public Estado mergeEstado(Estado estado);

    /**
     * @generated DT_ID=none
     */
    public void removeEstado(Estado estado);

    /**
     * @generated DT_ID=none
     */
    public List<Estado> getEstadoFindAll();
    
    public Estado findByIdEstado(Estado est);

}
