package com.test.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.test.model.FormDesign;

@Repository
@Transactional
public interface FormDesignRepository extends JpaRepository<FormDesign, Long>{

	@Query(nativeQuery = true,value="select * from form_design f where f.form_name=?1 order by f.form_design_id desc limit 1 ")
	public FormDesign findDynamicFormByFormName(String formName);
	
	

}
