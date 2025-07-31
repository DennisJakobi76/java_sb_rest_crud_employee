package com.dj.cruddemo.dao;

import com.dj.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
}
