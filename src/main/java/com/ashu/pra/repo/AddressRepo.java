package com.ashu.pra.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashu.pra.entity.Address;

public interface AddressRepo extends JpaRepository<Address, Integer> {

}
