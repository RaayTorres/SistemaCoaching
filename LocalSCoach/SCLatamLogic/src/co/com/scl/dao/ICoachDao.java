package co.com.scl.dao;

import co.com.scl.modelo.Coach;
import java.util.List;
import javax.ejb.Remote;


/**
 * @generated DT_ID=none
 */
@Remote
public interface ICoachDao
{

    /**
     * @generated DT_ID=none
     */
    Object queryByRange(String jpqlStmt, int firstResult, int maxResults);

    /**
     * @generated DT_ID=none
     */
    public Coach persistCoach(Coach coach);

    /**
     * @generated DT_ID=none
     */
    public Coach mergeCoach(Coach coach);

    /**
     * @generated DT_ID=none
     */
    public void removeCoach(Coach coach);

    /**
     * @generated DT_ID=none
     */
    public List<Coach> getCoachFindAll();

}
