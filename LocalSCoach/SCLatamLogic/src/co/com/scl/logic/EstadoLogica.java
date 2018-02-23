package co.com.scl.logic;

import co.com.scl.modelo.Estado;
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
public class EstadoLogica
        implements  IEstadoLogica
{

	@Override
	public void saveEstado(Estado estado) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEstado(Estado estado) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEstado(Estado estado) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Estado findByIdEstado(long estadoId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Estado> findAllEstado() {
		// TODO Auto-generated method stub
		return null;
	}

}
