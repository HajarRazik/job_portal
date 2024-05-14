package com.jobportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobportal.models.UserWorkExperience;

@Repository
public interface UserWorkExperienceDao extends JpaRepository<UserWorkExperience, Integer> {

}
