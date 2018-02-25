package co.com.scl.dao;

import co.com.scl.modelo.Parametro;
import co.com.scl.modelo.ProcCoaching;
import java.util.List;
import javax.ejb.Remote;


/**
 * @generated DT_ID=none
 */
@Remote
public interface IProcCoachingDao
{

    /**
     * @generated DT_ID=none
     */
    Object queryByRange(String jpqlStmt, int firstResult, int maxResults);

    /**
     * @generated DT_ID=none
     */
    public ProcCoaching persistProcCoaching(ProcCoaching procCoaching);

    /**
     * @generated DT_ID=none
     */
    public ProcCoaching mergeProcCoaching(ProcCoaching procCoaching);

    /**
     * @generated DT_ID=none
     */
    public void removeProcCoaching(ProcCoaching procCoaching);

    /**
     * @generated DT_ID=none
     */
    public List<ProcCoaching> getProcCoachingFindAll();
    
    public ProcCoaching findByIdProcCoaching(long idProcCoaching);

}
