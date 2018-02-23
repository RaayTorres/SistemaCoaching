package co.com.scl.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the reg_contable database table.
 * 
 */
@Entity
@Table(name="reg_contable")
@NamedQuery(name="RegContable.findAll", query="SELECT r FROM RegContable r")
public class RegContable implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="REG_CONTABLE_IDHIS_GENERATOR", allocationSize=1, sequenceName="SEQUENCE_REG_CONTABLE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="REG_CONTABLE_IDHIS_GENERATOR")
	@Column(name="id_his", unique=true, nullable=false)
	private double idHis;

	@Column(name="fecha_pago", nullable=false)
	private Timestamp fechaPago;

	@Column(nullable=false, length=200)
	private String tipo;

	@Column(nullable=false)
	private double valor;

	//bi-directional many-to-one association to ProcCoaching
	@OneToMany(mappedBy="regContable")
	private List<ProcCoaching> procCoachings;

	//bi-directional many-to-one association to Coachee
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="coachee_id_coachee", nullable=false)
	private Coachee coachee;

	public RegContable() {
	}

	public double getIdHis() {
		return this.idHis;
	}

	public void setIdHis(double idHis) {
		this.idHis = idHis;
	}

	public Timestamp getFechaPago() {
		return this.fechaPago;
	}

	public void setFechaPago(Timestamp fechaPago) {
		this.fechaPago = fechaPago;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getValor() {
		return this.valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public List<ProcCoaching> getProcCoachings() {
		return this.procCoachings;
	}

	public void setProcCoachings(List<ProcCoaching> procCoachings) {
		this.procCoachings = procCoachings;
	}

	public ProcCoaching addProcCoaching(ProcCoaching procCoaching) {
		getProcCoachings().add(procCoaching);
		procCoaching.setRegContable(this);

		return procCoaching;
	}

	public ProcCoaching removeProcCoaching(ProcCoaching procCoaching) {
		getProcCoachings().remove(procCoaching);
		procCoaching.setRegContable(null);

		return procCoaching;
	}

	public Coachee getCoachee() {
		return this.coachee;
	}

	public void setCoachee(Coachee coachee) {
		this.coachee = coachee;
	}

}