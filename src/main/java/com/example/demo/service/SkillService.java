package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.SkillDao;
import com.example.demo.dto.Skill;

@Service
public class SkillService {
	
	@Autowired
	SkillDao skillDao;
	
	public List<Skill> getSkillList(){
		List<Skill> skillList = skillDao.getSkillList();
		return skillList;
	}
	
	public Skill getSkillById(int id) {
		Skill getSkillId = skillDao.getSkillById(id);
		return getSkillId;
	}
	
	public int insertSkill(Skill skill) {
		int insertId = skillDao.insertSkill(skill);
		return insertId;
	}
	
	public void updateSkill(Skill skill) {
		skillDao.updateSkill(skill);
	}
	
	public void deleteSkill(int id) {
		skillDao.deleteSkill(id);
	}
}
