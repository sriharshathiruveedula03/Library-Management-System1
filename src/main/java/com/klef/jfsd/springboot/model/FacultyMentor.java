package com.klef.jfsd.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="facultymentor_table")
public class FacultyMentor 
{
	@Id
	@GeneratedValue
	private int id;
	@Column(nullable=false,unique=true)
	private String username;
	@Column(nullable=false,length=200)
	private String password;
	@Column(nullable = false,length = 200)
	private String name;
    @Column(nullable = false,length = 10)
    private String gender;
    @Column(nullable = false,length = 10)
    private String dateofbirth;
    @Column(nullable = false,length = 200)
    private String department;
    @Column(nullable = false,length = 200)
    private String city;
    @Column(nullable = false,unique = true)
    private String emailid;
    @Column(nullable = false,unique = true)
    private String contactno;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
}
