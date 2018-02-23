package co.com.scl.logic;

import co.com.scl.modelo.ProcCoaching;
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
public class ProcCoachingLogica
        implements  IProcCoachingLogica
{

	@Override
	public void saveProcCoaching(ProcCoaching proc) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateProcCoaching(ProcCoaching proc) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProcCoaching(ProcCoaching proc) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ProcCoaching findByIdProcCoaching(long procId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProcCoaching> findAllProcCoaching() {
		// TODO Auto-generated method stub
		return null;
	}


}
