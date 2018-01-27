package io.timesheet.ts.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import io.timesheet.ts.model.Login;

@Repository
public class LoginDAOImpl implements LoginDAO {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@Override
	public boolean checkLogin(String username, String password) {
		Session session = this.sessionFactory.getCurrentSession();
		boolean validUser = false;
		Query loginquery = session
				.createQuery("from Login as lo where lo.username = :username and lo.password = :password");
		loginquery.setParameter("username", username);
		loginquery.setParameter("password", password);
		List ls = loginquery.list();
		if (ls != null && ls.size() > 0) {
			validUser = true;
		}
		return validUser;
	}
}
