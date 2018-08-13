package com.axione.validateur.stoc.model;
import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the t_adresse_adr database table.
 * 
 */
@Entity
@Table(name="t_adresse_adr")
@NamedQuery(name="TAdresseAdr.findAll", query="SELECT t FROM TAdresseAdr t")
public class TAdresseAdr implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="adresse_networks")
	private String adresseNetworks;

	private String code;

	@Column(name="code_hexacle_voie")
	private String codeHexacleVoie;

	@Column(name="code_insee")
	private String codeInsee;

	@Column(name="code_postal")
	private String codePostal;

	@Column(name="code_rivoli")
	private String codeRivoli;

	private String commune;

	@Column(name="compl_voie")
	private String complVoie;

	@Column(name="date_maj_par_mediapost")
	private Timestamp dateMajParMediapost;

	@Column(name="id_adresse_principale")
	private Integer idAdressePrincipale;

	@Column(name="nom_voie")
	private String nomVoie;

	@Column(name="num_voie")
	private Integer numVoie;

	@Column(name="type_voie")
	private String typeVoie;

	private String zone;

	//bi-directional many-to-one association to TBatimentBat
	@OneToMany(mappedBy="TAdresseAdr")
	private List<TBatimentBat> TBatimentBats;

	public TAdresseAdr() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAdresseNetworks() {
		return this.adresseNetworks;
	}

	public void setAdresseNetworks(String adresseNetworks) {
		this.adresseNetworks = adresseNetworks;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCodeHexacleVoie() {
		return this.codeHexacleVoie;
	}

	public void setCodeHexacleVoie(String codeHexacleVoie) {
		this.codeHexacleVoie = codeHexacleVoie;
	}

	public String getCodeInsee() {
		return this.codeInsee;
	}

	public void setCodeInsee(String codeInsee) {
		this.codeInsee = codeInsee;
	}

	public String getCodePostal() {
		return this.codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getCodeRivoli() {
		return this.codeRivoli;
	}

	public void setCodeRivoli(String codeRivoli) {
		this.codeRivoli = codeRivoli;
	}

	public String getCommune() {
		return this.commune;
	}

	public void setCommune(String commune) {
		this.commune = commune;
	}

	public String getComplVoie() {
		return this.complVoie;
	}

	public void setComplVoie(String complVoie) {
		this.complVoie = complVoie;
	}

	public Timestamp getDateMajParMediapost() {
		return this.dateMajParMediapost;
	}

	public void setDateMajParMediapost(Timestamp dateMajParMediapost) {
		this.dateMajParMediapost = dateMajParMediapost;
	}

	public Integer getIdAdressePrincipale() {
		return this.idAdressePrincipale;
	}

	public void setIdAdressePrincipale(Integer idAdressePrincipale) {
		this.idAdressePrincipale = idAdressePrincipale;
	}

	public String getNomVoie() {
		return this.nomVoie;
	}

	public void setNomVoie(String nomVoie) {
		this.nomVoie = nomVoie;
	}

	public Integer getNumVoie() {
		return this.numVoie;
	}

	public void setNumVoie(Integer numVoie) {
		this.numVoie = numVoie;
	}

	public String getTypeVoie() {
		return this.typeVoie;
	}

	public void setTypeVoie(String typeVoie) {
		this.typeVoie = typeVoie;
	}

	public String getZone() {
		return this.zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public List<TBatimentBat> getTBatimentBats() {
		return this.TBatimentBats;
	}

	public void setTBatimentBats(List<TBatimentBat> TBatimentBats) {
		this.TBatimentBats = TBatimentBats;
	}

	public TBatimentBat addTBatimentBat(TBatimentBat TBatimentBat) {
		getTBatimentBats().add(TBatimentBat);
		TBatimentBat.setTAdresseAdr(this);

		return TBatimentBat;
	}

	public TBatimentBat removeTBatimentBat(TBatimentBat TBatimentBat) {
		getTBatimentBats().remove(TBatimentBat);
		TBatimentBat.setTAdresseAdr(null);

		return TBatimentBat;
	}

}