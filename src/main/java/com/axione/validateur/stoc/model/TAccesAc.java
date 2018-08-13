package com.axione.validateur.stoc.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the t_acces_ac database table.
 * 
 */
@Entity
@Table(name="t_acces_ac")
@NamedQuery(name="TAccesAc.findAll", query="SELECT t FROM TAccesAc t")
public class TAccesAc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="adresse_ip")
	private String adresseIp;

	@Column(name="black_listed")
	private Boolean blackListed;

	private Timestamp date;

	public TAccesAc() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAdresseIp() {
		return this.adresseIp;
	}

	public void setAdresseIp(String adresseIp) {
		this.adresseIp = adresseIp;
	}

	public Boolean getBlackListed() {
		return this.blackListed;
	}

	public void setBlackListed(Boolean blackListed) {
		this.blackListed = blackListed;
	}

	public Timestamp getDate() {
		return this.date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

}