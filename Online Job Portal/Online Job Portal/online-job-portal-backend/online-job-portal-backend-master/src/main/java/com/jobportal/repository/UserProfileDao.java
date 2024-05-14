package com.jobportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobportal.models.UserProfile;

@Repository
public interface UserProfileDao extends JpaRepository<UserProfile, Integer> {

}
