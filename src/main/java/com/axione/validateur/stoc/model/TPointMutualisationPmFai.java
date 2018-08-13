package com.axione.validateur.stoc.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_point_mutualisation_pm_fai database table.
 * 
 */
@Entity
@Table(name="t_point_mutualisation_pm_fai")
@NamedQuery(name="TPointMutualisationPmFai.findAll", query="SELECT t FROM TPointMutualisationPmFai t")
public class TPointMutualisationPmFai implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	//bi-directional many-to-one association to TFai
	@ManyToOne
	@JoinColumn(name="fai_id")
	private TFai TFai;

	//bi-directional many-to-one association to TPointMutualisationPm
	@ManyToOne
	@JoinColumn(name="pm_id")
	private TPointMutualisationPm TPointMutualisationPm;

	public TPointMutualisationPmFai() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TFai getTFai() {
		return this.TFai;
	}

	public void setTFai(TFai TFai) {
		this.TFai = TFai;
	}

	public TPointMutualisationPm getTPointMutualisationPm() {
		return this.TPointMutualisationPm;
	}

	public void setTPointMutualisationPm(TPointMutualisationPm TPointMutualisationPm) {
		this.TPointMutualisationPm = TPointMutualisationPm;
	}

}