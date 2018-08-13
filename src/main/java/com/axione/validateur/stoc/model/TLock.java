package com.axione.validateur.stoc.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the t_lock database table.
 * 
 */
@Entity
@Table(name="t_lock")
@NamedQuery(name="TLock.findAll", query="SELECT t FROM TLock t")
public class TLock implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="date_debut")
	private Timestamp dateDebut;

	@Column(name="date_fin")
	private Timestamp dateFin;

	public TLock() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Timestamp getDateDebut() {
		return this.dateDebut;
	}

	public void setDateDebut(Timestamp dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Timestamp getDateFin() {
		return this.dateFin;
	}

	public void setDateFin(Timestamp dateFin) {
		this.dateFin = dateFin;
	}

}