package com.axione.validateur.stoc.model;
import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the t_point_mutualisation_technique_pmt database table.
 * 
 */
@Entity
@Table(name="t_point_mutualisation_technique_pmt")
@NamedQuery(name="TPointMutualisationTechniquePmt.findAll", query="SELECT t FROM TPointMutualisationTechniquePmt t")
public class TPointMutualisationTechniquePmt implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String ref;

	//bi-directional many-to-one association to TPointBranchementOptiquePbo
	@OneToMany(mappedBy="TPointMutualisationTechniquePmt")
	private List<TPointBranchementOptiquePbo> TPointBranchementOptiquePbos;

	//bi-directional many-to-one association to TPointMutualisationPm
	@ManyToOne
	@JoinColumn(name="pm_id")
	private TPointMutualisationPm TPointMutualisationPm;

	public TPointMutualisationTechniquePmt() {
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

	public List<TPointBranchementOptiquePbo> getTPointBranchementOptiquePbos() {
		return this.TPointBranchementOptiquePbos;
	}

	public void setTPointBranchementOptiquePbos(List<TPointBranchementOptiquePbo> TPointBranchementOptiquePbos) {
		this.TPointBranchementOptiquePbos = TPointBranchementOptiquePbos;
	}

	public TPointBranchementOptiquePbo addTPointBranchementOptiquePbo(TPointBranchementOptiquePbo TPointBranchementOptiquePbo) {
		getTPointBranchementOptiquePbos().add(TPointBranchementOptiquePbo);
		TPointBranchementOptiquePbo.setTPointMutualisationTechniquePmt(this);

		return TPointBranchementOptiquePbo;
	}

	public TPointBranchementOptiquePbo removeTPointBranchementOptiquePbo(TPointBranchementOptiquePbo TPointBranchementOptiquePbo) {
		getTPointBranchementOptiquePbos().remove(TPointBranchementOptiquePbo);
		TPointBranchementOptiquePbo.setTPointMutualisationTechniquePmt(null);

		return TPointBranchementOptiquePbo;
	}

	public TPointMutualisationPm getTPointMutualisationPm() {
		return this.TPointMutualisationPm;
	}

	public void setTPointMutualisationPm(TPointMutualisationPm TPointMutualisationPm) {
		this.TPointMutualisationPm = TPointMutualisationPm;
	}

}