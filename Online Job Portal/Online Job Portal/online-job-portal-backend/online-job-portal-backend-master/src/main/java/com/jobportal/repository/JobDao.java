package com.jobportal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobportal.models.Job;
import com.jobportal.models.JobCategory;
import com.jobportal.models.User;

@Repository
public interface JobDao extends JpaRepository<Job, Integer> {

	List<Job> findByStatusIn(List<String> status);

	List<Job> findByEmployerAndStatusIn(User employer, List<String> status);

	List<Job> findByCategoryAndStatusIn(JobCategory jobCategory, List<String> status);

	List<Job> findByTitleContainingIgnoreCaseAndStatusIn(String title, List<String> status);

	List<Job> findByCategoryAndJobTypeAndSalaryRangeAndStatusIn(JobCategory jobCategory, String jobType,
			String salaryRange, List<String> status);

}
