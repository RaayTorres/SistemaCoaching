package co.com.scl.logic;

import co.com.scl.modelo.RegContable;
import co.com.scl.modelo.TipoDocumento;
import java.util.List;
import javax.ejb.Remote;


/**
 * @generated DT_ID=none
 */
@Remote
public interface ITipoDocumentoLogica
{

	
	public void saveTipoDocumento(TipoDocumento tpDoc) throws Exception;

	public void updateTipoDocumento(TipoDocumento tpDoc) throws Exception;

	 public void deleteTipoDocumento(TipoDocumento tpDoc) throws Exception;

	public TipoDocumento findByIdTipoDocumento(long tpDocId) throws Exception;

	public List<TipoDocumento> findAllTipoDocumento();

}
