package co.com.scl.logic;

import co.com.scl.modelo.TipoDocumento;
import java.util.List;
import javax.annotation.Resource;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


/**
 * @generated DT_ID=none
 */
@Stateless
public class TipoDocumentoLogica
        implements ITipoDocumentoLogica
{

	@Override
	public void saveTipoDocumento(TipoDocumento tpDoc) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateTipoDocumento(TipoDocumento tpDoc) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTipoDocumento(TipoDocumento tpDoc) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TipoDocumento findByIdTipoDocumento(long tpDocId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TipoDocumento> findAllTipoDocumento() {
		// TODO Auto-generated method stub
		return null;
	}

   

}
