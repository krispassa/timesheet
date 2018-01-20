package io.timesheet.ts;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {


	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String getLoginPage() {
		return "login";
	}
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginFormPost(@RequestParam String username, @RequestParam String password, Model model) {
		
		if(checkCreds(username,password))
		{
			model.addAttribute("afterlogin", "show after Login page" );
			return "welcome";
		}
		else
		{
			model.addAttribute("error", "Bad Credentials");
			return "login";
		}
		
	}
	private boolean checkCreds(String username, String password) {
		
		if("admin".equals(username) && "admin".equals(password))
		{
			return true;
		}
			
		else
			return false;
	}
}
