package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.IUserDao;
import com.woniu.pojo.User;
import com.woniu.service.IUserService;
@Service
@Transactional
public class UserServiceImlp implements IUserService {
	@Autowired
	IUserDao iud;
	@Override
	public void save(User obj) {
		
		iud.save(obj);
//		//System.out.println(1/0);
//		User user2 = new User();
//		user2.setUsername("¡ı–°≥Ω");
//		user2.setPassword("sgp");
//		iud.save(user2);
		
	}
	@Override
	public List<User> findAll() {
	
		return iud.findAll();
	}
}
