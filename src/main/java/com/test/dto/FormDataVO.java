package com.test.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonRawValue;

public class FormDataVO {

	private Long formDataId;

	private Date createdDate;

	private Date modifiedDate;

	@JsonRawValue
	private Object formData;

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

	public String getFormName() {
		return formName;
	}

	public void setFormName(String formName) {
		this.formName = formName;
	}

	public Object getFormData() {
		return formData;
	}

	public void setFormData(Object formData) {
		this.formData = formData;
	}

}
