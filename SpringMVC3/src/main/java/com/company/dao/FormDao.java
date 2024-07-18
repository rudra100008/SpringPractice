package com.company.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import com.company.model.Form;
import jakarta.transaction.Transactional;

@Repository
public class FormDao {
	@Autowired
   private HibernateTemplate hibernateTemplate;
	@Transactional
	public int saveForm(Form form) {
		return  (Integer)this.hibernateTemplate.save(form);
		
	}
}
