package com.jobportal.service;

import java.util.List;

import com.jobportal.models.Job;
import com.jobportal.models.JobApplication;
import com.jobportal.models.User;

public interface JobApplicationService {

	JobApplication add(JobApplication jobApplication);

	JobApplication update(JobApplication jobApplication);

	JobApplication getById(int jobApplicationId);
	
	List<JobApplication> getAll();
	
	List<JobApplication> getByEmployee(User employee);
	
	List<JobApplication> getByEmployeeAndStatus(User employee, List<String> status);

	List<JobApplication> getByJob(Job job);

}
