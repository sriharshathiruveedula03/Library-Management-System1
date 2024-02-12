package com.klef.jfsd.springboot.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.klef.jfsd.springboot.model.FacultyMentor;
import com.klef.jfsd.springboot.model.Student;

@Repository
public interface FacultyMentorRepository extends  CrudRepository<FacultyMentor, Integer>
{
	@Query("select m from FacultyMentor m where username=?1 and password=?2")
	  public FacultyMentor checkfacultymentorlogin(String uname, String pwd);

	  @Query("select m from FacultyMentor m where username=?1")
	  public FacultyMentor viewfacultymentor(String uname);
	  
	  @Transactional
	  @Modifying
	  @Query("update FacultyMentor m set m.password=?1 where m.password=?2 and m.username=?3")
	  public int updatefacultymentorpassword(String facultymentornewpwd,String facultymentoroldpwd,String facultymentoruname);
}
