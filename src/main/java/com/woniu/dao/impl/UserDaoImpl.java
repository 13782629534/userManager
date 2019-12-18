package com.woniu.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.woniu.dao.IUserDao;
import com.woniu.pojo.User;
@Repository
public class UserDaoImpl implements IUserDao {
	@Autowired
	SessionFactory sessionfactory;
	@Override
	public void save(User obj) {
		
		sessionfactory.getCurrentSession().save(obj);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> findAll() {
		return sessionfactory.getCurrentSession().createCriteria(User.class).list();
	}

}
