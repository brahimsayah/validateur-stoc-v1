package com.axione.validateur.stoc.model;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_local_loc database table.
 * 
 */
@Entity
@Table(name="t_local_loc")
@NamedQuery(name="TLocalLoc.findAll", query="SELECT t FROM TLocalLoc t")
public class TLocalLoc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	//bi-directional many-to-one association to TEtageEta
	@ManyToOne
	@JoinColumn(name="eta_id")
	private TEtageEta TEtageEta;

	//bi-directional many-to-one association to TPointBranchementOptiquePbo
	@ManyToOne
	@JoinColumn(name="pbo_id")
	private TPointBranchementOptiquePbo TPointBranchementOptiquePbo;

	//bi-directional many-to-one association to TPrisePri
	@ManyToOne
	@JoinColumn(name="pri_id")
	private TPrisePri TPrisePri;

	public TLocalLoc() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TEtageEta getTEtageEta() {
		return this.TEtageEta;
	}

	public void setTEtageEta(TEtageEta TEtageEta) {
		this.TEtageEta = TEtageEta;
	}

	public TPointBranchementOptiquePbo getTPointBranchementOptiquePbo() {
		return this.TPointBranchementOptiquePbo;
	}

	public void setTPointBranchementOptiquePbo(TPointBranchementOptiquePbo TPointBranchementOptiquePbo) {
		this.TPointBranchementOptiquePbo = TPointBranchementOptiquePbo;
	}

	public TPrisePri getTPrisePri() {
		return this.TPrisePri;
	}

	public void setTPrisePri(TPrisePri TPrisePri) {
		this.TPrisePri = TPrisePri;
	}

}