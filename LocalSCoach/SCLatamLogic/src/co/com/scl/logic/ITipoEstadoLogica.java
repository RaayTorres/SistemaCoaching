package co.com.scl.logic;

import co.com.scl.modelo.TipoDocumento;
import co.com.scl.modelo.TipoEstado;
import java.util.List;
import javax.ejb.Remote;


/**
 * @generated DT_ID=none
 */
@Remote
public interface ITipoEstadoLogica
{

	public void saveTipoEstado(TipoEstado tpEstado) throws Exception;

	public void updateTipoEstado(TipoEstado tpEstado) throws Exception;

	 public void deleteTipoEstado(TipoEstado tpEstado) throws Exception;

	public TipoEstado findByIdTipoEstado(long tpEstadoId) throws Exception;

	public List<TipoEstado> findAllTipoEstado();

}
