package io.timesheet.ts.service;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.timesheet.ts.dao.LoginDAO;

@Service
public class LoginServiceImpl implements LoginService {

	private LoginDAO loginDAO;

	public void setLoginDAO(LoginDAO loginDAO) {
		this.loginDAO = loginDAO;
	}

	@Transactional
	public boolean checkLogin(String username, String password) {
		return this.loginDAO.checkLogin(username, password);
	}

}
