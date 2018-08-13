package com.axione.validateur.stoc.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the t_batiment_bat database table.
 * 
 */
@Entity
@Table(name="t_batiment_bat")
@NamedQuery(name="TBatimentBat.findAll", query="SELECT t FROM TBatimentBat t")
public class TBatimentBat implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="conditions_syndic")
	private String conditionsSyndic;

	@Column(name="date_cablage")
	private Timestamp dateCablage;

	@Column(name="date_debut_acceptation_crcmd_access")
	private Timestamp dateDebutAcceptationCrcmdAccess;

	@Column(name="date_debut_furniture_crcmd_access")
	private Timestamp dateDebutFurnitureCrcmdAccess;

	@Temporal(TemporalType.DATE)
	@Column(name="date_ouverture_commerciale")
	private Date dateOuvertureCommerciale;

	@Column(name="date_ouverture_commerciales")
	private Timestamp dateOuvertureCommerciales;

	@Temporal(TemporalType.DATE)
	@Column(name="date_retablissement_pm")
	private Date dateRetablissementPm;

	private String etat;

	@Column(name="etat_elig")
	private String etatElig;

	@Column(name="etat_prerac")
	private String etatPrerac;

	@Column(name="geo_projection")
	private String geoProjection;

	@Column(name="geo_x")
	private double geoX;

	@Column(name="geo_y")
	private double geoY;

	@Column(name="id_immeuble")
	private String idImmeuble;

	@Column(name="id_netdesigner")
	private String idNetdesigner;

	@Column(name="nombre_logement_immeuble")
	private Integer nombreLogementImmeuble;

	private String ref;

	@Column(name="reference_ban")
	private String referenceBan;

	@Column(name="type_logement")
	private String typeLogement;

	@Column(name="wgs84_lat")
	private double wgs84Lat;

	@Column(name="wgs84_long")
	private double wgs84Long;

	//bi-directional many-to-one association to TAdresseAdr
	@ManyToOne
	@JoinColumn(name="adr_id")
	private TAdresseAdr TAdresseAdr;

	//bi-directional many-to-one association to TEscalierEsc
	@OneToMany(mappedBy="TBatimentBat")
	private List<TEscalierEsc> TEscalierEscs;

	public TBatimentBat() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getConditionsSyndic() {
		return this.conditionsSyndic;
	}

	public void setConditionsSyndic(String conditionsSyndic) {
		this.conditionsSyndic = conditionsSyndic;
	}

	public Timestamp getDateCablage() {
		return this.dateCablage;
	}

	public void setDateCablage(Timestamp dateCablage) {
		this.dateCablage = dateCablage;
	}

	public Timestamp getDateDebutAcceptationCrcmdAccess() {
		return this.dateDebutAcceptationCrcmdAccess;
	}

	public void setDateDebutAcceptationCrcmdAccess(Timestamp dateDebutAcceptationCrcmdAccess) {
		this.dateDebutAcceptationCrcmdAccess = dateDebutAcceptationCrcmdAccess;
	}

	public Timestamp getDateDebutFurnitureCrcmdAccess() {
		return this.dateDebutFurnitureCrcmdAccess;
	}

	public void setDateDebutFurnitureCrcmdAccess(Timestamp dateDebutFurnitureCrcmdAccess) {
		this.dateDebutFurnitureCrcmdAccess = dateDebutFurnitureCrcmdAccess;
	}

	public Date getDateOuvertureCommerciale() {
		return this.dateOuvertureCommerciale;
	}

	public void setDateOuvertureCommerciale(Date dateOuvertureCommerciale) {
		this.dateOuvertureCommerciale = dateOuvertureCommerciale;
	}

	public Timestamp getDateOuvertureCommerciales() {
		return this.dateOuvertureCommerciales;
	}

	public void setDateOuvertureCommerciales(Timestamp dateOuvertureCommerciales) {
		this.dateOuvertureCommerciales = dateOuvertureCommerciales;
	}

	public Date getDateRetablissementPm() {
		return this.dateRetablissementPm;
	}

	public void setDateRetablissementPm(Date dateRetablissementPm) {
		this.dateRetablissementPm = dateRetablissementPm;
	}

	public String getEtat() {
		return this.etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public String getEtatElig() {
		return this.etatElig;
	}

	public void setEtatElig(String etatElig) {
		this.etatElig = etatElig;
	}

	public String getEtatPrerac() {
		return this.etatPrerac;
	}

	public void setEtatPrerac(String etatPrerac) {
		this.etatPrerac = etatPrerac;
	}

	public String getGeoProjection() {
		return this.geoProjection;
	}

	public void setGeoProjection(String geoProjection) {
		this.geoProjection = geoProjection;
	}

	public double getGeoX() {
		return this.geoX;
	}

	public void setGeoX(double geoX) {
		this.geoX = geoX;
	}

	public double getGeoY() {
		return this.geoY;
	}

	public void setGeoY(double geoY) {
		this.geoY = geoY;
	}

	public String getIdImmeuble() {
		return this.idImmeuble;
	}

	public void setIdImmeuble(String idImmeuble) {
		this.idImmeuble = idImmeuble;
	}

	public String getIdNetdesigner() {
		return this.idNetdesigner;
	}

	public void setIdNetdesigner(String idNetdesigner) {
		this.idNetdesigner = idNetdesigner;
	}

	public Integer getNombreLogementImmeuble() {
		return this.nombreLogementImmeuble;
	}

	public void setNombreLogementImmeuble(Integer nombreLogementImmeuble) {
		this.nombreLogementImmeuble = nombreLogementImmeuble;
	}

	public String getRef() {
		return this.ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public String getReferenceBan() {
		return this.referenceBan;
	}

	public void setReferenceBan(String referenceBan) {
		this.referenceBan = referenceBan;
	}

	public String getTypeLogement() {
		return this.typeLogement;
	}

	public void setTypeLogement(String typeLogement) {
		this.typeLogement = typeLogement;
	}

	public double getWgs84Lat() {
		return this.wgs84Lat;
	}

	public void setWgs84Lat(double wgs84Lat) {
		this.wgs84Lat = wgs84Lat;
	}

	public double getWgs84Long() {
		return this.wgs84Long;
	}

	public void setWgs84Long(double wgs84Long) {
		this.wgs84Long = wgs84Long;
	}

	public TAdresseAdr getTAdresseAdr() {
		return this.TAdresseAdr;
	}

	public void setTAdresseAdr(TAdresseAdr TAdresseAdr) {
		this.TAdresseAdr = TAdresseAdr;
	}

	public List<TEscalierEsc> getTEscalierEscs() {
		return this.TEscalierEscs;
	}

	public void setTEscalierEscs(List<TEscalierEsc> TEscalierEscs) {
		this.TEscalierEscs = TEscalierEscs;
	}

	public TEscalierEsc addTEscalierEsc(TEscalierEsc TEscalierEsc) {
		getTEscalierEscs().add(TEscalierEsc);
		TEscalierEsc.setTBatimentBat(this);

		return TEscalierEsc;
	}

	public TEscalierEsc removeTEscalierEsc(TEscalierEsc TEscalierEsc) {
		getTEscalierEscs().remove(TEscalierEsc);
		TEscalierEsc.setTBatimentBat(null);

		return TEscalierEsc;
	}

}