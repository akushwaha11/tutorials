package com.ashish.repository;

//Importing required classes
import com.ashish.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Annotation
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

}
