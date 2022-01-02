package com.marticus.employee_management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.marticus.employee_management.entity.UserEntity;
import com.marticus.employee_management.service.EmployeeManagementService;

@Controller
public class AuthenticateController {

	@Autowired
	EmployeeManagementService employeeManagementService;

	@PostMapping("/login")
	public String login(UserEntity user) {
		boolean isUserPresent = employeeManagementService.authenticateUser(user);
		if (isUserPresent) {
			return "redirect:/emp/";
		}
		return "index";
	}

}
