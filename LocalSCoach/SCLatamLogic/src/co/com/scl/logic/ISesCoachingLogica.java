package co.com.scl.logic;

import co.com.scl.modelo.ProcCoaching;
import co.com.scl.modelo.SesCoaching;
import java.util.List;
import javax.ejb.Remote;


/**
 * @generated DT_ID=none
 */
@Remote
public interface ISesCoachingLogica
{

	public void saveSesCoaching(SesCoaching ses) throws Exception;

	public void updateSescCoaching(SesCoaching ses) throws Exception;

	 public void deleteSesCoaching(SesCoaching ses) throws Exception;

	public SesCoaching findByIdSesCoaching(long sesId) throws Exception;

	public List<SesCoaching> findAllSesCoaching();

}
