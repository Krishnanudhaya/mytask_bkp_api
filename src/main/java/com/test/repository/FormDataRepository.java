package com.test.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.model.FormData;

@Repository
@Transactional
public interface FormDataRepository extends JpaRepository<FormData, Long>{
	
	

}
