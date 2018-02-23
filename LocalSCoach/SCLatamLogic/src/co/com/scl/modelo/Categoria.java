package co.com.scl.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the categoria database table.
 * 
 */
@Entity
@Table(name="categoria")
@NamedQuery(name="Categoria.findAll", query="SELECT c FROM Categoria c")
public class Categoria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CATEGORIA_IDCAT_GENERATOR", allocationSize=1, sequenceName="SEQUENCE_CATEGORIA")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CATEGORIA_IDCAT_GENERATOR")
	@Column(name="id_cat", unique=true, nullable=false)
	private double idCat;

	@Column(name="cat_nombre", nullable=false, length=60)
	private String catNombre;

	@Column(name="hora_pagada", nullable=false)
	private double horaPagada;

	@Column(name="hora_probono", nullable=false)
	private double horaProbono;

	@Column(name="nombre_corto", nullable=false, length=10)
	private String nombreCorto;

	//bi-directional many-to-one association to Coach
	@OneToMany(mappedBy="categoria")
	private List<Coach> coaches;

	public Categoria() {
	}

	public double getIdCat() {
		return this.idCat;
	}

	public void setIdCat(double idCat) {
		this.idCat = idCat;
	}

	public String getCatNombre() {
		return this.catNombre;
	}

	public void setCatNombre(String catNombre) {
		this.catNombre = catNombre;
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

	public String getNombreCorto() {
		return this.nombreCorto;
	}

	public void setNombreCorto(String nombreCorto) {
		this.nombreCorto = nombreCorto;
	}

	public List<Coach> getCoaches() {
		return this.coaches;
	}

	public void setCoaches(List<Coach> coaches) {
		this.coaches = coaches;
	}

	public Coach addCoach(Coach coach) {
		getCoaches().add(coach);
		coach.setCategoria(this);

		return coach;
	}

	public Coach removeCoach(Coach coach) {
		getCoaches().remove(coach);
		coach.setCategoria(null);

		return coach;
	}

}