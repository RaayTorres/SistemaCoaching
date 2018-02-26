package co.com.scl.logic;

import co.com.scl.dao.CoachDao;
import co.com.scl.dao.ICoachDao;
import co.com.scl.modelo.Coach;
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
public class CoachLogica
implements  ICoachLogica
{


	@EJB
	private ICoachDao coachDao;

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void saveCoach(Coach coach) throws Exception {

		if (coach==null) {

			throw new Exception("El cliente no existe en la base de datos");
		}

		if (coach.getApellido()==null || coach.getApellido().trim().equals("") ) {

			throw new Exception ("Debe ingresar los apellidos de la persona");
		}

		if (coach.getNombre()==null || coach.getNombre().trim().equals("") ) {

			throw new Exception ("Debe ingresar los nombres de la persona");
		}

		if (coach.getIdentificacion()==null || coach.getIdentificacion().trim().equals("") ) {

			throw new Exception ("Debe ingresar el número de identificación del cliente");
		}

		if (coach.getCorreo()==null || coach.getCorreo().trim().equals("") ) {

			throw new Exception ("Debe ingresar el correo electronico del cliente");
		}

		if (coach.getHoraPagada()<0) {

			throw new Exception("La cantidad de horas ingresadas es invalida");
		}
		if (coach.getHoraProbono()<0) {

			throw new Exception("La cantidad de horas ingresadas es invalida");
		}

		if (coach.getTipoDocumento()==null  ) {

			throw new Exception ("Debe seleccionar que tipo de documento tiene asociado la persona");
		}

		if (coach.getEstado() ==null ) {

			throw new Exception ("Debe indicar en que estado se encuentra el cliente");
		}

		

		coachDao.persistCoach(coach);
	}

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void updateCoach(Coach coach) throws Exception {
		if (coach.getApellido()==null || coach.getApellido().trim().equals("") ) {

			throw new Exception ("Debe ingresar los apellidos de la persona");
		}

		if (coach.getNombre()==null || coach.getNombre().trim().equals("") ) {

			throw new Exception ("Debe ingresar los nombres de la persona");
		}

		if (coach.getIdentificacion()==null || coach.getIdentificacion().trim().equals("") ) {

			throw new Exception ("Debe ingresar el número de identificación del cliente");
		}

		if (coach.getCorreo()==null || coach.getCorreo().trim().equals("") ) {

			throw new Exception ("Debe ingresar el correo electronico del cliente");
		}

		if (coach.getHoraPagada()<0) {

			throw new Exception("La cantidad de horas ingresadas es invalida");
		}
		if (coach.getHoraProbono()<0) {

			throw new Exception("La cantidad de horas ingresadas es invalida");
		}

		if (coach.getTipoDocumento()==null  ) {

			throw new Exception ("Debe seleccionar que tipo de documento tiene asociado la persona");
		}

		if (coach.getEstado() ==null ) {

			throw new Exception ("Debe indicar en que estado se encuentra el cliente");
		}

		if (coach.getCategoria()==null) {

			throw new Exception("Deebe ingresar una categoria");
		}

		coachDao.mergeCoach(coach);

	}

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void deleteCoach(Coach coach) throws Exception {

		if (coach==null) {

			throw new Exception("El coach que esta intentando eliminar no se encuentra registrado en la base de datos");
		}

	}

	@TransactionAttribute
	public Coach findByIdCoach(long coachId) throws Exception {
		
		return coachDao.findByIdCoach(coachId);
	}

	@TransactionAttribute
	public List<Coach> findAllCoach() {
		
		return coachDao.getCoachFindAll();
	}


}
