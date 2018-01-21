package io.timesheet.ts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import io.timesheet.ts.auth.Auth;
import io.timesheet.ts.model.Employee;
@Controller
public class LoginController {

	@Autowired
	private Employee employee;
	
	@Autowired
	private Auth auth;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String getLoginPage() {
		return "login";
	}
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginFormPost(@RequestParam String username, @RequestParam String password, Model model) {
		
		if(auth.checkCreds(username,password))
		{
			model.addAttribute("afterlogin", this.populateEmployee());
			return "welcome";
		}
		else
		{
			model.addAttribute("error", "Bad Credentials");
			System.out.println(employee.getTotalSalary());
			return "login";
		}
		
	}
	private Employee populateEmployee() {
		employee.seteID("007");
		employee.setFname("John");
		employee.setLname("Doe");
		employee.setAddress("420 High St");
		employee.setPayRate(40.00);
		employee.setTotalhrs(70);
		return employee;
	}
	
}
