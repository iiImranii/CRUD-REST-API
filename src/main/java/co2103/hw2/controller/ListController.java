package co2103.hw2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import co2103.hw2.repo.CustomerRepository;
import co2103.hw2.repo.EmployeeRepository;
import co2103.hw2.repo.ReportRepository;
import co2103.hw2.repo.VehicleRepository;

@Controller
public class ListController {
	@Autowired
	private VehicleRepository vRepo;
	@Autowired
	private CustomerRepository cRepo;
	@Autowired
	private ReportRepository rRepo;
	@Autowired
	private EmployeeRepository eRepo;
	@GetMapping("/list")
	public String getObjects(Model model) {
		model.addAttribute("employee", eRepo.findAll());
		model.addAttribute("customer", cRepo.findAll());
		model.addAttribute("vehicle", vRepo.findAll());
		model.addAttribute("report", rRepo.findAll());
		return "list";
	}
	
	

}
