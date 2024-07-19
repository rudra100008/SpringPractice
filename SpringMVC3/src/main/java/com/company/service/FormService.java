package com.company.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.company.dao.FormDao;
import com.company.model.Form;

@Service
public class FormService {
	@Autowired
   private FormDao  formDao;
	public long createForm(Form form) {
		return this.formDao.saveForm(form);
	}
}
