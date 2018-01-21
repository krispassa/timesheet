package io.timesheet.ts.auth;

import org.springframework.stereotype.Component;

@Component
public class Auth {

	public boolean checkCreds(String username,String password)
	{
		if("admin".equals(username) && "admin".equals(password))
		{
			return true;
		}
	return false;
	}
}
