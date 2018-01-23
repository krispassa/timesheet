package io.timesheet.ts.auth;

import org.springframework.stereotype.Component;

public  class Auth {

	public  static boolean checkCreds (String username,String password) throws NullPointerException
	{
		if("admin".equals(username) && "admin".equals(password))
		{
			return true;
		}
	return false;
	}
}
