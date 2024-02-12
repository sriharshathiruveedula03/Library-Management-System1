package com.klef.jfsd.springboot.service;

import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.FacultyMentor;

public interface FacultyMentorService 
{
 public FacultyMentor addfacultymentor(FacultyMentor facultyMentor);
 public FacultyMentor checkfacultymentorlogin(String uname , String pwd);
 public FacultyMentor viewfacultymentor(String uname);
 public int changefacultymentorpassword(String facultymentoroldpwd,String  facultymentornewpwd , String facultymentoruname);
}