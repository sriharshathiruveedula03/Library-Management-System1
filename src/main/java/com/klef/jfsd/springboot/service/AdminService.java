package com.klef.jfsd.springboot.service;

import java.util.List;

import com.klef.jfsd.springboot.model.Admin;
import com.klef.jfsd.springboot.model.FacultyMentor;
import com.klef.jfsd.springboot.model.Student;
import com.klef.jfsd.springboot.model.Trainer;


public interface AdminService 
{
  public Admin checkadminlogin(String uname,String pwd);
  
  public List<Student> viewallstudents();
  public void deletestudent(int id);
  public Student viewstudentbyid(int id); 
  
}
