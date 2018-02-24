package co.com.scl.dao;

import co.com.scl.modelo.Categoria;
import java.util.List;
import javax.ejb.Remote;


/**
 * @generated DT_ID=none
 */
@Remote
public interface ICategoriaDao
{

    /**
     * @generated DT_ID=none
     */
    Object queryByRange(String jpqlStmt, int firstResult, int maxResults);

    /**
     * @generated DT_ID=none
     */
    public Categoria persistCategoria(Categoria categoria);

    /**
     * @generated DT_ID=none
     */
    public Categoria mergeCategoria(Categoria categoria);

    /**
     * @generated DT_ID=none
     */
    public void removeCategoria(Categoria categoria);

    /**
     * @generated DT_ID=none
     */
    public List<Categoria> getCategoriaFindAll();
    
    
    public Categoria findByIdCategoria(long idcategoria);

}
