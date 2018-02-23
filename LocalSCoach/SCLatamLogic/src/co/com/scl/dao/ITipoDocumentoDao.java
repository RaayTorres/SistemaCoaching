package co.com.scl.dao;

import co.com.scl.modelo.TipoDocumento;
import java.util.List;
import javax.ejb.Remote;


/**
 * @generated DT_ID=none
 */
@Remote
public interface ITipoDocumentoDao
{

    /**
     * @generated DT_ID=none
     */
    Object queryByRange(String jpqlStmt, int firstResult, int maxResults);

    /**
     * @generated DT_ID=none
     */
    public TipoDocumento persistTipoDocumento(TipoDocumento tipoDocumento);

    /**
     * @generated DT_ID=none
     */
    public TipoDocumento mergeTipoDocumento(TipoDocumento tipoDocumento);

    /**
     * @generated DT_ID=none
     */
    public void removeTipoDocumento(TipoDocumento tipoDocumento);

    /**
     * @generated DT_ID=none
     */
    public List<TipoDocumento> getTipoDocumentoFindAll();

}
