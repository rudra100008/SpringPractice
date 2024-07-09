package com.company.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import com.company.Model.User;

import jakarta.transaction.Transactional;


@Repository
public class UserDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	@Transactional
	public  int saveUser(User user) {
	   int id=	(Integer)this.hibernateTemplate.save(user);
	   return id;
	}

}
