package com.woniu.pojo;
// Generated 2019-12-18 22:41:38 by Hibernate Tools 5.2.12.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Clazz generated by hbm2java
 */
public class Clazz implements java.io.Serializable {

	private Integer clazzId;
	private Level level;
	private User user;
	private String clazzType;
	private String clazzName;
	private Set students = new HashSet(0);
	private Set scoreresults = new HashSet(0);

	public Clazz() {
	}

	public Clazz(Level level) {
		this.level = level;
	}

	public Clazz(Level level, User user, String clazzType, String clazzName, Set students, Set scoreresults) {
		this.level = level;
		this.user = user;
		this.clazzType = clazzType;
		this.clazzName = clazzName;
		this.students = students;
		this.scoreresults = scoreresults;
	}

	public Integer getClazzId() {
		return this.clazzId;
	}

	public void setClazzId(Integer clazzId) {
		this.clazzId = clazzId;
	}

	public Level getLevel() {
		return this.level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getClazzType() {
		return this.clazzType;
	}

	public void setClazzType(String clazzType) {
		this.clazzType = clazzType;
	}

	public String getClazzName() {
		return this.clazzName;
	}

	public void setClazzName(String clazzName) {
		this.clazzName = clazzName;
	}

	public Set getStudents() {
		return this.students;
	}

	public void setStudents(Set students) {
		this.students = students;
	}

	public Set getScoreresults() {
		return this.scoreresults;
	}

	public void setScoreresults(Set scoreresults) {
		this.scoreresults = scoreresults;
	}

}
