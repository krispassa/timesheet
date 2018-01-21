package io.timesheet.ts.dao;

import java.util.List;

import io.timesheet.ts.model.Employee;


public class EmployeeDAOImpl implements EmployeeDAO {

	//private SessionFactory sessionfactory;
	@Override
	public List<Employee> getAllStudent() {
		
		
		//return sessionfactory.getCurrentSession().get(Employee.class);
		return null;
	}

	@Override
	public Employee findEmployeeByID(String eid) {
		
		return null;
	}

	@Override
	public void addEmployee(Employee emp) {
		

	}

	@Override
	public void updateEmployee(Employee ee, String eid) {
		

	}

	@Override
	public void deleteEmployee(String eid) {
		

	}

}
