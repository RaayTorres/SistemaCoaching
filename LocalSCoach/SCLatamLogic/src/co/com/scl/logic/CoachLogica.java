package co.com.scl.logic;

import co.com.scl.modelo.Coach;
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
public class CoachLogica
        implements  ICoachLogica
{

	@Override
	public void saveCoach(Coach coach) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCoach(Coach coach) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCoach(Coach coach) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Coach findByIdCoach(long coachId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Coach> findAllCoach() {
		// TODO Auto-generated method stub
		return null;
	}


}
