package io.timesheet.ts.dao;

import org.springframework.stereotype.Service;

@Service
public interface LoginDAO {
	public boolean checkLogin(String username, String password);
}
