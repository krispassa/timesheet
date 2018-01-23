package io.timesheet.ts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import io.timesheet.ts.auth.Auth;
import io.timesheet.ts.model.Employee;
import io.timesheet.ts.model.Login;
import io.timesheet.ts.service.EmployeeServiceImpl;
@Controller
@RequestMapping(value = "/login")
public class LoginController {
 
//	@Autowired
//	private Employee employee;

	@RequestMapping(method = RequestMethod.GET)
	public String getLoginPage(Model model) {
		model.addAttribute("loginAttribute", new Login());
		return "login";
	}
	@RequestMapping(method = RequestMethod.POST)
	public String loginFormPost(@ModelAttribute("loginAttribute") Login login, Model model) throws NullPointerException {
		
		
		if(checkCreds(login))
		{
			model.addAttribute("afterlogin", "hello after loginnnnnnnnnnnnnn");
			//model.addAttribute("salary", employee.getTotalSalary());
			
			return "welcome";
		}
		else
		{
			model.addAttribute("error", "Bad Credentials");
			//System.out.println(employeeserviceimpl.listEmployee());
			return "login";
		}		
	}
	private boolean checkCreds(Login login) {
		if("admin".equals(login.getUsername()) && "admin".equals(login.getPassword()))
			{return true;}
		return false;
	}
	/*
	private Employee populateEmployee() {
		employee.seteID("007");
		employee.setFname("John");
		employee.setLname("Doe");
		employee.setAddress("420 High St");
		employee.setStartTime("Feb 1");
		employee.setEndTime("Feb 28");
		employee.setPayRate(40.00);
		employee.setTotalhrs(70);
		return employee;
	}
	*/


	
	
}
