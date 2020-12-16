package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.test.dto.FormDataVO;
import com.test.service.FormDataService;
import com.test.util.ResponseVO;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/formdata")
public class FormDataController {
	
	@Autowired
	private FormDataService formDataService;

	@PostMapping(value = "/saveOrUpdateForm", consumes = "application/json")
	public ResponseVO saveOrUpdateForm(@RequestBody String formData ) {
		Gson gson = new Gson();
		FormDataVO formDataVO= gson.fromJson(formData, FormDataVO.class);
		System.out.println("formDesignVO"+formDataVO);
		 
		return formDataService.saveOrUpdateForm(formDataVO);
	}

	
	@GetMapping("/getAll")
	public ResponseVO getAllEmployees() {
		return formDataService.findAll();
	}
	
}
