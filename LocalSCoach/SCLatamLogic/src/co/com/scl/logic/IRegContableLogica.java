package co.com.scl.logic;

import co.com.scl.modelo.RegContable;
import co.com.scl.modelo.SesCoaching;

import java.util.List;
import javax.ejb.Remote;


/**
 * @generated DT_ID=none
 */
@Remote
public interface IRegContableLogica
{

	public void saveRegContable(RegContable reg) throws Exception;

	public void updateRegContable(RegContable reg) throws Exception;

	 public void deleteRegContable(RegContable reg) throws Exception;

	public RegContable findByIdRegContable(long regId) throws Exception;

	public List<RegContable> findAllRegContable();
}
