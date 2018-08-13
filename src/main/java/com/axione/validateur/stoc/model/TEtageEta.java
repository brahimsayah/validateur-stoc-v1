package com.axione.validateur.stoc.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the t_etage_eta database table.
 * 
 */
@Entity
@Table(name="t_etage_eta")
@NamedQuery(name="TEtageEta.findAll", query="SELECT t FROM TEtageEta t")
public class TEtageEta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private Integer nblocauxftth;

	private Integer nbrlignesactives;

	private Integer nbrlignesexistantes;

	private Integer nbrprisesaconstruire;

	private String ref;

	//bi-directional many-to-one association to TEscalierEsc
	@ManyToOne
	@JoinColumn(name="esc_id")
	private TEscalierEsc TEscalierEsc;

	//bi-directional many-to-one association to TLocalLoc
	@OneToMany(mappedBy="TEtageEta")
	private List<TLocalLoc> TLocalLocs;

	public TEtageEta() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNblocauxftth() {
		return this.nblocauxftth;
	}

	public void setNblocauxftth(Integer nblocauxftth) {
		this.nblocauxftth = nblocauxftth;
	}

	public Integer getNbrlignesactives() {
		return this.nbrlignesactives;
	}

	public void setNbrlignesactives(Integer nbrlignesactives) {
		this.nbrlignesactives = nbrlignesactives;
	}

	public Integer getNbrlignesexistantes() {
		return this.nbrlignesexistantes;
	}

	public void setNbrlignesexistantes(Integer nbrlignesexistantes) {
		this.nbrlignesexistantes = nbrlignesexistantes;
	}

	public Integer getNbrprisesaconstruire() {
		return this.nbrprisesaconstruire;
	}

	public void setNbrprisesaconstruire(Integer nbrprisesaconstruire) {
		this.nbrprisesaconstruire = nbrprisesaconstruire;
	}

	public String getRef() {
		return this.ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public TEscalierEsc getTEscalierEsc() {
		return this.TEscalierEsc;
	}

	public void setTEscalierEsc(TEscalierEsc TEscalierEsc) {
		this.TEscalierEsc = TEscalierEsc;
	}

	public List<TLocalLoc> getTLocalLocs() {
		return this.TLocalLocs;
	}

	public void setTLocalLocs(List<TLocalLoc> TLocalLocs) {
		this.TLocalLocs = TLocalLocs;
	}

	public TLocalLoc addTLocalLoc(TLocalLoc TLocalLoc) {
		getTLocalLocs().add(TLocalLoc);
		TLocalLoc.setTEtageEta(this);

		return TLocalLoc;
	}

	public TLocalLoc removeTLocalLoc(TLocalLoc TLocalLoc) {
		getTLocalLocs().remove(TLocalLoc);
		TLocalLoc.setTEtageEta(null);

		return TLocalLoc;
	}

}