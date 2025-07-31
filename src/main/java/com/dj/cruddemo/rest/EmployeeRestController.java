package com.dj.cruddemo.rest;


import com.dj.cruddemo.dao.EmployeeDAO;
import com.dj.cruddemo.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeDAO employeeDAO;

    // quick and dirty: inject employee DAO (use constructor injection)
    public EmployeeRestController(EmployeeDAO theEmployeeDAO) {
        employeeDAO = theEmployeeDAO;
    }

    // expose "/employees" endpoint and return list of employees
    @GetMapping("/employees")
    public List<Employee> findAll() {
        // call DAO to get employees
        return employeeDAO.findAll();
    }
}
