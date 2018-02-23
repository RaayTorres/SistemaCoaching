package co.com.scl.logic;

import co.com.scl.modelo.Parametro;
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
public class ParametroLogica
        implements  IParametroLogica
{

	@Override
	public void saveParametro(Parametro param) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateParametro(Parametro param) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteParametro(Parametro param) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Parametro findByIdParametro(long param) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Parametro> findAllParametro() {
		// TODO Auto-generated method stub
		return null;
	}

   

}
