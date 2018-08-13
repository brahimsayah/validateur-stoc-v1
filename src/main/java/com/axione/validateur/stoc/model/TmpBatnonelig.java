package com.axione.validateur.stoc.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tmp_batnonelig database table.
 * 
 */
//@Entity
//@Table(name="tmp_batnonelig")
//@NamedQuery(name="TmpBatnonelig.findAll", query="SELECT t FROM TmpBatnonelig t")
public class TmpBatnonelig implements Serializable {
	private static final long serialVersionUID = 1L;
    
	private Integer idnonelig;

	public TmpBatnonelig() {
	}

	public Integer getIdnonelig() {
		return this.idnonelig;
	}

	public void setIdnonelig(Integer idnonelig) {
		this.idnonelig = idnonelig;
	}

}