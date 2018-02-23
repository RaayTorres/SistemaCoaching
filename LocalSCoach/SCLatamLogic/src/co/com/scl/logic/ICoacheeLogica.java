package co.com.scl.logic;

import co.com.scl.modelo.Categoria;
import co.com.scl.modelo.Coachee;
import java.util.List;
import javax.ejb.Remote;


/**
 * @generated DT_ID=none
 */
@Remote
public interface ICoacheeLogica
{

	public void saveCoachee(Coachee coachee) throws Exception;

	public void updateCoachee(Coachee coachee) throws Exception;

	 public void deleteCoachee(Coachee coachee) throws Exception;

	public Coachee findByIdCoachee(long coacheeId) throws Exception;

	public List<Coachee> findAllCoachee();

}
