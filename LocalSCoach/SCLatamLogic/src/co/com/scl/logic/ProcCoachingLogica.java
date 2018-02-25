package co.com.scl.logic;

import co.com.scl.dao.IProcCoachingDao;
import co.com.scl.modelo.ProcCoaching;
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
public class ProcCoachingLogica
implements  IProcCoachingLogica
{

	@EJB
	private IProcCoachingDao procesoDao;

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void saveProcCoaching(ProcCoaching proc) throws Exception {

		if (proc==null) {

			throw new Exception("El proceso no es valido o no existe");
		}

		if (proc.getCoach()==null) {

			throw new Exception("El proceso debe tener un coach asignado");
		}

		if (proc.getCoachee()==null) {

			throw new Exception("El proceso debe tener un cliente asignado");
		}

		if (proc.getRegContable()==null) {

			throw new Exception("El proceso debe tener un registro contable");
		}

		procesoDao.persistProcCoaching(proc);

	}

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void updateProcCoaching(ProcCoaching proc) throws Exception {

		if (proc.getCoach()==null) {

			throw new Exception("El proceso debe tener un coach asignado");
		}

		if (proc.getCoachee()==null) {

			throw new Exception("El proceso debe tener un cliente asignado");
		}

		if (proc.getRegContable()==null) {

			throw new Exception("El proceso debe tener un registro contable");
		}

		procesoDao.mergeProcCoaching(proc);

	}

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void deleteProcCoaching(ProcCoaching proc) throws Exception {

		if (proc==null) {

			throw new Exception("El proceso que está tratando de eliminar no existe");
		}
		
		procesoDao.removeProcCoaching(proc);

	}

	@TransactionAttribute
	public ProcCoaching findByIdProcCoaching(long procId) throws Exception {
		
		return procesoDao.findByIdProcCoaching(procId);
	}

	@TransactionAttribute
	public List<ProcCoaching> findAllProcCoaching() {
		
		return procesoDao.getProcCoachingFindAll();
	}


}
