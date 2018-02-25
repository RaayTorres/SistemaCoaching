package co.com.scl.logic;

import co.com.scl.dao.IEstadoDao;
import co.com.scl.modelo.Estado;
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
public class EstadoLogica
implements  IEstadoLogica
{

	@EJB
	private IEstadoDao estadoDao;

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void saveEstado(Estado estado) throws Exception {

		if (estado==null) {

			throw new Exception("El estado es invalido");
		}

		if (estado.getNombreEstado()==null||estado.getNombreEstado().trim().equals("")) {

			throw new Exception("Debe asignar un nombre al estado");
		}

		if (estado.getTipoEstado()==null) {

			throw new Exception("Debe asignar un tipo de estado");
		}

		estadoDao.persistEstado(estado);

	}

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void updateEstado(Estado estado) throws Exception {

		if (estado.getNombreEstado()==null||estado.getNombreEstado().trim().equals("")) {

			throw new Exception("Debe asignar un nombre al estado");
		}

		if (estado.getTipoEstado()==null) {

			throw new Exception("Debe asignar un tipo de estado");
		}

		estadoDao.mergeEstado(estado);

	}

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void deleteEstado(Estado estado) throws Exception {

		if (estado==null) {

			throw new Exception("El estado que está tratando de eliminar no existe");
		}

	}

	@TransactionAttribute
	public Estado findByIdEstado(long estadoId) throws Exception {
		
		return estadoDao.findByIdEstado(estadoId);
	}

	@TransactionAttribute
	public List<Estado> findAllEstado() {
		
		return estadoDao.getEstadoFindAll();
	}

}
