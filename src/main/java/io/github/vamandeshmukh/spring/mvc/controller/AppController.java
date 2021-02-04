package io.github.vamandeshmukh.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import io.github.vamandeshmukh.spring.mvc.model.Employee;

/**
 * 
 * @author Vaman Deshmukh
 *
 */

@Controller
public class AppController {

	public AppController() {
		System.out.println("Sample Controller");
	}

	@RequestMapping("/")
	public String index() {
		System.out.println("index");
		return "index";
	}

	@RequestMapping("/login")
	public String login() {
		System.out.println("login");
		return "login";
	}

//	@RequestMapping("/welcome")
//	public String welcome(@RequestParam("userName") String userName, @RequestParam("password") String password) {
//		System.out.println("welcome");
//		if (userName.equals("admin") && password.equals("admin"))
//			return "welcome";
//		return "login";
//	}

	@RequestMapping("/welcome")
	public String welcome(Employee employee, Model model) {
		System.out.println("welcome");

		try {
			if (employee.getUserName().equals("admin") && employee.getPassword().equals("admin")) {

				model.addAttribute("message", "welcome ");
				model.addAttribute("userName", employee.getUserName());
				return "welcome";
			}
			model.addAttribute("error", "Invalid userName or password");
			return "login";
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			return "login";
		}

	}

}
