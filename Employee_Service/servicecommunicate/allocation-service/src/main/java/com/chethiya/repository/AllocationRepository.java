package com.chethiya.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chethiya.model.Allocation;

import java.util.List;

public interface AllocationRepository extends JpaRepository<Allocation,Integer> {

    List<Allocation> findByempid(Integer empid);
}
