package com.axione.validateur.stoc.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the t_journal_log database table.
 * 
 */
@Entity
@Table(name="t_journal_log")
@NamedQuery(name="TJournalLog.findAll", query="SELECT t FROM TJournalLog t")
public class TJournalLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private Timestamp date;

	private String username;

	@Column(name="ws_type")
	private String wsType;

	public TJournalLog() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Timestamp getDate() {
		return this.date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getWsType() {
		return this.wsType;
	}

	public void setWsType(String wsType) {
		this.wsType = wsType;
	}

}