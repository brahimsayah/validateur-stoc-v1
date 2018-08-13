package com.axione.validateur.stoc.dto;

import java.util.Date;
import java.util.Random;

public class PriseDto {

	
    private Integer ID; 
	private String ReferenceCommandePriseInterneOC;
	private String CommuneImmeuble;
	private String CodePostalImmeuble;
	private String CodeInseeImmeuble;
	private String CodeVoieRivoliImmeuble;
	private Integer NumeroVoieImmeuble;
	private String ComplementNumeroVoieImmeuble;
	private String TypeVoieImmeuble;
	private String LibelleVoieImmeuble;
	private String CodeAdresseImmeuble;
	private String Batiment;
	private String Escalier;
	private String Etage;
	private String TypeRacco;
	private Date DateInstall;
	private String NomClient;
	private String PrenomClient;
	private String ContactClient1;
	private String ContactClient2;
	private String IdRdv;
	private String ReferencePrestationPm;
	private String ReferencePm;
	private String ReferencePrise;
	private String PriseExistante;
	private String TypeCommandeDemande;
	private Date DateCommandePrise;
	private String CommentaireCmdAcces;
	private String InfoCmdAcces1;
	private String InfoCmdAcces2;
	private String InfoCmdAcces3;
	private String InfoCmdAcces4;
	private String InfoCmdAcces5;
	private String InfoCmdAcces6;
	private String InfoCmdAcces7;
	private String InfoCmdAcces8;
	
	private  String IdentifiantImmeuble;
	private  String  OffreAccesCommandee;

	/**
	 * @return the referenceCommandePriseInterneOC
	 */
	public final String getReferenceCommandePriseInterneOC() {
		return ReferenceCommandePriseInterneOC;
	}

	/**
	 * @param string
	 *            the referenceCommandePriseInterneOC to set
	 */
	public final void setReferenceCommandePriseInterneOC(String string) {
		ReferenceCommandePriseInterneOC = string;
	}


	/**
	 * @return the communeImmeuble
	 */
	public final String getCommuneImmeuble() {
		return CommuneImmeuble;
	}

	/**
	 * @param communeImmeuble
	 *            the communeImmeuble to set
	 */
	public final void setCommuneImmeuble(String communeImmeuble) {
		CommuneImmeuble = communeImmeuble;
	}

	/**
	 * @return the codeInseeImmeuble
	 */
	public final String getCodeInseeImmeuble() {
		return CodeInseeImmeuble;
	}

	/**
	 * @param codeInseeImmeuble
	 *            the codeInseeImmeuble to set
	 */
	public final void setCodeInseeImmeuble(String codeInseeImmeuble) {
		CodeInseeImmeuble = codeInseeImmeuble;
	}

	/**
	 * @return the codeVoieRivoliImmeuble
	 */
	public final String getCodeVoieRivoliImmeuble() {
		return CodeVoieRivoliImmeuble;
	}

	/**
	 * @param codeVoieRivoliImmeuble
	 *            the codeVoieRivoliImmeuble to set
	 */
	public final void setCodeVoieRivoliImmeuble(String codeVoieRivoliImmeuble) {
		CodeVoieRivoliImmeuble = codeVoieRivoliImmeuble;
	}

	/**
	 * @return the numeroVoieImmeuble
	 */
	public final Integer getNumeroVoieImmeuble() {
		return NumeroVoieImmeuble;
	}

	/**
	 * @param numeroVoieImmeuble
	 *            the numeroVoieImmeuble to set
	 */
	public final void setNumeroVoieImmeuble(Integer numeroVoieImmeuble) {
		NumeroVoieImmeuble = numeroVoieImmeuble;
	}

	/**
	 * @return the complementNumeroVoieImmeuble
	 */
	public final String getComplementNumeroVoieImmeuble() {
		return ComplementNumeroVoieImmeuble;
	}

	/**
	 * @param complementNumeroVoieImmeuble
	 *            the complementNumeroVoieImmeuble to set
	 */
	public final void setComplementNumeroVoieImmeuble(String complementNumeroVoieImmeuble) {
		ComplementNumeroVoieImmeuble = complementNumeroVoieImmeuble;
	}

	/**
	 * @return the typeVoieImmeuble
	 */
	public final String getTypeVoieImmeuble() {
		return TypeVoieImmeuble;
	}

	/**
	 * @param typeVoieImmeuble
	 *            the typeVoieImmeuble to set
	 */
	public final void setTypeVoieImmeuble(String typeVoieImmeuble) {
		TypeVoieImmeuble = typeVoieImmeuble;
	}

	/**
	 * @return the libelleVoieImmeuble
	 */
	public final String getLibelleVoieImmeuble() {
		return LibelleVoieImmeuble;
	}

	/**
	 * @param libelleVoieImmeuble
	 *            the libelleVoieImmeuble to set
	 */
	public final void setLibelleVoieImmeuble(String libelleVoieImmeuble) {
		LibelleVoieImmeuble = libelleVoieImmeuble;
	}

	/**
	 * @return the codeAdresseImmeuble
	 */
	public final String getCodeAdresseImmeuble() {
		return CodeAdresseImmeuble;
	}

	/**
	 * @param codeAdresseImmeuble
	 *            the codeAdresseImmeuble to set
	 */
	public final void setCodeAdresseImmeuble(String codeAdresseImmeuble) {
		CodeAdresseImmeuble = codeAdresseImmeuble;
	}

	/**
	 * @return the batiment
	 */
	public final String getBatiment() {
		return Batiment;
	}

	/**
	 * @param batiment
	 *            the batiment to set
	 */
	public final void setBatiment(String batiment) {
		Batiment = batiment;
	}

	/**
	 * @return the escalier
	 */
	public final String getEscalier() {
		return Escalier;
	}

	/**
	 * @param escalier
	 *            the escalier to set
	 */
	public final void setEscalier(String escalier) {
		Escalier = escalier;
	}

	/**
	 * @return the etage
	 */
	public final String getEtage() {
		return Etage;
	}

	/**
	 * @param etage
	 *            the etage to set
	 */
	public final void setEtage(String etage) {
		Etage = etage;
	}

	/**
	 * @return the typeRacco
	 */
	public final String getTypeRacco() {
		return TypeRacco;
	}

	/**
	 * @param typeRacco
	 *            the typeRacco to set
	 */
	public final void setTypeRacco(String typeRacco) {
		TypeRacco = typeRacco;
	}

	/**
	 * @return the dateInstall
	 */
	public final Date getDateInstall() {
		return DateInstall;
	}

	/**
	 * @param dateInstall
	 *            the dateInstall to set
	 */
	public final void setDateInstall(Date dateInstall) {
		DateInstall = dateInstall;
	}

	/**
	 * @return the nomClient
	 */
	public final String getNomClient() {
		return NomClient;
	}

	/**
	 * @param nomClient
	 *            the nomClient to set
	 */
	public final void setNomClient(String nomClient) {
		NomClient = nomClient;
	}

	/**
	 * @return the prenomClient
	 */
	public final String getPrenomClient() {
		return PrenomClient;
	}

	/**
	 * @param prenomClient
	 *            the prenomClient to set
	 */
	public final void setPrenomClient(String prenomClient) {
		PrenomClient = prenomClient;
	}

	/**
	 * @return the contactClient2
	 */
	public final String getContactClient2() {
		return ContactClient2;
	}

	/**
	 * @param contactClient2
	 *            the contactClient2 to set
	 */
	public final void setContactClient2(String contactClient2) {
		ContactClient2 = contactClient2;
	}

	/**
	 * @return the idRdv
	 */
	public final String getIdRdv() {
		return IdRdv;
	}

	/**
	 * @param idRdv
	 *            the idRdv to set
	 */
	public final void setIdRdv(String idRdv) {
		IdRdv = idRdv;
	}

	/**
	 * @return the referencePrestationPm
	 */
	public final String getReferencePrestationPm() {
		return ReferencePrestationPm;
	}

	/**
	 * @param referencePrestationPm
	 *            the referencePrestationPm to set
	 */
	public final void setReferencePrestationPm(String referencePrestationPm) {
		ReferencePrestationPm = referencePrestationPm;
	}


	/**
	 * @return the referencePrise
	 */
	public final String getReferencePrise() {
		return ReferencePrise;
	}

	/**
	 * @param referencePrise
	 *            the referencePrise to set
	 */
	public final void setReferencePrise(String referencePrise) {
		ReferencePrise = referencePrise;
	}

	/**
	 * @return the priseExistante
	 */
	public final String getPriseExistante() {
		return PriseExistante;
	}

	/**
	 * @param priseExistante
	 *            the priseExistante to set
	 */
	public final void setPriseExistante(String priseExistante) {
		PriseExistante = priseExistante;
	}

	/**
	 * @return the typeCommandeDemande
	 */
	public final String getTypeCommandeDemande() {
		return TypeCommandeDemande;
	}

	/**
	 * @param typeCommandeDemande
	 *            the typeCommandeDemande to set
	 */
	public final void setTypeCommandeDemande(String typeCommandeDemande) {
		TypeCommandeDemande = typeCommandeDemande;
	}

	/**
	 * @return the dateCommandePrise
	 */
	public final Date getDateCommandePrise() {
		return DateCommandePrise;
	}

	/**
	 * @param dateCommandePrise
	 *            the dateCommandePrise to set
	 */
	public final void setDateCommandePrise(Date dateCommandePrise) {
		DateCommandePrise = dateCommandePrise;
	}

	/**
	 * @return the commentaireCmdAcces
	 */
	public final String getCommentaireCmdAcces() {
		return CommentaireCmdAcces;
	}

	/**
	 * @param commentaireCmdAcces
	 *            the commentaireCmdAcces to set
	 */
	public final void setCommentaireCmdAcces(String commentaireCmdAcces) {
		CommentaireCmdAcces = commentaireCmdAcces;
	}

	/**
	 * @return the infoCmdAcces1
	 */
	public final String getInfoCmdAcces1() {
		return InfoCmdAcces1;
	}

	/**
	 * @param infoCmdAcces1
	 *            the infoCmdAcces1 to set
	 */
	public final void setInfoCmdAcces1(String infoCmdAcces1) {
		InfoCmdAcces1 = infoCmdAcces1;
	}

	/**
	 * @return the infoCmdAcces2
	 */
	public final String getInfoCmdAcces2() {
		return InfoCmdAcces2;
	}

	/**
	 * @param infoCmdAcces2
	 *            the infoCmdAcces2 to set
	 */
	public final void setInfoCmdAcces2(String infoCmdAcces2) {
		InfoCmdAcces2 = infoCmdAcces2;
	}

	/**
	 * @return the infoCmdAcces3
	 */
	public final String getInfoCmdAcces3() {
		return InfoCmdAcces3;
	}

	/**
	 * @param infoCmdAcces3
	 *            the infoCmdAcces3 to set
	 */
	public final void setInfoCmdAcces3(String infoCmdAcces3) {
		InfoCmdAcces3 = infoCmdAcces3;
	}

	/**
	 * @return the infoCmdAcces4
	 */
	public final String getInfoCmdAcces4() {
		return InfoCmdAcces4;
	}

	/**
	 * @param infoCmdAcces4
	 *            the infoCmdAcces4 to set
	 */
	public final void setInfoCmdAcces4(String infoCmdAcces4) {
		InfoCmdAcces4 = infoCmdAcces4;
	}

	/**
	 * @return the infoCmdAcces5
	 */
	public final String getInfoCmdAcces5() {
		return InfoCmdAcces5;
	}

	/**
	 * @param infoCmdAcces5
	 *            the infoCmdAcces5 to set
	 */
	public final void setInfoCmdAcces5(String infoCmdAcces5) {
		InfoCmdAcces5 = infoCmdAcces5;
	}

	/**
	 * @return the infoCmdAcces6
	 */
	public final String getInfoCmdAcces6() {
		return InfoCmdAcces6;
	}

	/**
	 * @param infoCmdAcces6
	 *            the infoCmdAcces6 to set
	 */
	public final void setInfoCmdAcces6(String infoCmdAcces6) {
		InfoCmdAcces6 = infoCmdAcces6;
	}

	/**
	 * @return the infoCmdAcces7
	 */
	public final String getInfoCmdAcces7() {
		return InfoCmdAcces7;
	}

	/**
	 * @param infoCmdAcces7
	 *            the infoCmdAcces7 to set
	 */
	public final void setInfoCmdAcces7(String infoCmdAcces7) {
		InfoCmdAcces7 = infoCmdAcces7;
	}

	/**
	 * @return the infoCmdAcces8
	 */
	public final String getInfoCmdAcces8() {
		return InfoCmdAcces8;
	}

	/**
	 * @param infoCmdAcces8
	 *            the infoCmdAcces8 to set
	 */
	public final void setInfoCmdAcces8(String infoCmdAcces8) {
		InfoCmdAcces8 = infoCmdAcces8;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getCodePostalImmeuble() {
		return CodePostalImmeuble;
	}

	public void setCodePostalImmeuble(String codePostalImmeuble) {
		CodePostalImmeuble = codePostalImmeuble;
	}

	public String getContactClient1() {
		return ContactClient1;
	}

	public void setContactClient1(String contactClient1) {
		ContactClient1 = contactClient1;
	}

	public String getReferencePm() {
		return ReferencePm;
	}

	public void setReferencePm(String referencePm) {
		ReferencePm = referencePm;
	}

	public String getIdentifiantImmeuble() {
		return IdentifiantImmeuble;
	}

	public void setIdentifiantImmeuble(String identifiantImmeuble) {
		IdentifiantImmeuble = identifiantImmeuble;
	}

	public String getOffreAccesCommandee() {
		return OffreAccesCommandee;
	}

	public void setOffreAccesCommandee(String offreAccesCommandee) {
		OffreAccesCommandee = offreAccesCommandee;
	}
	
	
	

}
