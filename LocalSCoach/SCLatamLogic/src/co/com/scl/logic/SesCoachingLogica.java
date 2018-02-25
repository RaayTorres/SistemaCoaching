package co.com.scl.logic;

import co.com.scl.dao.ISesCoachingDao;
import co.com.scl.modelo.SesCoaching;
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
public class SesCoachingLogica
implements  ISesCoachingLogica
{

	@EJB
	private ISesCoachingDao sesionDao;

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void saveSesCoaching(SesCoaching ses) throws Exception {

		if (ses==null) {

			throw new Exception("La sesión es invalida");
		}

		if (ses.getEstado()==null) {

			throw new Exception("La sesión debe tener un estado asignado");
		}

		if (ses.getProcCoaching()==null) {

			throw new Exception("La sesion debe estar asignada a un proceso de coaching");
		}

		if (ses.getIdHis()<0) {

			throw new Exception("Ingrese un valor valido");
		}

		sesionDao.persistSesCoaching(ses);
	}

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void updateSescCoaching(SesCoaching ses) throws Exception {

		if (ses.getEstado()==null) {

			throw new Exception("La sesión debe tener un estado asignado");
		}

		if (ses.getProcCoaching()==null) {

			throw new Exception("La sesion debe estar asignada a un proceso de coaching");
		}

		if (ses.getIdHis()<0) {

			throw new Exception("Ingrese un valor valido");
		}

		sesionDao.mergeSesCoaching(ses);

	}

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void deleteSesCoaching(SesCoaching ses) throws Exception {

		if (ses==null) {

			throw new Exception("La sesión que está tratando de eliminar no existe");
		}
		
		sesionDao.removeSesCoaching(ses);

	}

	@TransactionAttribute
	public SesCoaching findByIdSesCoaching(long sesId) throws Exception {
		
		return sesionDao.findByIdSesCoaching(sesId);
	}

	@TransactionAttribute
	public List<SesCoaching> findAllSesCoaching() {
	
		return sesionDao.getSesCoachingFindAll();
	}



}
