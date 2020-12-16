package com.test.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "form_design")
public class FormDesign {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "form_design_id", nullable = false)
	private Long formDesignId;

	@Column(name = "created_date", nullable = false,updatable = false)
	private Date createdDate;

	@Column(name = "modified_date", nullable = false)
	private Date modifiedDate;

	@Column(name = "form_structure", nullable = false)
	private String formStructure;
	
	@Column(name = "form_name", nullable = false)
	private String formName;

	public Long getFormDesignId() {
		return formDesignId;
	}

	public String getFormName() {
		return formName;
	}

	public void setFormName(String formName) {
		this.formName = formName;
	}

	public void setFormDesignId(Long formDesignId) {
		this.formDesignId = formDesignId;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getFormStructure() {
		return formStructure;
	}

	public void setFormStructure(String formStructure) {
		this.formStructure = formStructure;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	@Override
	public String toString() {
		return "FormDesign [formDesignId=" + formDesignId + ", createdDate=" + createdDate + ", formStructure="
				+ formStructure + "]";
	}

}
