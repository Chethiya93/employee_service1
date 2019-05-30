package com.chethiya.service;

import java.util.List;

import com.chethiya.model.Allocation;

public interface AllocationService {

    Allocation save(Allocation allocation);
    List<Allocation> fetchAllAllocations();
    Allocation fetchAllocation(Allocation allocation);
    List<Allocation> fetchAllocationEmp(Integer empid);
}
