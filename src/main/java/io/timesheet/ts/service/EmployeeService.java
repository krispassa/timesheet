package io.timesheet.ts.service;

import java.util.List;

import org.springframework.stereotype.Service;

import io.timesheet.ts.model.Employee;
@Service
public interface EmployeeService {

	List<Employee> listEmployee();
}
