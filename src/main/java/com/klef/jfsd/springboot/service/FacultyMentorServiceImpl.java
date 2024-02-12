package com.klef.jfsd.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.FacultyMentor;
import com.klef.jfsd.springboot.repository.FacultyMentorRepository;
@Service
public class FacultyMentorServiceImpl implements FacultyMentorService
{

	@Autowired
	private FacultyMentorRepository facultyMentorRepository;
	@Override
	public FacultyMentor addfacultymentor(FacultyMentor facultyMentor) {
		
		return facultyMentorRepository.save(facultyMentor);
	}

	@Override
	public FacultyMentor checkfacultymentorlogin(String uname, String pwd) {
		
		return facultyMentorRepository.checkfacultymentorlogin(uname, pwd);
	}

	@Override
	public FacultyMentor viewfacultymentor(String uname) {
		
		return facultyMentorRepository.viewfacultymentor(uname);
	}

	@Override
	public int changefacultymentorpassword(String facultymentoroldpwd, String facultymentornewpwd,
			String facultymentoruname) {
		
		return facultyMentorRepository.updatefacultymentorpassword(facultymentornewpwd, facultymentoroldpwd, facultymentoruname);
	}

}
