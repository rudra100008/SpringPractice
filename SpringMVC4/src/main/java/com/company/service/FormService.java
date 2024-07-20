package com.company.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.company.dao.FormDao;
import com.company.model.Form;

import jakarta.transaction.Transactional;

@Service
public class FormService {
	@Autowired
   private FormDao  formDao;
	

    @Transactional
    public void createForm(Form form) {
        formDao.saveForm(form);
    }

    @Transactional
    public List<Form> getAllForms() {
        return formDao.getForm();
    }
}
