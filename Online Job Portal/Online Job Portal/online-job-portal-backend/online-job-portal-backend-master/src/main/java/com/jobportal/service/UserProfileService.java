package com.jobportal.service;

import com.jobportal.models.UserProfile;

public interface UserProfileService {
	
	UserProfile add(UserProfile userProfile);

	UserProfile update(UserProfile userProfile);

	UserProfile getById(int userProfileId);

}
