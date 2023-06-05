package com.servosys.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.servosys.model.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Long>{

}


