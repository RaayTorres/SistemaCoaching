package co.com.scl.dao;

import co.com.scl.modelo.RegContable;
import java.util.List;
import javax.ejb.Remote;


/**
 * @generated DT_ID=none
 */
@Remote
public interface IRegContableDao
{

    /**
     * @generated DT_ID=none
     */
    Object queryByRange(String jpqlStmt, int firstResult, int maxResults);

    /**
     * @generated DT_ID=none
     */
    public RegContable persistRegContable(RegContable regContable);

    /**
     * @generated DT_ID=none
     */
    public RegContable mergeRegContable(RegContable regContable);

    /**
     * @generated DT_ID=none
     */
    public void removeRegContable(RegContable regContable);

    /**
     * @generated DT_ID=none
     */
    public List<RegContable> getRegContableFindAll();

}
