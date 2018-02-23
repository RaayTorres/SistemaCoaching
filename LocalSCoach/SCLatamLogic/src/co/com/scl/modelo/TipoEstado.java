package co.com.scl.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tipo_estado database table.
 * 
 */
@Entity
@Table(name="tipo_estado")
@NamedQuery(name="TipoEstado.findAll", query="SELECT t FROM TipoEstado t")
public class TipoEstado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TIPO_ESTADO_IDTESTADO_GENERATOR", allocationSize=1, sequenceName="SEQUENCE_TIPO_ESTADO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TIPO_ESTADO_IDTESTADO_GENERATOR")
	@Column(name="id_testado", unique=true, nullable=false)
	private double idTestado;

	@Column(name="nombre_tipo_estado", nullable=false, length=60)
	private String nombreTipoEstado;

	//bi-directional many-to-one association to Estado
	@OneToMany(mappedBy="tipoEstado")
	private List<Estado> estados;

	public TipoEstado() {
	}

	public double getIdTestado() {
		return this.idTestado;
	}

	public void setIdTestado(double idTestado) {
		this.idTestado = idTestado;
	}

	public String getNombreTipoEstado() {
		return this.nombreTipoEstado;
	}

	public void setNombreTipoEstado(String nombreTipoEstado) {
		this.nombreTipoEstado = nombreTipoEstado;
	}

	public List<Estado> getEstados() {
		return this.estados;
	}

	public void setEstados(List<Estado> estados) {
		this.estados = estados;
	}

	public Estado addEstado(Estado estado) {
		getEstados().add(estado);
		estado.setTipoEstado(this);

		return estado;
	}

	public Estado removeEstado(Estado estado) {
		getEstados().remove(estado);
		estado.setTipoEstado(null);

		return estado;
	}

}