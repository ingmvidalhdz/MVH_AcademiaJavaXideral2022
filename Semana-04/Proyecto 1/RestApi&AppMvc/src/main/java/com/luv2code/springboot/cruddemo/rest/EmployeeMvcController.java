package com.luv2code.springboot.cruddemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv2code.springboot.cruddemo.entity.Employee;
import com.luv2code.springboot.cruddemo.service.EmployeeService;

@Controller
@RequestMapping("/mvc")
public class EmployeeMvcController {

	// need to inject our customer service
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employees")
	public String listCustomers(Model theModel) {
		
		// get customers from the service
		List<Employee> theEmployees = employeeService.findAll();
				
		// add the customers to the model
		theModel.addAttribute("employees", theEmployees);
		
		return "list-employees";
	}

	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		Employee theEmployee = new Employee();
		
		theModel.addAttribute("employee", theEmployee);
		
		return "employee-form";
	}
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Employee theCustomer) {
		
		// save the customer using our service
		employeeService.save(theCustomer);	
		
		return "redirect:/mvc/employees";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("employeeId") int theId,
									Model theModel) {
		
		// get the customer from our service
		Employee theEmployee = employeeService.findById(theId);	
		
		// set customer as a model attribute to pre-populate the form
		theModel.addAttribute("employee", theEmployee);
		
		// send over to our form		
		return "employee-form";
	}
	
	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("employeeId") int theId) {
		
		// delete the customer
		employeeService.deleteById(theId);
		
		return "redirect:/mvc/employees";
	}

}










