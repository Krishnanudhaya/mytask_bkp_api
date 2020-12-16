package com.test.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dto.FormDataVO;
import com.test.model.FormData;
import com.test.repository.FormDataRepository;
import com.test.service.FormDataService;
import com.test.util.ResponseVO;

@Service
public class FormDataServiceImpl implements FormDataService {

	@Autowired
	FormDataRepository formDataRepository;

	@Override
	public ResponseVO saveOrUpdateForm(FormDataVO formDataVO) {
		ResponseVO responseVO = new ResponseVO();
		try {
			FormData formData = new FormData();
			BeanUtils.copyProperties(formDataVO, formData);
			if (formData.getFormDataId() == null)
				formData.setCreatedDate(new Date());
			formData.setFormData(new com.google.gson.Gson().toJson(formDataVO.getFormData()));
			formData.setModifiedDate(new Date());
			FormData save = formDataRepository.save(formData);

			if (save.getFormDataId() != null) {
				responseVO.setData(true);
				responseVO.setPayload(null);
				responseVO.setException(false);
			}

		} catch (Exception e) {
			System.out.println("Exception : " + e.getMessage());
		}

		return responseVO;
	}

	@Override
	public ResponseVO findById(Long formId) {

		return null;
	}

	@Override
	public ResponseVO findAll() {
		ResponseVO responseVO = new ResponseVO();
		try {
			 List<FormData> findAll = formDataRepository.findAll() ;

			if (!findAll.isEmpty()) {
				responseVO.setData(true);
				responseVO.setPayload(findAll);
				responseVO.setException(false);
			}

		} catch (Exception e) {
			System.out.println("Exception : " + e.getMessage());
		}

		return responseVO;
	}

}
