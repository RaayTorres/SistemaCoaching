package co.com.scl.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tipo_documento database table.
 * 
 */
@Entity
@Table(name="tipo_documento")
@NamedQuery(name="TipoDocumento.findAll", query="SELECT t FROM TipoDocumento t")
public class TipoDocumento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TIPO_DOCUMENTO_IDDOC_GENERATOR", allocationSize=1, sequenceName="SEQUENCE_TIPO_DOCUMENTO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TIPO_DOCUMENTO_IDDOC_GENERATOR")
	@Column(name="id_doc", unique=true, nullable=false)
	private double idDoc;

	@Column(name="tdoc_nombre", nullable=false, length=60)
	private String tdocNombre;

	//bi-directional many-to-one association to Coach
	@OneToMany(mappedBy="tipoDocumento")
	private List<Coach> coaches;

	//bi-directional many-to-one association to Coachee
	@OneToMany(mappedBy="tipoDocumento")
	private List<Coachee> coachees;

	public TipoDocumento() {
	}

	public double getIdDoc() {
		return this.idDoc;
	}

	public void setIdDoc(double idDoc) {
		this.idDoc = idDoc;
	}

	public String getTdocNombre() {
		return this.tdocNombre;
	}

	public void setTdocNombre(String tdocNombre) {
		this.tdocNombre = tdocNombre;
	}

	public List<Coach> getCoaches() {
		return this.coaches;
	}

	public void setCoaches(List<Coach> coaches) {
		this.coaches = coaches;
	}

	public Coach addCoach(Coach coach) {
		getCoaches().add(coach);
		coach.setTipoDocumento(this);

		return coach;
	}

	public Coach removeCoach(Coach coach) {
		getCoaches().remove(coach);
		coach.setTipoDocumento(null);

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
		coachee.setTipoDocumento(this);

		return coachee;
	}

	public Coachee removeCoachee(Coachee coachee) {
		getCoachees().remove(coachee);
		coachee.setTipoDocumento(null);

		return coachee;
	}

}