package co2103.hw2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co2103.hw2.model.Customer;
import co2103.hw2.model.Employee;
import co2103.hw2.model.Report;
import co2103.hw2.model.Vehicle;
import co2103.hw2.repo.CustomerRepository;
import co2103.hw2.repo.EmployeeRepository;
import co2103.hw2.repo.ReportRepository;
import co2103.hw2.repo.VehicleRepository;


@Controller
public class DeleteController {
	@Autowired
	private VehicleRepository vRepo;
	@Autowired
	private CustomerRepository cRepo;
	@Autowired
	private ReportRepository rRepo;
	@Autowired
	private EmployeeRepository eRepo;
	
	
	@GetMapping("/deleteVehicle")
	public String deleteV(@RequestParam String id) {
		Vehicle toTerminate = null;
		for(Vehicle v : vRepo.findAll()) {
			if (v.getVIN().contains(id)) {
				toTerminate = v;
				vRepo.delete(v);
			}
		}
		if (toTerminate != null) {
			
			//SecretAgentApplication.agents.remove(toTerminate);
		}
		return "redirect:/list";
	}
	
	@GetMapping("/deleteEmployee")
	public String deleteE(@RequestParam int id) {
		Employee toTerminate = null;
		for(Employee v : eRepo.findAll()) {
			if (v.getId() == id) {
				toTerminate = v;
			}
		}
		if (toTerminate != null) {
			eRepo.delete(toTerminate);
			//SecretAgentApplication.agents.remove(toTerminate);
		}
		return "redirect:/list";
		
	}
	
	@GetMapping("/deleteCustomer")
	public String deleteC(@RequestParam int id) {
		Customer toTerminate = null;
		for(Customer v : cRepo.findAll()) {
			if (v.getId() == id) {
				toTerminate = v;
			}
		}
		if (toTerminate != null) {
			cRepo.delete(toTerminate);
			//SecretAgentApplication.agents.remove(toTerminate);
		}
		return "redirect:/list";
		
	}
	
	@GetMapping("/deleteReport")
	public String deleteR(@RequestParam int id) {
		Report toTerminate = null;
		for(Report v : rRepo.findAll()) {
			if (v.getId() == id) {
				toTerminate = v;
			}
		}
		if (toTerminate != null) {
			rRepo.delete(toTerminate);
			//SecretAgentApplication.agents.remove(toTerminate);
		}
		return "redirect:/list";
		
	}
	
	
}
