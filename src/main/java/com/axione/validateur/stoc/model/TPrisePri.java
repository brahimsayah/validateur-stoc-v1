package com.axione.validateur.stoc.model;
import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the t_prise_pri database table.
 * 
 */
@Entity
@Table(name="t_prise_pri")
@NamedQuery(name="TPrisePri.findAll", query="SELECT t FROM TPrisePri t")
public class TPrisePri implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="pbo_id")
	private Integer pboId;

	private String ref;

	@Column(name="statut_acces")
	private String statutAcces;

	@Column(name="statut_actif")
	private Boolean statutActif;

	@Column(name="statut_commercialisable")
	private Boolean statutCommercialisable;

	@Column(name="statut_existant")
	private Boolean statutExistant;

	@Column(name="statut_net_designer")
	private String statutNetDesigner;

	@Column(name="statut_raccordable")
	private Boolean statutRaccordable;

	@Column(name="statut_rompu")
	private Boolean statutRompu;

	private String type;

	//bi-directional many-to-one association to TLocalLoc
	@OneToMany(mappedBy="TPrisePri")
	private List<TLocalLoc> TLocalLocs;

	public TPrisePri() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPboId() {
		return this.pboId;
	}

	public void setPboId(Integer pboId) {
		this.pboId = pboId;
	}

	public String getRef() {
		return this.ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public String getStatutAcces() {
		return this.statutAcces;
	}

	public void setStatutAcces(String statutAcces) {
		this.statutAcces = statutAcces;
	}

	public Boolean getStatutActif() {
		return this.statutActif;
	}

	public void setStatutActif(Boolean statutActif) {
		this.statutActif = statutActif;
	}

	public Boolean getStatutCommercialisable() {
		return this.statutCommercialisable;
	}

	public void setStatutCommercialisable(Boolean statutCommercialisable) {
		this.statutCommercialisable = statutCommercialisable;
	}

	public Boolean getStatutExistant() {
		return this.statutExistant;
	}

	public void setStatutExistant(Boolean statutExistant) {
		this.statutExistant = statutExistant;
	}

	public String getStatutNetDesigner() {
		return this.statutNetDesigner;
	}

	public void setStatutNetDesigner(String statutNetDesigner) {
		this.statutNetDesigner = statutNetDesigner;
	}

	public Boolean getStatutRaccordable() {
		return this.statutRaccordable;
	}

	public void setStatutRaccordable(Boolean statutRaccordable) {
		this.statutRaccordable = statutRaccordable;
	}

	public Boolean getStatutRompu() {
		return this.statutRompu;
	}

	public void setStatutRompu(Boolean statutRompu) {
		this.statutRompu = statutRompu;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<TLocalLoc> getTLocalLocs() {
		return this.TLocalLocs;
	}

	public void setTLocalLocs(List<TLocalLoc> TLocalLocs) {
		this.TLocalLocs = TLocalLocs;
	}

	public TLocalLoc addTLocalLoc(TLocalLoc TLocalLoc) {
		getTLocalLocs().add(TLocalLoc);
		TLocalLoc.setTPrisePri(this);

		return TLocalLoc;
	}

	public TLocalLoc removeTLocalLoc(TLocalLoc TLocalLoc) {
		getTLocalLocs().remove(TLocalLoc);
		TLocalLoc.setTPrisePri(null);

		return TLocalLoc;
	}

}