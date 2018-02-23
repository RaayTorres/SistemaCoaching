package co.com.scl.dao;

import co.com.scl.modelo.Coachee;
import java.util.List;
import javax.ejb.Remote;


/**
 * @generated DT_ID=none
 */
@Remote
public interface ICoacheeDao
{

    /**
     * @generated DT_ID=none
     */
    Object queryByRange(String jpqlStmt, int firstResult, int maxResults);

    /**
     * @generated DT_ID=none
     */
    public Coachee persistCoachee(Coachee coachee);

    /**
     * @generated DT_ID=none
     */
    public Coachee mergeCoachee(Coachee coachee);

    /**
     * @generated DT_ID=none
     */
    public void removeCoachee(Coachee coachee);

    /**
     * @generated DT_ID=none
     */
    public List<Coachee> getCoacheeFindAll();

}
