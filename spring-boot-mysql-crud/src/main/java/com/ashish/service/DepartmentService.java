package com.ashish.service;

import com.ashish.entity.Department;
//Importing required classes
import java.util.List;

public interface DepartmentService {
	
	// Save operation
    Department saveDepartment(Department department);
 
    // Read operation
    List<Department> fetchDepartmentList();
    
    // Get department by id
    Department fetchDepartmentById(Long departmentId);
 
    // Update operation
    Department updateDepartment(Department department,
                                Long departmentId);
 
    // Delete operation
    void deleteDepartmentById(Long departmentId);

}
