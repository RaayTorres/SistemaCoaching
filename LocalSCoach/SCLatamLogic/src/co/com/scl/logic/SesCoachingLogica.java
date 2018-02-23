package co.com.scl.logic;

import co.com.scl.modelo.SesCoaching;
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
public class SesCoachingLogica
        implements  ISesCoachingLogica
{

	@Override
	public void saveSesCoaching(SesCoaching ses) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateSescCoaching(SesCoaching ses) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteSesCoaching(SesCoaching ses) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public SesCoaching findByIdSesCoaching(long sesId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SesCoaching> findAllSesCoaching() {
		// TODO Auto-generated method stub
		return null;
	}

   

}
