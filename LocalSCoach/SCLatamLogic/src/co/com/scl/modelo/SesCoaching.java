package co.com.scl.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the ses_coaching database table.
 * 
 */
@Entity
@Table(name="ses_coaching")
@NamedQuery(name="SesCoaching.findAll", query="SELECT s FROM SesCoaching s")
public class SesCoaching implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="SES_COACHING_IDSESI_GENERATOR", allocationSize=1, sequenceName="SEQUENCE_SES_COACHING")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SES_COACHING_IDSESI_GENERATOR")
	@Column(name="id_sesi", unique=true, nullable=false)
	private double idSesi;

	@Column(length=2000)
	private String accion;

	@Column(length=2000)
	private String compromiso;

	private Timestamp fecha;

	@Column(name="foco_sesion", length=120)
	private String focoSesion;

	private double hora;

	@Column(name="id_his", nullable=false)
	private double idHis;

	@Column(length=50)
	private String indicador;

	@Column(length=2000)
	private String profundidad;

	//bi-directional many-to-one association to Estado
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="estado_id_estado", nullable=false)
	private Estado estado;

	//bi-directional many-to-one association to ProcCoaching
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="proc_coaching_id_proc", nullable=false)
	private ProcCoaching procCoaching;

	public SesCoaching() {
	}

	public double getIdSesi() {
		return this.idSesi;
	}

	public void setIdSesi(double idSesi) {
		this.idSesi = idSesi;
	}

	public String getAccion() {
		return this.accion;
	}

	public void setAccion(String accion) {
		this.accion = accion;
	}

	public String getCompromiso() {
		return this.compromiso;
	}

	public void setCompromiso(String compromiso) {
		this.compromiso = compromiso;
	}

	public Timestamp getFecha() {
		return this.fecha;
	}

	public void setFecha(Timestamp fecha) {
		this.fecha = fecha;
	}

	public String getFocoSesion() {
		return this.focoSesion;
	}

	public void setFocoSesion(String focoSesion) {
		this.focoSesion = focoSesion;
	}

	public double getHora() {
		return this.hora;
	}

	public void setHora(double hora) {
		this.hora = hora;
	}

	public double getIdHis() {
		return this.idHis;
	}

	public void setIdHis(double idHis) {
		this.idHis = idHis;
	}

	public String getIndicador() {
		return this.indicador;
	}

	public void setIndicador(String indicador) {
		this.indicador = indicador;
	}

	public String getProfundidad() {
		return this.profundidad;
	}

	public void setProfundidad(String profundidad) {
		this.profundidad = profundidad;
	}

	public Estado getEstado() {
		return this.estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public ProcCoaching getProcCoaching() {
		return this.procCoaching;
	}

	public void setProcCoaching(ProcCoaching procCoaching) {
		this.procCoaching = procCoaching;
	}

}