package co.com.scl.logic;

import co.com.scl.dao.ITipoDocumentoDao;
import co.com.scl.modelo.TipoDocumento;
import java.util.List;
import javax.annotation.Resource;
import javax.ejb.EJB;
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


	@EJB
	private ITipoDocumentoDao tipoDocumentoDao;

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void saveTipoDocumento(TipoDocumento tpDoc) throws Exception {

		if (tpDoc==null) {

			throw new Exception("El tipo de documento no se encuentra en la base de datos");
		}

		if (tpDoc.getTdocNombre()==null || tpDoc.getTdocNombre().trim().equals("")) {

			throw new Exception("Por favor ingrese un nombre para la categoria");

		}

		tipoDocumentoDao.persistTipoDocumento(tpDoc);

	}

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void updateTipoDocumento(TipoDocumento tpDoc) throws Exception {

		if (tpDoc.getTdocNombre()==null || tpDoc.getTdocNombre().trim().equals("")) {

			throw new Exception("Por favor ingrese un nombre para la categoria");

		}

		tipoDocumentoDao.mergeTipoDocumento(tpDoc);

	}

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void deleteTipoDocumento(TipoDocumento tpDoc) throws Exception {

		if (tpDoc==null) {

			throw new Exception("El tipo de documento no se encuentra en la base de datos");
		}


	}

	@TransactionAttribute
	public TipoDocumento findByIdTipoDocumento(long tpDocId) throws Exception {
		
		return tipoDocumentoDao.findByIdTipoDocumento(tpDocId);
	}

	@TransactionAttribute
	public List<TipoDocumento> findAllTipoDocumento() {
		
		return tipoDocumentoDao.getTipoDocumentoFindAll();
	}



}
