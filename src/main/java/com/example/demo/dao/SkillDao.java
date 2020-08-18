package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.Skill;
import com.example.demo.mapper.SkillMapper;

@Repository
public class SkillDao {
	
	@Autowired
	SkillMapper skillMapper;
	
	public List<Skill> getSkillList(){
		List<Skill> skillList = skillMapper.getSkillList(); 
		return skillList;
	}
	
	public Skill getSkillById(int id) {
		Skill getSkillById = skillMapper.getSkillById(id);
		return getSkillById;
	}
	
	public int insertSkill(Skill skill) {
		int insertId = skillMapper.insertSkill(skill);
		return insertId;
		
	}
	
	public void updateSkill(Skill skill) {
		skillMapper.updateSkill(skill);
	}

	public void deleteSkill(int id) {
		skillMapper.deleteSkill(id);
	}
}
