package com.test.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonRawValue;

public class FormDesignVO {

	private Long formDesignId;

	private String formName;

	private Date createdDate;

	private Date modifiedDate;

	@JsonRawValue
	private Object formStructure;

	public Long getFormDesignId() {
		return formDesignId;
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

	public Object getFormStructure() {
		return formStructure;
	}

	public void setFormStructure(Object formStructure) {
		this.formStructure = formStructure;
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

	@Override
	public String toString() {
		return "FormDesign [formDesignId=" + formDesignId + ", createdDate=" + createdDate + ", formStructure="
				+ formStructure + "]";
	}

}
