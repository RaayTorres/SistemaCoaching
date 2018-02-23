package co.com.scl.logic;

import co.com.scl.modelo.RegContable;
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
public class RegContableLogica
        implements  IRegContableLogica
{

	@Override
	public void saveRegContable(RegContable reg) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateRegContable(RegContable reg) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteRegContable(RegContable reg) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public RegContable findByIdRegContable(long regId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RegContable> findAllRegContable() {
		// TODO Auto-generated method stub
		return null;
	}

 
}
