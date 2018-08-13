package com.axione.validateur.stoc.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the t_escalier_esc database table.
 * 
 */
@Entity
@Table(name="t_escalier_esc")
@NamedQuery(name="TEscalierEsc.findAll", query="SELECT t FROM TEscalierEsc t")
public class TEscalierEsc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String ref;

	//bi-directional many-to-one association to TBatimentBat
	@ManyToOne
	@JoinColumn(name="bat_id")
	private TBatimentBat TBatimentBat;

	//bi-directional many-to-one association to TEtageEta
	@OneToMany(mappedBy="TEscalierEsc")
	private List<TEtageEta> TEtageEtas;

	public TEscalierEsc() {
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

	public TBatimentBat getTBatimentBat() {
		return this.TBatimentBat;
	}

	public void setTBatimentBat(TBatimentBat TBatimentBat) {
		this.TBatimentBat = TBatimentBat;
	}

	public List<TEtageEta> getTEtageEtas() {
		return this.TEtageEtas;
	}

	public void setTEtageEtas(List<TEtageEta> TEtageEtas) {
		this.TEtageEtas = TEtageEtas;
	}

	public TEtageEta addTEtageEta(TEtageEta TEtageEta) {
		getTEtageEtas().add(TEtageEta);
		TEtageEta.setTEscalierEsc(this);

		return TEtageEta;
	}

	public TEtageEta removeTEtageEta(TEtageEta TEtageEta) {
		getTEtageEtas().remove(TEtageEta);
		TEtageEta.setTEscalierEsc(null);

		return TEtageEta;
	}

}