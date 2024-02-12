package com.klef.jfsd.springboot.service;

import com.klef.jfsd.springboot.model.Trainer;

public interface TrainerService 
{
	public Trainer addtrainer(Trainer trainer);
	 public Trainer checktrainerlogin(String uname , String pwd);
	 public Trainer viewtrainer(String uname);
	 public int changetrainerpassword(String traineroldpwd,String  trainernewpwd , String traineruname);
}
