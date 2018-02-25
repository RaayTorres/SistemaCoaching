package co.com.scl.dao;

import co.com.scl.modelo.RegContable;
import co.com.scl.modelo.SesCoaching;
import java.util.List;
import javax.ejb.Remote;


/**
 * @generated DT_ID=none
 */
@Remote
public interface ISesCoachingDao
{

    /**
     * @generated DT_ID=none
     */
    Object queryByRange(String jpqlStmt, int firstResult, int maxResults);

    /**
     * @generated DT_ID=none
     */
    public SesCoaching persistSesCoaching(SesCoaching sesCoaching);

    /**
     * @generated DT_ID=none
     */
    public SesCoaching mergeSesCoaching(SesCoaching sesCoaching);

    /**
     * @generated DT_ID=none
     */
    public void removeSesCoaching(SesCoaching sesCoaching);

    /**
     * @generated DT_ID=none
     */
    public List<SesCoaching> getSesCoachingFindAll();
    
    
    public SesCoaching findByIdSesCoaching(long idSesCoaching);

}
