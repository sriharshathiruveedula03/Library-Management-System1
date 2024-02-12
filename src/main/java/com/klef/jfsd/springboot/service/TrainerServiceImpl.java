package com.klef.jfsd.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Trainer;
import com.klef.jfsd.springboot.repository.TrainerRepository;

@Service
public class TrainerServiceImpl implements TrainerService
{
	@Autowired
	private TrainerRepository trainerRepository;
	
	@Override
	public Trainer addtrainer(Trainer trainer) {
		return trainerRepository.save(trainer);
	}

	@Override
	public Trainer checktrainerlogin(String uname, String pwd) 
	{
		return trainerRepository.checktrainerlogin(uname, pwd);
	}

	@Override
	public Trainer viewtrainer(String uname) 
	{
		return trainerRepository.viewtrainer(uname);
	}

	@Override
	public int changetrainerpassword(String traineroldpwd, String trainernewpwd, String traineruname)
	{
		return trainerRepository.updatetrainerpassword(trainernewpwd, traineroldpwd, traineruname);
	}

}
