package co.com.scl.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the proc_coaching database table.
 * 
 */
@Entity
@Table(name="proc_coaching")
@NamedQuery(name="ProcCoaching.findAll", query="SELECT p FROM ProcCoaching p")
public class ProcCoaching implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PROC_COACHING_IDPROC_GENERATOR", allocationSize=1, sequenceName="SEQUENCE_PROC_COACHING")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PROC_COACHING_IDPROC_GENERATOR")
	@Column(name="id_proc", unique=true, nullable=false)
	private double idProc;

	@Column(name="id_tpago", nullable=false)
	private double idTpago;

	//bi-directional many-to-one association to Coach
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="coach_id_coach", nullable=false)
	private Coach coach;

	//bi-directional many-to-one association to Coachee
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="coachee_id_coachee", nullable=false)
	private Coachee coachee;

	//bi-directional many-to-one association to RegContable
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="reg_contable_id_his", nullable=false)
	private RegContable regContable;

	//bi-directional many-to-one association to SesCoaching
	@OneToMany(mappedBy="procCoaching")
	private List<SesCoaching> sesCoachings;

	public ProcCoaching() {
	}

	public double getIdProc() {
		return this.idProc;
	}

	public void setIdProc(double idProc) {
		this.idProc = idProc;
	}

	public double getIdTpago() {
		return this.idTpago;
	}

	public void setIdTpago(double idTpago) {
		this.idTpago = idTpago;
	}

	public Coach getCoach() {
		return this.coach;
	}

	public void setCoach(Coach coach) {
		this.coach = coach;
	}

	public Coachee getCoachee() {
		return this.coachee;
	}

	public void setCoachee(Coachee coachee) {
		this.coachee = coachee;
	}

	public RegContable getRegContable() {
		return this.regContable;
	}

	public void setRegContable(RegContable regContable) {
		this.regContable = regContable;
	}

	public List<SesCoaching> getSesCoachings() {
		return this.sesCoachings;
	}

	public void setSesCoachings(List<SesCoaching> sesCoachings) {
		this.sesCoachings = sesCoachings;
	}

	public SesCoaching addSesCoaching(SesCoaching sesCoaching) {
		getSesCoachings().add(sesCoaching);
		sesCoaching.setProcCoaching(this);

		return sesCoaching;
	}

	public SesCoaching removeSesCoaching(SesCoaching sesCoaching) {
		getSesCoachings().remove(sesCoaching);
		sesCoaching.setProcCoaching(null);

		return sesCoaching;
	}

}