package co.com.scl.dao;

import co.com.scl.modelo.TipoEstado;
import java.util.List;
import javax.ejb.Remote;


/**
 * @generated DT_ID=none
 */
@Remote
public interface ITipoEstadoDao
{

    /**
     * @generated DT_ID=none
     */
    Object queryByRange(String jpqlStmt, int firstResult, int maxResults);

    /**
     * @generated DT_ID=none
     */
    public TipoEstado persistTipoEstado(TipoEstado tipoEstado);

    /**
     * @generated DT_ID=none
     */
    public TipoEstado mergeTipoEstado(TipoEstado tipoEstado);

    /**
     * @generated DT_ID=none
     */
    public void removeTipoEstado(TipoEstado tipoEstado);

    /**
     * @generated DT_ID=none
     */
    public List<TipoEstado> getTipoEstadoFindAll();

}
