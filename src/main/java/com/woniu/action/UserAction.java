package com.woniu.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.woniu.pojo.User;
import com.woniu.service.IUserService;
@Controller
public class UserAction {		
		@Autowired
		private IUserService us;
		private User user;
		private List<User> users;
		public UserAction() {
			super();
			System.out.println("UserAction.UserAction()");
		}
		public User getUser() {
			return user;
		}
		public void setUser(User user) {
			this.user = user;
		}
		
		
		public List<User> getUsers() {
			return users;
		}
		public void setUsers(List<User> users) {
			this.users = users;
		}
		public String save() {
			us.save(user);
			return "success";
		}
		public String findAll() {
			users=us.findAll();
			return "list";
		}
		
}
