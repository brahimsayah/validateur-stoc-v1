package com.axione.validateur.stoc.model;
import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the t_point_mutualisation_pm database table.
 * 
 */
@Entity
@Table(name="t_point_mutualisation_pm")
@NamedQuery(name="TPointMutualisationPm.findAll", query="SELECT t FROM TPointMutualisationPm t")
public class TPointMutualisationPm implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="date_mad")
	private Timestamp dateMad;

	@Column(name="date_ouverture_commerciale")
	private Timestamp dateOuvertureCommerciale;

	@Column(name="date_retablissement")
	private Timestamp dateRetablissement;

	private String ref;

	private String statut;

	@Column(name="type_emplacement")
	private String typeEmplacement;

	//bi-directional many-to-one association to TPointRaccordementDistantPrdm
	@ManyToOne
	@JoinColumn(name="prdm_id")
	private TPointRaccordementDistantPrdm TPointRaccordementDistantPrdm;

	//bi-directional many-to-one association to TPointMutualisationPmFai
	@OneToMany(mappedBy="TPointMutualisationPm")
	private List<TPointMutualisationPmFai> TPointMutualisationPmFais;

	//bi-directional many-to-one association to TPointMutualisationTechniquePmt
	@OneToMany(mappedBy="TPointMutualisationPm")
	private List<TPointMutualisationTechniquePmt> TPointMutualisationTechniquePmts;

	public TPointMutualisationPm() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Timestamp getDateMad() {
		return this.dateMad;
	}

	public void setDateMad(Timestamp dateMad) {
		this.dateMad = dateMad;
	}

	public Timestamp getDateOuvertureCommerciale() {
		return this.dateOuvertureCommerciale;
	}

	public void setDateOuvertureCommerciale(Timestamp dateOuvertureCommerciale) {
		this.dateOuvertureCommerciale = dateOuvertureCommerciale;
	}

	public Timestamp getDateRetablissement() {
		return this.dateRetablissement;
	}

	public void setDateRetablissement(Timestamp dateRetablissement) {
		this.dateRetablissement = dateRetablissement;
	}

	public String getRef() {
		return this.ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public String getStatut() {
		return this.statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public String getTypeEmplacement() {
		return this.typeEmplacement;
	}

	public void setTypeEmplacement(String typeEmplacement) {
		this.typeEmplacement = typeEmplacement;
	}

	public TPointRaccordementDistantPrdm getTPointRaccordementDistantPrdm() {
		return this.TPointRaccordementDistantPrdm;
	}

	public void setTPointRaccordementDistantPrdm(TPointRaccordementDistantPrdm TPointRaccordementDistantPrdm) {
		this.TPointRaccordementDistantPrdm = TPointRaccordementDistantPrdm;
	}

	public List<TPointMutualisationPmFai> getTPointMutualisationPmFais() {
		return this.TPointMutualisationPmFais;
	}

	public void setTPointMutualisationPmFais(List<TPointMutualisationPmFai> TPointMutualisationPmFais) {
		this.TPointMutualisationPmFais = TPointMutualisationPmFais;
	}

	public TPointMutualisationPmFai addTPointMutualisationPmFai(TPointMutualisationPmFai TPointMutualisationPmFai) {
		getTPointMutualisationPmFais().add(TPointMutualisationPmFai);
		TPointMutualisationPmFai.setTPointMutualisationPm(this);

		return TPointMutualisationPmFai;
	}

	public TPointMutualisationPmFai removeTPointMutualisationPmFai(TPointMutualisationPmFai TPointMutualisationPmFai) {
		getTPointMutualisationPmFais().remove(TPointMutualisationPmFai);
		TPointMutualisationPmFai.setTPointMutualisationPm(null);

		return TPointMutualisationPmFai;
	}

	public List<TPointMutualisationTechniquePmt> getTPointMutualisationTechniquePmts() {
		return this.TPointMutualisationTechniquePmts;
	}

	public void setTPointMutualisationTechniquePmts(List<TPointMutualisationTechniquePmt> TPointMutualisationTechniquePmts) {
		this.TPointMutualisationTechniquePmts = TPointMutualisationTechniquePmts;
	}

	public TPointMutualisationTechniquePmt addTPointMutualisationTechniquePmt(TPointMutualisationTechniquePmt TPointMutualisationTechniquePmt) {
		getTPointMutualisationTechniquePmts().add(TPointMutualisationTechniquePmt);
		TPointMutualisationTechniquePmt.setTPointMutualisationPm(this);

		return TPointMutualisationTechniquePmt;
	}

	public TPointMutualisationTechniquePmt removeTPointMutualisationTechniquePmt(TPointMutualisationTechniquePmt TPointMutualisationTechniquePmt) {
		getTPointMutualisationTechniquePmts().remove(TPointMutualisationTechniquePmt);
		TPointMutualisationTechniquePmt.setTPointMutualisationPm(null);

		return TPointMutualisationTechniquePmt;
	}

}