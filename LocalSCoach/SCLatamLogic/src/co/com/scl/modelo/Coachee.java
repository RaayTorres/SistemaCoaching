package co.com.scl.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the coachee database table.
 * 
 */
@Entity
@Table(name="coachee")
@NamedQuery(name="Coachee.findAll", query="SELECT c FROM Coachee c")
public class Coachee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="COACHEE_IDCOACHEE_GENERATOR", allocationSize=1, sequenceName="SEQUENCE_COACHEE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="COACHEE_IDCOACHEE_GENERATOR")
	@Column(name="id_coachee", unique=true, nullable=false)
	private double idCoachee;

	@Column(nullable=false, length=60)
	private String apellido;

	private double celular;

	@Column(nullable=false, length=80)
	private String correo;

	@Column(nullable=false, length=80)
	private String direccion;

	private byte[] foto;

	@Column(length=200)
	private String hobbies;

	@Column(nullable=false, length=60)
	private String identificacion;

	@Column(nullable=false, length=60)
	private String nombre;

	private double telefono;

	//bi-directional many-to-one association to Estado
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="estado_id_estado", nullable=false)
	private Estado estado;

	//bi-directional many-to-one association to TipoDocumento
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="tipo_documento_id_doc", nullable=false)
	private TipoDocumento tipoDocumento;

	//bi-directional many-to-one association to ProcCoaching
	@OneToMany(mappedBy="coachee")
	private List<ProcCoaching> procCoachings;

	//bi-directional many-to-one association to RegContable
	@OneToMany(mappedBy="coachee")
	private List<RegContable> regContables;

	public Coachee() {
	}

	public double getIdCoachee() {
		return this.idCoachee;
	}

	public void setIdCoachee(double idCoachee) {
		this.idCoachee = idCoachee;
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

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public byte[] getFoto() {
		return this.foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public String getHobbies() {
		return this.hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	public String getIdentificacion() {
		return this.identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
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
		procCoaching.setCoachee(this);

		return procCoaching;
	}

	public ProcCoaching removeProcCoaching(ProcCoaching procCoaching) {
		getProcCoachings().remove(procCoaching);
		procCoaching.setCoachee(null);

		return procCoaching;
	}

	public List<RegContable> getRegContables() {
		return this.regContables;
	}

	public void setRegContables(List<RegContable> regContables) {
		this.regContables = regContables;
	}

	public RegContable addRegContable(RegContable regContable) {
		getRegContables().add(regContable);
		regContable.setCoachee(this);

		return regContable;
	}

	public RegContable removeRegContable(RegContable regContable) {
		getRegContables().remove(regContable);
		regContable.setCoachee(null);

		return regContable;
	}

}