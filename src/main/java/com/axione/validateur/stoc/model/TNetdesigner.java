package com.axione.validateur.stoc.model;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_netdesigner database table.
 * 
 */
@Entity
@Table(name="t_netdesigner")
@NamedQuery(name="TNetdesigner.findAll", query="SELECT t FROM TNetdesigner t")
public class TNetdesigner implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	private Integer id;

	@Column(name="reference_pto")
	private String referencePto;

	@Column(name="status_pto")
	private String statusPto;

	public TNetdesigner() {
	}

	public String getReferencePto() {
		return this.referencePto;
	}

	public void setReferencePto(String referencePto) {
		this.referencePto = referencePto;
	}

	public String getStatusPto() {
		return this.statusPto;
	}

	public void setStatusPto(String statusPto) {
		this.statusPto = statusPto;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
}