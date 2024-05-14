package com.jobportal.service;

import java.util.List;

import com.jobportal.models.JobCategory;

public interface JobCategoryService {

	JobCategory addJobCategory(JobCategory JobCategory);

	JobCategory updateJobCategory(JobCategory JobCategory);

	JobCategory getJobCategoryById(int JobCategory);

	List<JobCategory> getCategoriesByStatusIn(List<String> status);

}
