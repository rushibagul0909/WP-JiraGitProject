package com.WP.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	private int student_id;
	private String student_name;
	private String student_mo;
	private String student_Email;
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getStudent_mo() {
		return student_mo;
	}
	public void setStudent_mo(String student_mo) {
		this.student_mo = student_mo;
	}
	public String getStudent_Email() {
		return student_Email;
	}
	public void setStudent_Email(String student_Email) {
		this.student_Email = student_Email;
	}
	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", student_name=" + student_name + ", student_mo=" + student_mo
				+ ", student_Email=" + student_Email + "]";
	}
	
	
}
