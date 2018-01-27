package io.timesheet.ts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import io.timesheet.ts.model.Login;
import io.timesheet.ts.service.LoginService;

@Controller
@RequestMapping(value = "/login")
public class LoginController {
	private LoginService loginService;

	@Autowired(required = true)
	public void setloginService(LoginService loginService) {
		this.loginService = loginService;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String getLoginPage(Model model) {
		model.addAttribute("loginAttribute", new Login());
		return "login";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String loginFormPost(@ModelAttribute("loginAttribute") Login login, Model model)
			throws NullPointerException {
		boolean userExists = loginService.checkLogin(login.getUsername(), login.getPassword());
		if (userExists) {
			model.addAttribute("afterlogin", "hello after loginnnnnnnnnnnnnn");
			return "welcome";
		} else {
			model.addAttribute("error", "Bad Credentials");
			return "login";
		}
	}
}
