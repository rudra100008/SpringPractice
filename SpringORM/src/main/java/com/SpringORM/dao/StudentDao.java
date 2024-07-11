package com.SpringORM.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.SpringORM.entity.Student;

import jakarta.transaction.Transactional;

public class StudentDao {
	
   
	private HibernateTemplate hibernateTemplate;
	 @Transactional
  public  int insert(Student student) {
	 Integer id=(Integer) this.hibernateTemplate.save(student);
	  return id;
  }
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
}
