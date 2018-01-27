package io.timesheet.ts.service;

import org.springframework.stereotype.Service;

@Service
public interface LoginService {

	public boolean checkLogin(String username, String password);
}
