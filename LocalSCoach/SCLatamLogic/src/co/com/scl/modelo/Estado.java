package co.com.scl.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the estado database table.
 * 
 */
@Entity
@Table(name="estado")
@NamedQuery(name="Estado.findAll", query="SELECT e FROM Estado e")
public class Estado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ESTADO_IDESTADO_GENERATOR", allocationSize=1, sequenceName="SEQUENCE_ESTADO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ESTADO_IDESTADO_GENERATOR")
	@Column(name="id_estado", unique=true, nullable=false)
	private double idEstado;

	@Column(name="nombre_estado", nullable=false, length=60)
	private String nombreEstado;

	//bi-directional many-to-one association to Coach
	@OneToMany(mappedBy="estado")
	private List<Coach> coaches;

	//bi-directional many-to-one association to Coachee
	@OneToMany(mappedBy="estado")
	private List<Coachee> coachees;

	//bi-directional many-to-one association to TipoEstado
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="tipo_estado_id_testado", nullable=false)
	private TipoEstado tipoEstado;

	//bi-directional many-to-one association to SesCoaching
	@OneToMany(mappedBy="estado")
	private List<SesCoaching> sesCoachings;

	public Estado() {
	}

	public double getIdEstado() {
		return this.idEstado;
	}

	public void setIdEstado(double idEstado) {
		this.idEstado = idEstado;
	}

	public String getNombreEstado() {
		return this.nombreEstado;
	}

	public void setNombreEstado(String nombreEstado) {
		this.nombreEstado = nombreEstado;
	}

	public List<Coach> getCoaches() {
		return this.coaches;
	}

	public void setCoaches(List<Coach> coaches) {
		this.coaches = coaches;
	}

	public Coach addCoach(Coach coach) {
		getCoaches().add(coach);
		coach.setEstado(this);

		return coach;
	}

	public Coach removeCoach(Coach coach) {
		getCoaches().remove(coach);
		coach.setEstado(null);

		return coach;
	}

	public List<Coachee> getCoachees() {
		return this.coachees;
	}

	public void setCoachees(List<Coachee> coachees) {
		this.coachees = coachees;
	}

	public Coachee addCoachee(Coachee coachee) {
		getCoachees().add(coachee);
		coachee.setEstado(this);

		return coachee;
	}

	public Coachee removeCoachee(Coachee coachee) {
		getCoachees().remove(coachee);
		coachee.setEstado(null);

		return coachee;
	}

	public TipoEstado getTipoEstado() {
		return this.tipoEstado;
	}

	public void setTipoEstado(TipoEstado tipoEstado) {
		this.tipoEstado = tipoEstado;
	}

	public List<SesCoaching> getSesCoachings() {
		return this.sesCoachings;
	}

	public void setSesCoachings(List<SesCoaching> sesCoachings) {
		this.sesCoachings = sesCoachings;
	}

	public SesCoaching addSesCoaching(SesCoaching sesCoaching) {
		getSesCoachings().add(sesCoaching);
		sesCoaching.setEstado(this);

		return sesCoaching;
	}

	public SesCoaching removeSesCoaching(SesCoaching sesCoaching) {
		getSesCoachings().remove(sesCoaching);
		sesCoaching.setEstado(null);

		return sesCoaching;
	}

}