package com.jobportal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jobportal.models.Job;
import com.jobportal.models.JobApplication;
import com.jobportal.models.User;

@Repository
public interface JobApplicationDao extends JpaRepository<JobApplication, Integer> {

	List<JobApplication> findByEmployee(User employee);
	
	List<JobApplication> findByJob(Job job);

	@Query("SELECT ja FROM JobApplication ja WHERE ja.job.employer = :employer and status In (:status)")
	List<JobApplication> findByEmployerAndStatus(@Param("employer") User employer,
			@Param("status") List<String> status);

}
