package io.timesheet.ts.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import io.timesheet.ts.auth.Auth;
import io.timesheet.ts.model.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private SessionFactory sessionfactory;
	@Override
	public List<Employee> getAllEmployee() {
		
		
		TypedQuery<Employee> query=(TypedQuery<Employee>) sessionfactory.getCurrentSession().createQuery("from employee");
		//return (List<Employee>) sessionfactory.getCurrentSession().createQuery("from employee");
		return query.getResultList();
	}

	@Override
	public Employee findEmployeeByID(String eid) {
		
		return null;
	}

	@Override
	public void addEmployee(Employee emp) {
		sessionfactory.getCurrentSession().save(emp);

	}

	@Override
	public void updateEmployee(Employee ee, String eid) {
		

	}

	@Override
	public void deleteEmployee(String eid) {
		

	}


}
