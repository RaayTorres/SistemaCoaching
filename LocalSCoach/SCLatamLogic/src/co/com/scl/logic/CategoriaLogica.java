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



	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void saveCategoria(Categoria cat) throws Exception {

		if (cat==null) {

			throw new Exception("Debe escribir una categor�a valida");
		}

		if (cat.getCatNombre()==null || cat.getCatNombre().trim().equals("")) {

			throw new Exception("Debe ingresar un nombre para la categor�a que va a crear");
		}
		if (cat.getHoraPagada()<0) {

			throw new Exception("La cantidad de horas ingresadas es invalida");
		}
		if (cat.getHoraProbono()<0) {

			throw new Exception("La cantidad de horas ingresadas es invalida");
		}
		if (cat.getNombreCorto()==null || cat.getNombreCorto().trim().equals("")) {
			
			throw new Exception("Debe ingresar un nombre corto para la categor�a");
		}
		
		categoriaDao.persistCategoria(cat);

	}

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void updateCategoria(Categoria cat) throws Exception {
		
		if (cat.getCatNombre()==null || cat.getCatNombre().trim().equals("")) {

			throw new Exception("Debe ingresar un nombre para la categor�a que va a crear");
		}
		if (cat.getHoraPagada()<0) {

			throw new Exception("La cantidad de horas ingresadas es invalida");
		}
		if (cat.getHoraProbono()<0) {

			throw new Exception("La cantidad de horas ingresadas es invalida");
		}
		if (cat.getNombreCorto()==null || cat.getNombreCorto().trim().equals("")) {
			
			throw new Exception("Debe ingresar un nombre corto para la categor�a");
		}
		
		categoriaDao.mergeCategoria(cat);

	}

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void deleteCategoria(Categoria cat) throws Exception {
		
		if (cat==null) {
			
			throw new Exception("La categor�a que est� tratando de eliminar no existe");
		}
		
		categoriaDao.removeCategoria(cat);

	}

	@TransactionAttribute
	public Categoria findByIdCategoria(long catId) throws Exception {

		return categoriaDao.findByIdCategoria(catId);
	}

	@TransactionAttribute
	public List<Categoria> findAllCategoria() {

		return categoriaDao.getCategoriaFindAll();
	}



}
