package co.com.scl.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the coach database table.
 * 
 */
@Entity
@Table(name="coach")
@NamedQuery(name="Coach.findAll", query="SELECT c FROM Coach c")
public class Coach implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="COACH_IDCOACH_GENERATOR", allocationSize=1, sequenceName="SEQUENCE_COACH")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="COACH_IDCOACH_GENERATOR")
	@Column(name="id_coach", unique=true, nullable=false)
	private double idCoach;

	@Column(nullable=false, length=60)
	private String apellido;

	private double celular;

	@Column(nullable=false, length=60)
	private String contraseña;

	@Column(nullable=false, length=80)
	private String correo;

	@Column(name="hora_pagada", nullable=false)
	private double horaPagada;

	@Column(name="hora_probono", nullable=false)
	private double horaProbono;

	@Column(nullable=false, length=60)
	private String identificacion;

	@Column(nullable=false, length=60)
	private String login;

	@Column(nullable=false, length=60)
	private String nombre;

	private double telefono;

	//bi-directional many-to-one association to Categoria
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="categoria_id_cat", nullable=false)
	private Categoria categoria;

	//bi-directional many-to-one association to Estado
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="estado_id_estado", nullable=false)
	private Estado estado;

	//bi-directional many-to-one association to TipoDocumento
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="tipo_documento_id_doc", nullable=false)
	private TipoDocumento tipoDocumento;

	//bi-directional many-to-one association to ProcCoaching
	@OneToMany(mappedBy="coach")
	private List<ProcCoaching> procCoachings;

	public Coach() {
	}

	public double getIdCoach() {
		return this.idCoach;
	}

	public void setIdCoach(double idCoach) {
		this.idCoach = idCoach;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public double getCelular() {
		return this.celular;
	}

	public void setCelular(double celular) {
		this.celular = celular;
	}

	public String getContraseña() {
		return this.contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public double getHoraPagada() {
		return this.horaPagada;
	}

	public void setHoraPagada(double horaPagada) {
		this.horaPagada = horaPagada;
	}

	public double getHoraProbono() {
		return this.horaProbono;
	}

	public void setHoraProbono(double horaProbono) {
		this.horaProbono = horaProbono;
	}

	public String getIdentificacion() {
		return this.identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getTelefono() {
		return this.telefono;
	}

	public void setTelefono(double telefono) {
		this.telefono = telefono;
	}

	public Categoria getCategoria() {
		return this.categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Estado getEstado() {
		return this.estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public TipoDocumento getTipoDocumento() {
		return this.tipoDocumento;
	}

	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public List<ProcCoaching> getProcCoachings() {
		return this.procCoachings;
	}

	public void setProcCoachings(List<ProcCoaching> procCoachings) {
		this.procCoachings = procCoachings;
	}

	public ProcCoaching addProcCoaching(ProcCoaching procCoaching) {
		getProcCoachings().add(procCoaching);
		procCoaching.setCoach(this);

		return procCoaching;
	}

	public ProcCoaching removeProcCoaching(ProcCoaching procCoaching) {
		getProcCoachings().remove(procCoaching);
		procCoaching.setCoach(null);

		return procCoaching;
	}

}