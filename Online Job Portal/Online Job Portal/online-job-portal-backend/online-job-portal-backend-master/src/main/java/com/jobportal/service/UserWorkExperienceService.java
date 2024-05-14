package com.jobportal.service;

import com.jobportal.models.UserWorkExperience;

public interface UserWorkExperienceService {
	
	UserWorkExperience add(UserWorkExperience userWorkExperience);

	UserWorkExperience update(UserWorkExperience userWorkExperience);

	UserWorkExperience getById(int userWorkExperienceId);

}
