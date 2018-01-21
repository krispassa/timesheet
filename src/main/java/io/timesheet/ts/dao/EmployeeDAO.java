package io.timesheet.ts.dao;

import java.util.List;

import io.timesheet.ts.model.Employee;

public interface EmployeeDAO {
	public List<Employee> getAllStudent();
	public Employee findEmployeeByID(String eid);
	public void addEmployee(Employee emp);
	public void updateEmployee(Employee ee, String eid);
	public void deleteEmployee(String eid);
	

}
