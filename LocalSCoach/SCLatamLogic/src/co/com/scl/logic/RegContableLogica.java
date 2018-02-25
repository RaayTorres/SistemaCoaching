package co.com.scl.logic;

import co.com.scl.dao.IRegContableDao;
import co.com.scl.modelo.RegContable;
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
public class RegContableLogica
implements  IRegContableLogica
{


	@EJB
	private IRegContableDao registroDao;

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void saveRegContable(RegContable reg) throws Exception {

		if (reg==null) {

			throw new Exception("El registro es invalido o no existe");
		}

		if (reg.getCoachee()==null) {

			throw new Exception("El registro debe tener a un cliente asignado");
		}

		if (reg.getFechaPago()==null) {

			throw new Exception("El registro debe tener una fecha asignada");
		}

		if (reg.getValor()<0) {

			throw new Exception("El valor introducido no es valido");

		}

		if (reg.getTipo()==null|| reg.getTipo().trim().equals("")) {

			throw new Exception("El tipo de registo no es valido");
		}

		registroDao.persistRegContable(reg);
	}

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void updateRegContable(RegContable reg) throws Exception {
		if (reg.getCoachee()==null) {

			throw new Exception("El registro debe tener a un cliente asignado");
		}

		if (reg.getFechaPago()==null) {

			throw new Exception("El registro debe tener una fecha asignada");
		}

		if (reg.getValor()<0) {

			throw new Exception("El valor introducido no es valido");

		}

		if (reg.getTipo()==null|| reg.getTipo().trim().equals("")) {

			throw new Exception("El tipo de registo no es valido");
		}

		registroDao.mergeRegContable(reg);


	}

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void deleteRegContable(RegContable reg) throws Exception {

		if (reg==null) {

			throw new Exception("El registro que está tratando de eliminar no existe");
		}
		
		registroDao.removeRegContable(reg);

	}

	@TransactionAttribute
	public RegContable findByIdRegContable(long regId) throws Exception {
		
		return  registroDao.findByIdRegContable(regId);
	}

	@TransactionAttribute
	public List<RegContable> findAllRegContable() {
		
		return registroDao.getRegContableFindAll();
	}


}
