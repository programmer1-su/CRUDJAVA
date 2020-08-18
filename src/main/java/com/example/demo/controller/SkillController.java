package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dto.Skill;
import com.example.demo.service.SkillService;

@Controller
public class SkillController {
	@Autowired
	SkillService skillService;

	@RequestMapping(value = "/getSkillList", method = RequestMethod.GET)
	public @ResponseBody List<Skill> getSkillList() {
		List<Skill> skillList = skillService.getSkillList();
		return skillList;
	}
	
	@RequestMapping(value= "/getSkillById", method = RequestMethod.GET)
	public @ResponseBody Skill getSkillById(@RequestParam (value = "id")int id) {
		Skill skillById = skillService.getSkillById(id);
		return skillById;
	}
	
	@RequestMapping(value = "/insertSkill", method = RequestMethod.POST)
	public @ResponseBody int insert(@RequestBody Skill skill) {
		int skillinsert = skillService.insertSkill(skill);
		return skillinsert;
	}
	
	@RequestMapping(value = "/updateSkill", method = RequestMethod.PUT)
	public @ResponseBody void update(@RequestBody Skill skill) {
		skillService.updateSkill(skill);
	}
	
	@RequestMapping(value = "/deleteSkill", method = RequestMethod.DELETE)
	public @ResponseBody void delete(@RequestParam (value = "id")int id) {
		skillService.deleteSkill(id);
	}

}
