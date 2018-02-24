package co.com.scl.logic;

import co.com.scl.dao.ICategoriaDao;
import co.com.scl.modelo.Categoria;
import java.util.List;
import javax.annotation.Resource;
import javax.ejb.EJB;
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

	@EJB
	private ICategoriaDao categoriaDao;
	
	// Esto es una prueba de concepto
	
	@Override
	public void saveCategoria(Categoria cat) throws Exception {
		// TODO Auto-generated method stub
		//TODO PROBANDO
		// TODO Genera error plox :v
		//TODO Me preocupa el front end :v
		// No deberia borrar esto x2
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
		
		return categoriaDao.findByIdCategoria(catId);
	}

	@Override
	public List<Categoria> findAllCategoria() {
		
		return null;
	}

    

}
