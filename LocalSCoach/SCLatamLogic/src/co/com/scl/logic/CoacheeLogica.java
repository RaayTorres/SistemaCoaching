package co.com.scl.logic;

import co.com.scl.modelo.Coachee;
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
public class CoacheeLogica
        implements  ICoacheeLogica
{

	@Override
	public void saveCoachee(Coachee coachee) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCoachee(Coachee coachee) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCoachee(Coachee coachee) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Coachee findByIdCoachee(long coacheeId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Coachee> findAllCoachee() {
		// TODO Auto-generated method stub
		return null;
	}

   

}
