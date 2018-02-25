package co.com.scl.dao;

import co.com.scl.modelo.Categoria;
import co.com.scl.modelo.Parametro;
import java.util.List;
import javax.ejb.Remote;


/**
 * @generated DT_ID=none
 */
@Remote
public interface IParametroDao
{

    /**
     * @generated DT_ID=none
     */
    Object queryByRange(String jpqlStmt, int firstResult, int maxResults);

    /**
     * @generated DT_ID=none
     */
    public Parametro persistParametro(Parametro parametro);

    /**
     * @generated DT_ID=none
     */
    public Parametro mergeParametro(Parametro parametro);

    /**
     * @generated DT_ID=none
     */
    public void removeParametro(Parametro parametro);

    /**
     * @generated DT_ID=none
     */
    public List<Parametro> getParametroFindAll();
    
    public Parametro findByIdParametro(long idParam);


}
