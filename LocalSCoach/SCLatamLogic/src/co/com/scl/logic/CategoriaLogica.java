package co.com.scl.logic;

import co.com.scl.modelo.Categoria;
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
public class CategoriaLogica implements  ICategoriaLogica
{

	@Override
	public void saveCategoria(Categoria cat) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCategoria(Categoria cat) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCategoria(Categoria cat) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Categoria findByIdCategoria(long catId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Categoria> findAllCategoria() {
		// TODO Auto-generated method stub
		return null;
	}

    

}
