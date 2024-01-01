package com.example.springBootBackend.repository;

import com.example.springBootBackend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//second parameter type of primary key
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
