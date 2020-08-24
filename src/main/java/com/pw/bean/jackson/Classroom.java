package com.pw.bean.jackson;

import java.util.List;

public class Classroom {
	private String id;
	private String name;
	private List<Student> studentList;
	public Classroom() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Classroom(String id, String name, List<Student> studentList) {
		super();
		this.id = id;
		this.name = name;
		this.studentList = studentList;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	@Override
	public String toString() {
		return "Classroom [id=" + id + ", name=" + name + ", studentList=" + studentList + "]";
	}
	
}
