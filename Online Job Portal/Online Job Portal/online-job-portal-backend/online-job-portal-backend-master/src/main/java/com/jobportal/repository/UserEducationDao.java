package com.jobportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobportal.models.UserEducation;

@Repository
public interface UserEducationDao extends JpaRepository<UserEducation, Integer> {

}
