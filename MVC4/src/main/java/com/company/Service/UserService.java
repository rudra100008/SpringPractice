package com.company.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.company.Dao.UserDao;
import com.company.Model.User;


@Service
public class UserService {
@Autowired
  private UserDao userDao;
  public int createUser(User user){
	  return this.userDao.saveUser(user);
  }
  }