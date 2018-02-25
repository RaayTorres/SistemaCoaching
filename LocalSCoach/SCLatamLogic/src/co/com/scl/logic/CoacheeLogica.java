package co.com.scl.logic;

import co.com.scl.dao.ICoacheeDao;
import co.com.scl.modelo.Coachee;
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
public class CoacheeLogica
implements  ICoacheeLogica
{

	@EJB
	private ICoacheeDao coacheeDao;


	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void saveCoachee(Coachee coachee) throws Exception {

		if (coachee==null) {

			throw new Exception("El cliente no existe en la base de datos");
		}

		if (coachee.getApellido()==null || coachee.getApellido().trim().equals("") ) {

			throw new Exception ("Debe ingresar los apellidos de la persona");
		}

		if (coachee.getNombre()==null || coachee.getNombre().trim().equals("") ) {

			throw new Exception ("Debe ingresar los nombres de la persona");
		}

		if (coachee.getIdentificacion()==null || coachee.getIdentificacion().trim().equals("") ) {

			throw new Exception ("Debe ingresar el número de identificación del cliente");
		}

		if (coachee.getCorreo()==null || coachee.getCorreo().trim().equals("") ) {

			throw new Exception ("Debe ingresar el correo electronico del cliente");
		}

		if (coachee.getDireccion()==null || coachee.getDireccion().trim().equals("") ) {

			throw new Exception ("Debe ingresar la dirección de la persona");
		}

		if (coachee.getTipoDocumento()==null  ) {

			throw new Exception ("Debe seleccionar que tipo de documento tiene asociado la persona");
		}

		if (coachee.getEstado() ==null ) {

			throw new Exception ("Debe indicar en que estado se encuentra el cliente");
		}
		
		coacheeDao.persistCoachee(coachee);

	}

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void updateCoachee(Coachee coachee) throws Exception {
		if (coachee.getApellido()==null || coachee.getApellido().trim().equals("") ) {

			throw new Exception ("Debe ingresar los apellidos de la persona");
		}

		if (coachee.getNombre()==null || coachee.getNombre().trim().equals("") ) {

			throw new Exception ("Debe ingresar los nombres de la persona");
		}

		if (coachee.getIdentificacion()==null || coachee.getIdentificacion().trim().equals("") ) {

			throw new Exception ("Debe ingresar el número de identificación del cliente");
		}

		if (coachee.getCorreo()==null || coachee.getCorreo().trim().equals("") ) {

			throw new Exception ("Debe ingresar el correo electronico del cliente");
		}

		if (coachee.getDireccion()==null || coachee.getDireccion().trim().equals("") ) {

			throw new Exception ("Debe ingresar la dirección de la persona");
		}

		if (coachee.getTipoDocumento()==null  ) {

			throw new Exception ("Debe seleccionar que tipo de documento tiene asociado la persona");
		}

		if (coachee.getEstado() ==null ) {

			throw new Exception ("Debe indicar en que estado se encuentra el cliente");
		}
		
		coacheeDao.mergeCoachee(coachee);

	}

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void deleteCoachee(Coachee coachee) throws Exception {
		
		if (coachee==null) {
			
			throw new Exception("El cliente que esta intentando eliminar no se encuentra registrado en la base de datos");
		}
		
		coacheeDao.removeCoachee(coachee);

	}

	@TransactionAttribute
	public Coachee findByIdCoachee(long coacheeId) throws Exception {
		
		return coacheeDao.findByIdCoachee(coacheeId);
	
		
	}

	@TransactionAttribute
	public List<Coachee> findAllCoachee() {
		
		return coacheeDao.getCoacheeFindAll();
	}



}
