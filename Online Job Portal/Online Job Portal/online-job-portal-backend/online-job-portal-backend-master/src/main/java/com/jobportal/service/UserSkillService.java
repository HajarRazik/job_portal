package com.jobportal.service;

import com.jobportal.models.UserSkill;

public interface UserSkillService {
	
	UserSkill add(UserSkill skill);

	UserSkill update(UserSkill skill);

	UserSkill getById(int skillId);

}
