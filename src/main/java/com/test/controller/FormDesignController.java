package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.test.dto.FormDesignVO;
import com.test.exception.ResourceNotFoundException;
import com.test.service.FormDesignService;
import com.test.util.ResponseVO;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/formdesign")
public class FormDesignController {
	
	@Autowired
	private FormDesignService formDesignService;

	@PostMapping(value = "/saveOrUpdateForm", consumes = "application/json")
	public ResponseVO saveOrUpdateForm(@RequestBody String formDesign ) {
		Gson gson = new Gson();
		FormDesignVO formDesignVO= gson.fromJson(formDesign, FormDesignVO.class);
		System.out.println("formDesignVO"+formDesignVO);
		 
		return formDesignService.saveOrUpdateForm(formDesignVO);
	}
	
	@GetMapping(value ="/{formName}",produces = "application/json")
	public ResponseVO getDynamicForm(@PathVariable(value = "formName") String formName)
			throws ResourceNotFoundException {
		ResponseVO findDynamicFormByFormName = formDesignService.findDynamicFormByFormName(formName);
		return findDynamicFormByFormName;
	}


	
}
