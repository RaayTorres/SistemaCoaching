package co.com.scl.logic;

import co.com.scl.modelo.Coach;
import co.com.scl.modelo.Estado;
import java.util.List;
import javax.ejb.Remote;


/**
 * @generated DT_ID=none
 */
@Remote
public interface IEstadoLogica
{

	public void saveEstado(Estado estado) throws Exception;

	public void updateEstado(Estado estado) throws Exception;

	 public void deleteEstado(Estado estado) throws Exception;

	public Estado findByIdEstado(long estadoId) throws Exception;

	public List<Estado> findAllEstado();

}
