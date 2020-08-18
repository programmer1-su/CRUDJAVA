package com.example.demo.mapper;

import java.util.List;

import com.example.demo.dto.Skill;

public interface SkillMapper {
	public List<Skill> getSkillList();
	
	public Skill getSkillById(int id);
	
	public int insertSkill(Skill skill);
	
	public void updateSkill(Skill skill);
	
	public void deleteSkill(int id);

}
