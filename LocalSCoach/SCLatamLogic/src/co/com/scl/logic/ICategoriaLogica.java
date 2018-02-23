package co.com.scl.logic;

import co.com.scl.modelo.Categoria;
import java.util.List;
import javax.ejb.Remote;


/**
 * @generated DT_ID=none
 */
@Remote
public interface ICategoriaLogica
{

	public void saveCategoria(Categoria cat) throws Exception;

	public void updateCategoria(Categoria cat) throws Exception;

	 public void deleteCategoria(Categoria cat) throws Exception;

	public Categoria findByIdCategoria(long catId) throws Exception;

	public List<Categoria> findAllCategoria();

}
