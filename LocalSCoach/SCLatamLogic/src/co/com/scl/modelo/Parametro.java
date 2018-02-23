package co.com.scl.modelo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the parametro database table.
 * 
 */
@Entity
@Table(name="parametro")
@NamedQuery(name="Parametro.findAll", query="SELECT p FROM Parametro p")
public class Parametro implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PARAMETRO_IDPARAM_GENERATOR", allocationSize=1, sequenceName="SEQUENCE_PARAMETRO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PARAMETRO_IDPARAM_GENERATOR")
	@Column(name="id_param", unique=true, nullable=false)
	private double idParam;

	private double numero;

	@Column(length=500)
	private String texto;

	@Column(name="texto_blob")
	private byte[] textoBlob;

	@Column(name="texto_clob", length=2147483647)
	private String textoClob;

	public Parametro() {
	}

	public double getIdParam() {
		return this.idParam;
	}

	public void setIdParam(double idParam) {
		this.idParam = idParam;
	}

	public double getNumero() {
		return this.numero;
	}

	public void setNumero(double numero) {
		this.numero = numero;
	}

	public String getTexto() {
		return this.texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public byte[] getTextoBlob() {
		return this.textoBlob;
	}

	public void setTextoBlob(byte[] textoBlob) {
		this.textoBlob = textoBlob;
	}

	public String getTextoClob() {
		return this.textoClob;
	}

	public void setTextoClob(String textoClob) {
		this.textoClob = textoClob;
	}

}