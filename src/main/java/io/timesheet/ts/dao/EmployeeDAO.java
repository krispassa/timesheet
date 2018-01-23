package io.timesheet.ts.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import io.timesheet.ts.model.Employee;
@Repository
public interface EmployeeDAO {
	public List<Employee> getAllEmployee();
	public Employee findEmployeeByID(String eid);
	public void addEmployee(Employee emp);
	public void updateEmployee(Employee ee, String eid);
	public void deleteEmployee(String eid);	

}
