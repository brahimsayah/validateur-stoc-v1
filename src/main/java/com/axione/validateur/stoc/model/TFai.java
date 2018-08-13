package com.axione.validateur.stoc.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the t_fai database table.
 * 
 */
@Entity
@Table(name="t_fai")
@NamedQuery(name="TFai.findAll", query="SELECT t FROM TFai t")
public class TFai implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String nom;

	@Column(name="site_internet")
	private String siteInternet;

	//bi-directional many-to-one association to TPointMutualisationPmFai
	@OneToMany(mappedBy="TFai")
	private List<TPointMutualisationPmFai> TPointMutualisationPmFais;

	public TFai() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getSiteInternet() {
		return this.siteInternet;
	}

	public void setSiteInternet(String siteInternet) {
		this.siteInternet = siteInternet;
	}

	public List<TPointMutualisationPmFai> getTPointMutualisationPmFais() {
		return this.TPointMutualisationPmFais;
	}

	public void setTPointMutualisationPmFais(List<TPointMutualisationPmFai> TPointMutualisationPmFais) {
		this.TPointMutualisationPmFais = TPointMutualisationPmFais;
	}

	public TPointMutualisationPmFai addTPointMutualisationPmFai(TPointMutualisationPmFai TPointMutualisationPmFai) {
		getTPointMutualisationPmFais().add(TPointMutualisationPmFai);
		TPointMutualisationPmFai.setTFai(this);

		return TPointMutualisationPmFai;
	}

	public TPointMutualisationPmFai removeTPointMutualisationPmFai(TPointMutualisationPmFai TPointMutualisationPmFai) {
		getTPointMutualisationPmFais().remove(TPointMutualisationPmFai);
		TPointMutualisationPmFai.setTFai(null);

		return TPointMutualisationPmFai;
	}

}