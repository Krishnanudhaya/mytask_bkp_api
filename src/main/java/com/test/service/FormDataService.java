package com.test.service;

import com.test.dto.FormDataVO;
import com.test.util.ResponseVO;

public interface FormDataService {

	public ResponseVO saveOrUpdateForm(FormDataVO formDataVO);
	public ResponseVO findById(Long formId);
	public ResponseVO findAll();
}
