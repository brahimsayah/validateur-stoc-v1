package com.axione.validateur.stoc.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the t_point_raccordement_distant_prdm database table.
 * 
 */
@Entity
@Table(name="t_point_raccordement_distant_prdm")
@NamedQuery(name="TPointRaccordementDistantPrdm.findAll", query="SELECT t FROM TPointRaccordementDistantPrdm t")
public class TPointRaccordementDistantPrdm implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String ref;

	//bi-directional many-to-one association to TPointMutualisationPm
	@OneToMany(mappedBy="TPointRaccordementDistantPrdm")
	private List<TPointMutualisationPm> TPointMutualisationPms;

	public TPointRaccordementDistantPrdm() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRef() {
		return this.ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public List<TPointMutualisationPm> getTPointMutualisationPms() {
		return this.TPointMutualisationPms;
	}

	public void setTPointMutualisationPms(List<TPointMutualisationPm> TPointMutualisationPms) {
		this.TPointMutualisationPms = TPointMutualisationPms;
	}

	public TPointMutualisationPm addTPointMutualisationPm(TPointMutualisationPm TPointMutualisationPm) {
		getTPointMutualisationPms().add(TPointMutualisationPm);
		TPointMutualisationPm.setTPointRaccordementDistantPrdm(this);

		return TPointMutualisationPm;
	}

	public TPointMutualisationPm removeTPointMutualisationPm(TPointMutualisationPm TPointMutualisationPm) {
		getTPointMutualisationPms().remove(TPointMutualisationPm);
		TPointMutualisationPm.setTPointRaccordementDistantPrdm(null);

		return TPointMutualisationPm;
	}

}