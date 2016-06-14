package com.kushal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.kushal.beans.Employee;
import com.kushal.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveEmployee(@ModelAttribute("employee")Employee employee, 
			BindingResult result) {
		employeeService.addEmployee(employee);
		return new ModelAndView("done");
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView addEmployee(ModelMap model) {
		model.put("employee",  new Employee());
		return new ModelAndView("addEmployee", model);
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView welcome(ModelMap model) {
		model.put("employee",  new Employee());
		return new ModelAndView("index");
	}
}
