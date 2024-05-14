package com.jobportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobportal.models.UserSkill;

@Repository
public interface UserSkillDao extends JpaRepository<UserSkill, Integer> {

}
