package com.axione.validateur.stoc.model;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_config_cfg database table.
 * 
 */
//@Entity
//@Table(name="t_config_cfg")
//@NamedQuery(name="TConfigCfg.findAll", query="SELECT t FROM TConfigCfg t")
public class TConfigCfg implements Serializable {
	private static final long serialVersionUID = 1L;

	private String comment;

	private Integer id;

	private String name;

	private String type;

	private String value;

	public TConfigCfg() {
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}