package co.com.scl.logic;

import co.com.scl.dao.ITipoEstadoDao;
import co.com.scl.modelo.TipoEstado;
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
public class TipoEstadoLogica
implements ITipoEstadoLogica
{

	@EJB
	private ITipoEstadoDao tipoEstadoDao;

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void saveTipoEstado(TipoEstado tpEstado) throws Exception {

		if (tpEstado==null) {

			throw new Exception("El tipo de estado no se encuentra registrado en la base de datos");
		}

		if (tpEstado==null|| tpEstado.getNombreTipoEstado().trim().equals("")) {

			throw new Exception("Ingrese un nombre para el tipo de estado");
		}

		tipoEstadoDao.persistTipoEstado(tpEstado);


	}

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void updateTipoEstado(TipoEstado tpEstado) throws Exception {

		if (tpEstado==null|| tpEstado.getNombreTipoEstado().trim().equals("")) {

			throw new Exception("Ingrese un nombre para el tipo de estado");
		}

		tipoEstadoDao.mergeTipoEstado(tpEstado);


	}

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void deleteTipoEstado(TipoEstado tpEstado) throws Exception {
		
		if (tpEstado==null) {

			throw new Exception("El tipo de estado no se encuentra registrado en la base de datos");
		}
		
		tipoEstadoDao.removeTipoEstado(tpEstado);

	}

	@TransactionAttribute
	public TipoEstado findByIdTipoEstado(long tpEstadoId) throws Exception {
		
		return tipoEstadoDao.findByIdTipoEstado(tpEstadoId);
	}

	@TransactionAttribute
	public List<TipoEstado> findAllTipoEstado() {
		
		return tipoEstadoDao.getTipoEstadoFindAll();
	}



}
