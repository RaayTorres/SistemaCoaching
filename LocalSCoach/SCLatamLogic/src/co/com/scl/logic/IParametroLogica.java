package co.com.scl.logic;

import co.com.scl.modelo.Estado;
import co.com.scl.modelo.Parametro;
import java.util.List;
import javax.ejb.Remote;


/**
 * @generated DT_ID=none
 */
@Remote
public interface IParametroLogica
{

	public void saveParametro(Parametro param) throws Exception;

	public void updateParametro(Parametro param) throws Exception;

	 public void deleteParametro(Parametro param) throws Exception;

	public Parametro findByIdParametro(long param) throws Exception;

	public List<Parametro> findAllParametro();
}
