package io.timesheet.ts.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.timesheet.ts.dao.EmployeeDAO;
import io.timesheet.ts.model.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDAO employeedao;
	
	@Transactional
	public List<Employee> listEmployee() {
		
		
		return employeedao.getAllEmployee();
	}

}
