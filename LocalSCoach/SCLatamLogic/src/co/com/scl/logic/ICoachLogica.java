package co.com.scl.logic;

import co.com.scl.modelo.Coach;
import co.com.scl.modelo.Coachee;

import java.util.List;
import javax.ejb.Remote;


/**
 * @generated DT_ID=none
 */
@Remote
public interface ICoachLogica
{

	public void saveCoach(Coach coach) throws Exception;

	public void updateCoach(Coach coach) throws Exception;

	 public void deleteCoach(Coach coach) throws Exception;

	public Coach findByIdCoach(long coachId) throws Exception;

	public List<Coach> findAllCoach();

}
