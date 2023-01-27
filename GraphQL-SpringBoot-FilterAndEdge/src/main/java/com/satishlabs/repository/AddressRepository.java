package com.satishlabs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.satishlabs.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long>{

}
