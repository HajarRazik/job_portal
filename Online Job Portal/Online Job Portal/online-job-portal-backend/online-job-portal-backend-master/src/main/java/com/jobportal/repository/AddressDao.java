package com.jobportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobportal.models.Address;

@Repository
public interface AddressDao extends JpaRepository<Address, Integer> {

}
