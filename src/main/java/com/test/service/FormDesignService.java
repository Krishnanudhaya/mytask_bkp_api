package com.test.service;

import com.test.dto.FormDesignVO;
import com.test.util.ResponseVO;

public interface FormDesignService {

	public ResponseVO saveOrUpdateForm(FormDesignVO formDesignVO);
	public ResponseVO findDynamicFormByFormName(String formName);
	public ResponseVO findAll();
}
