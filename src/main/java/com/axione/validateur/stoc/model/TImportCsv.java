package com.axione.validateur.stoc.model;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_import_csv database table.
 * 
 */
@Entity
@Table(name="t_import_csv")
@NamedQuery(name="TImportCsv.findAll", query="SELECT t FROM TImportCsv t")
public class TImportCsv implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="adr_code")
	private String adrCode;

	@Column(name="adr_code_postal")
	private String adrCodePostal;

	@Column(name="adr_code_voie")
	private String adrCodeVoie;

	@Column(name="adr_commune")
	private String adrCommune;

	@Column(name="adr_complement")
	private String adrComplement;

	@Column(name="adr_date_maj_mediapost")
	private String adrDateMajMediapost;

	@Column(name="adr_insee")
	private String adrInsee;

	@Column(name="adr_networks")
	private String adrNetworks;

	@Column(name="adr_nom")
	private String adrNom;

	@Column(name="adr_num")
	private String adrNum;

	@Column(name="adr_rivoli")
	private String adrRivoli;

	@Column(name="adr_type_voie")
	private String adrTypeVoie;

	@Column(name="adr_zone")
	private String adrZone;

	@Column(name="bat_cond_syndic")
	private String batCondSyndic;

	@Column(name="bat_date_cablage")
	private String batDateCablage;

	@Column(name="bat_date_debut_accept")
	private String batDateDebutAccept;

	@Column(name="bat_date_debut_furniture")
	private String batDateDebutFurniture;

	@Column(name="bat_date_ouv_com")
	private String batDateOuvCom;

	@Column(name="bat_etat")
	private String batEtat;

	@Column(name="bat_id_netdesigner")
	private String batIdNetdesigner;

	@Column(name="bat_imm")
	private String batImm;

	@Column(name="bat_no_log_imm")
	private String batNoLogImm;

	@Column(name="bat_ref")
	private String batRef;

	@Column(name="bat_ref_ban")
	private String batRefBan;

	@Column(name="bat_type_logement")
	private String batTypeLogement;

	private String error;

	@Column(name="esc_ref")
	private String escRef;

	@Column(name="etage_nb_locauxftth")
	private String etageNbLocauxftth;

	@Column(name="etage_ref")
	private String etageRef;

	@Column(name="fai_liste_noms")
	private String faiListeNoms;

	@Column(name="geo_proj")
	private String geoProj;

	@Column(name="geo_x")
	private String geoX;

	@Column(name="geo_y")
	private String geoY;

	@Column(name="pbo_ref")
	private String pboRef;

	@Column(name="pbo_type")
	private String pboType;

	@Column(name="pbo_type_racco_pbpto")
	private String pboTypeRaccoPbpto;

	@Column(name="pm_date_ouv_com")
	private String pmDateOuvCom;

	@Column(name="pm_date_prem_mad")
	private String pmDatePremMad;

	@Column(name="pm_date_retablissement")
	private String pmDateRetablissement;

	@Column(name="pm_ref")
	private String pmRef;

	@Column(name="pm_statut")
	private String pmStatut;

	@Column(name="pm_type_empl")
	private String pmTypeEmpl;

	@Column(name="pmt_ref")
	private String pmtRef;

	@Column(name="prdm_ref")
	private String prdmRef;

	@Column(name="prise_ref")
	private String priseRef;

	@Column(name="prise_statut")
	private String priseStatut;

	@Column(name="prise_type")
	private String priseType;

	public TImportCsv() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAdrCode() {
		return this.adrCode;
	}

	public void setAdrCode(String adrCode) {
		this.adrCode = adrCode;
	}

	public String getAdrCodePostal() {
		return this.adrCodePostal;
	}

	public void setAdrCodePostal(String adrCodePostal) {
		this.adrCodePostal = adrCodePostal;
	}

	public String getAdrCodeVoie() {
		return this.adrCodeVoie;
	}

	public void setAdrCodeVoie(String adrCodeVoie) {
		this.adrCodeVoie = adrCodeVoie;
	}

	public String getAdrCommune() {
		return this.adrCommune;
	}

	public void setAdrCommune(String adrCommune) {
		this.adrCommune = adrCommune;
	}

	public String getAdrComplement() {
		return this.adrComplement;
	}

	public void setAdrComplement(String adrComplement) {
		this.adrComplement = adrComplement;
	}

	public String getAdrDateMajMediapost() {
		return this.adrDateMajMediapost;
	}

	public void setAdrDateMajMediapost(String adrDateMajMediapost) {
		this.adrDateMajMediapost = adrDateMajMediapost;
	}

	public String getAdrInsee() {
		return this.adrInsee;
	}

	public void setAdrInsee(String adrInsee) {
		this.adrInsee = adrInsee;
	}

	public String getAdrNetworks() {
		return this.adrNetworks;
	}

	public void setAdrNetworks(String adrNetworks) {
		this.adrNetworks = adrNetworks;
	}

	public String getAdrNom() {
		return this.adrNom;
	}

	public void setAdrNom(String adrNom) {
		this.adrNom = adrNom;
	}

	public String getAdrNum() {
		return this.adrNum;
	}

	public void setAdrNum(String adrNum) {
		this.adrNum = adrNum;
	}

	public String getAdrRivoli() {
		return this.adrRivoli;
	}

	public void setAdrRivoli(String adrRivoli) {
		this.adrRivoli = adrRivoli;
	}

	public String getAdrTypeVoie() {
		return this.adrTypeVoie;
	}

	public void setAdrTypeVoie(String adrTypeVoie) {
		this.adrTypeVoie = adrTypeVoie;
	}

	public String getAdrZone() {
		return this.adrZone;
	}

	public void setAdrZone(String adrZone) {
		this.adrZone = adrZone;
	}

	public String getBatCondSyndic() {
		return this.batCondSyndic;
	}

	public void setBatCondSyndic(String batCondSyndic) {
		this.batCondSyndic = batCondSyndic;
	}

	public String getBatDateCablage() {
		return this.batDateCablage;
	}

	public void setBatDateCablage(String batDateCablage) {
		this.batDateCablage = batDateCablage;
	}

	public String getBatDateDebutAccept() {
		return this.batDateDebutAccept;
	}

	public void setBatDateDebutAccept(String batDateDebutAccept) {
		this.batDateDebutAccept = batDateDebutAccept;
	}

	public String getBatDateDebutFurniture() {
		return this.batDateDebutFurniture;
	}

	public void setBatDateDebutFurniture(String batDateDebutFurniture) {
		this.batDateDebutFurniture = batDateDebutFurniture;
	}

	public String getBatDateOuvCom() {
		return this.batDateOuvCom;
	}

	public void setBatDateOuvCom(String batDateOuvCom) {
		this.batDateOuvCom = batDateOuvCom;
	}

	public String getBatEtat() {
		return this.batEtat;
	}

	public void setBatEtat(String batEtat) {
		this.batEtat = batEtat;
	}

	public String getBatIdNetdesigner() {
		return this.batIdNetdesigner;
	}

	public void setBatIdNetdesigner(String batIdNetdesigner) {
		this.batIdNetdesigner = batIdNetdesigner;
	}

	public String getBatImm() {
		return this.batImm;
	}

	public void setBatImm(String batImm) {
		this.batImm = batImm;
	}

	public String getBatNoLogImm() {
		return this.batNoLogImm;
	}

	public void setBatNoLogImm(String batNoLogImm) {
		this.batNoLogImm = batNoLogImm;
	}

	public String getBatRef() {
		return this.batRef;
	}

	public void setBatRef(String batRef) {
		this.batRef = batRef;
	}

	public String getBatRefBan() {
		return this.batRefBan;
	}

	public void setBatRefBan(String batRefBan) {
		this.batRefBan = batRefBan;
	}

	public String getBatTypeLogement() {
		return this.batTypeLogement;
	}

	public void setBatTypeLogement(String batTypeLogement) {
		this.batTypeLogement = batTypeLogement;
	}

	public String getError() {
		return this.error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getEscRef() {
		return this.escRef;
	}

	public void setEscRef(String escRef) {
		this.escRef = escRef;
	}

	public String getEtageNbLocauxftth() {
		return this.etageNbLocauxftth;
	}

	public void setEtageNbLocauxftth(String etageNbLocauxftth) {
		this.etageNbLocauxftth = etageNbLocauxftth;
	}

	public String getEtageRef() {
		return this.etageRef;
	}

	public void setEtageRef(String etageRef) {
		this.etageRef = etageRef;
	}

	public String getFaiListeNoms() {
		return this.faiListeNoms;
	}

	public void setFaiListeNoms(String faiListeNoms) {
		this.faiListeNoms = faiListeNoms;
	}

	public String getGeoProj() {
		return this.geoProj;
	}

	public void setGeoProj(String geoProj) {
		this.geoProj = geoProj;
	}

	public String getGeoX() {
		return this.geoX;
	}

	public void setGeoX(String geoX) {
		this.geoX = geoX;
	}

	public String getGeoY() {
		return this.geoY;
	}

	public void setGeoY(String geoY) {
		this.geoY = geoY;
	}

	public String getPboRef() {
		return this.pboRef;
	}

	public void setPboRef(String pboRef) {
		this.pboRef = pboRef;
	}

	public String getPboType() {
		return this.pboType;
	}

	public void setPboType(String pboType) {
		this.pboType = pboType;
	}

	public String getPboTypeRaccoPbpto() {
		return this.pboTypeRaccoPbpto;
	}

	public void setPboTypeRaccoPbpto(String pboTypeRaccoPbpto) {
		this.pboTypeRaccoPbpto = pboTypeRaccoPbpto;
	}

	public String getPmDateOuvCom() {
		return this.pmDateOuvCom;
	}

	public void setPmDateOuvCom(String pmDateOuvCom) {
		this.pmDateOuvCom = pmDateOuvCom;
	}

	public String getPmDatePremMad() {
		return this.pmDatePremMad;
	}

	public void setPmDatePremMad(String pmDatePremMad) {
		this.pmDatePremMad = pmDatePremMad;
	}

	public String getPmDateRetablissement() {
		return this.pmDateRetablissement;
	}

	public void setPmDateRetablissement(String pmDateRetablissement) {
		this.pmDateRetablissement = pmDateRetablissement;
	}

	public String getPmRef() {
		return this.pmRef;
	}

	public void setPmRef(String pmRef) {
		this.pmRef = pmRef;
	}

	public String getPmStatut() {
		return this.pmStatut;
	}

	public void setPmStatut(String pmStatut) {
		this.pmStatut = pmStatut;
	}

	public String getPmTypeEmpl() {
		return this.pmTypeEmpl;
	}

	public void setPmTypeEmpl(String pmTypeEmpl) {
		this.pmTypeEmpl = pmTypeEmpl;
	}

	public String getPmtRef() {
		return this.pmtRef;
	}

	public void setPmtRef(String pmtRef) {
		this.pmtRef = pmtRef;
	}

	public String getPrdmRef() {
		return this.prdmRef;
	}

	public void setPrdmRef(String prdmRef) {
		this.prdmRef = prdmRef;
	}

	public String getPriseRef() {
		return this.priseRef;
	}

	public void setPriseRef(String priseRef) {
		this.priseRef = priseRef;
	}

	public String getPriseStatut() {
		return this.priseStatut;
	}

	public void setPriseStatut(String priseStatut) {
		this.priseStatut = priseStatut;
	}

	public String getPriseType() {
		return this.priseType;
	}

	public void setPriseType(String priseType) {
		this.priseType = priseType;
	}

}