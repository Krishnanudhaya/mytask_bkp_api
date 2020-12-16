package com.test.service.impl;

import java.util.Date;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dto.FormDesignVO;
import com.test.model.FormDesign;
import com.test.repository.FormDesignRepository;
import com.test.service.FormDesignService;
import com.test.util.ResponseVO;

@Service
public class FormDesignServiceImpl implements FormDesignService {

	@Autowired
	FormDesignRepository formDesignRepository;

	@Override
	public ResponseVO saveOrUpdateForm(FormDesignVO formDesignVO) {
		ResponseVO responseVO = new ResponseVO();
		try {

			FormDesign save = formDesignRepository.save(transformFormDesign(formDesignVO));

			if (save.getFormDesignId() != null) {
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
	public ResponseVO findDynamicFormByFormName(String formName) {
		ResponseVO responseVO = new ResponseVO();
		try {

			FormDesign formDesignObj = formDesignRepository.findDynamicFormByFormName(formName);

			if (formDesignObj != null) {
				responseVO.setData(true);
				responseVO.setPayload(transformFormDesignVO(formDesignObj));
				responseVO.setException(false);
			}

		} catch (Exception e) {
			System.out.println("Exception : " + e.getMessage());
		}

		return responseVO;
	}

	@Override
	public ResponseVO findAll() {

		return null;
	}

	public FormDesign transformFormDesign(FormDesignVO formDesignVO) {

		FormDesign formDesign = new FormDesign();
		formDesign.setFormDesignId(formDesignVO.getFormDesignId());
		
		if (formDesign.getFormDesignId() == null)
			formDesign.setCreatedDate(new Date());
		
		formDesign.setModifiedDate(new Date());
		formDesign.setFormName(formDesignVO.getFormName());
		formDesign.setFormStructure(new com.google.gson.Gson().toJson(formDesignVO.getFormStructure()));
		return formDesign;
	}

	public FormDesignVO transformFormDesignVO(FormDesign formDesign) {
		FormDesignVO formDesignVO = new FormDesignVO();
		formDesignVO.setFormDesignId(formDesign.getFormDesignId());
		formDesignVO.setCreatedDate(formDesign.getCreatedDate());
		formDesignVO.setModifiedDate(formDesign.getModifiedDate());
		formDesignVO.setFormStructure(formDesign.getFormStructure());
		return formDesignVO;
	}

}
