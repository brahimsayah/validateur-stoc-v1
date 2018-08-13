package com.axione.validateur.stoc.model;
import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the t_point_branchement_optique_pbo database table.
 * 
 */
@Entity
@Table(name="t_point_branchement_optique_pbo")
@NamedQuery(name="TPointBranchementOptiquePbo.findAll", query="SELECT t FROM TPointBranchementOptiquePbo t")
public class TPointBranchementOptiquePbo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String ref;

	private String type;

	@Column(name="type_racco_pbpto")
	private String typeRaccoPbpto;

	//bi-directional many-to-one association to TLocalLoc
	@OneToMany(mappedBy="TPointBranchementOptiquePbo")
	private List<TLocalLoc> TLocalLocs;

	//bi-directional many-to-one association to TPointMutualisationTechniquePmt
	@ManyToOne
	@JoinColumn(name="pmt_id")
	private TPointMutualisationTechniquePmt TPointMutualisationTechniquePmt;

	public TPointBranchementOptiquePbo() {
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

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTypeRaccoPbpto() {
		return this.typeRaccoPbpto;
	}

	public void setTypeRaccoPbpto(String typeRaccoPbpto) {
		this.typeRaccoPbpto = typeRaccoPbpto;
	}

	public List<TLocalLoc> getTLocalLocs() {
		return this.TLocalLocs;
	}

	public void setTLocalLocs(List<TLocalLoc> TLocalLocs) {
		this.TLocalLocs = TLocalLocs;
	}

	public TLocalLoc addTLocalLoc(TLocalLoc TLocalLoc) {
		getTLocalLocs().add(TLocalLoc);
		TLocalLoc.setTPointBranchementOptiquePbo(this);

		return TLocalLoc;
	}

	public TLocalLoc removeTLocalLoc(TLocalLoc TLocalLoc) {
		getTLocalLocs().remove(TLocalLoc);
		TLocalLoc.setTPointBranchementOptiquePbo(null);

		return TLocalLoc;
	}

	public TPointMutualisationTechniquePmt getTPointMutualisationTechniquePmt() {
		return this.TPointMutualisationTechniquePmt;
	}

	public void setTPointMutualisationTechniquePmt(TPointMutualisationTechniquePmt TPointMutualisationTechniquePmt) {
		this.TPointMutualisationTechniquePmt = TPointMutualisationTechniquePmt;
	}

}