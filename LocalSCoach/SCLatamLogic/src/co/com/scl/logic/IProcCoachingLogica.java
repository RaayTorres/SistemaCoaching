package co.com.scl.logic;

import co.com.scl.modelo.Parametro;
import co.com.scl.modelo.ProcCoaching;
import java.util.List;
import javax.ejb.Remote;


/**
 * @generated DT_ID=none
 */
@Remote
public interface IProcCoachingLogica
{


	public void saveProcCoaching(ProcCoaching proc) throws Exception;

	public void updateProcCoaching(ProcCoaching proc) throws Exception;

	 public void deleteProcCoaching(ProcCoaching proc) throws Exception;

	public ProcCoaching findByIdProcCoaching(long procId) throws Exception;

	public List<ProcCoaching> findAllProcCoaching();

}
