package com.test.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonRawValue;

@Entity
@Table(name = "form_data")
public class FormData {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "form_data_id", nullable = false)
	private Long formDataId;

	@Column(name = "created_date", nullable = false,updatable = false)
	private Date createdDate;

	@Column(name = "modified_date", nullable = false)
	private Date modifiedDate;

	@Column(name = "form_data", nullable = false)
	@JsonRawValue
	private String formData;
	
	@Column(name = "form_name", nullable = false)
	private String formName;
	
	public Long getFormDataId() {
		return formDataId;
	}

	public void setFormDataId(Long formDataId) {
		this.formDataId = formDataId;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getFormData() {
		return formData;
	}

	public void setFormData(String formData) {
		this.formData = formData;
	}

	public String getFormName() {
		return formName;
	}

	public void setFormName(String formName) {
		this.formName = formName;
	}
	
}
