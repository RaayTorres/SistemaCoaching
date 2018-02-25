package co.com.scl.logic;

import co.com.scl.dao.IParametroDao;
import co.com.scl.modelo.Parametro;
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
public class ParametroLogica
implements  IParametroLogica
{

	@EJB
	private IParametroDao parametroDao;

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void saveParametro(Parametro param) throws Exception {

		if (param==null) {

			throw new Exception("El parametro no puede ser nulo");
		}

		parametroDao.persistParametro(param);


	}

	@TransactionAttribute(TransactionAttributeType.REQUIRED) 
	public void updateParametro(Parametro param) throws Exception {

		parametroDao.mergeParametro(param);

	}

	@TransactionAttribute(TransactionAttributeType.REQUIRED) 
	public void deleteParametro(Parametro param) throws Exception {

		if (param==null) {

			throw new Exception("La categoría que está tratando de eliminar no existe");
		}

	}

	@TransactionAttribute 
	public Parametro findByIdParametro(long param) throws Exception {
		
		return parametroDao.findByIdParametro(param);
	}

	@TransactionAttribute
	public List<Parametro> findAllParametro() {
		
		return parametroDao.getParametroFindAll();
	}



}
