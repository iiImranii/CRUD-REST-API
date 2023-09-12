package co2103.hw2;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



import co2103.hw2.model.Customer;
import co2103.hw2.model.Employee;
import co2103.hw2.model.Report;
import co2103.hw2.model.Vehicle;
import co2103.hw2.repo.CustomerRepository;
import co2103.hw2.repo.EmployeeRepository;
import co2103.hw2.repo.ReportRepository;
import co2103.hw2.repo.VehicleRepository;

@SpringBootApplication
public class Hw2Application implements ApplicationRunner {
	@Autowired
	private VehicleRepository vRepo;
	@Autowired
	private CustomerRepository cRepo;
	@Autowired
	private ReportRepository rRepo;
	@Autowired
	private EmployeeRepository eRepo;
	public static void main(String[] args) {
		SpringApplication.run(Hw2Application.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		e1.setEmail("jouhn45@gmail.com");
		e1.setPhone("07445831682");
		e1.setName("Jou Ohn");
		e1.setCars(new ArrayList<Vehicle>());
		
		
		Employee e2 = new Employee();
		e2.setEmail("amas467@gmail.com");
		e2.setPhone("07445831503");
		e2.setName("Aoki Masaru");
		e2.setCars(new ArrayList<Vehicle>());
		
		Vehicle v1 = new Vehicle();
		v1.setMake("Nissan");
		v1.setModel("350z");
		v1.setYear("2009");
		v1.setVIN("JN1BZ34E19M250099");
		v1.setCarReport(new ArrayList<Report>());
		v1.setWorkers(new ArrayList<Employee>());
		
		Vehicle v2 = new Vehicle();
		v2.setMake("Ferrari");
		v2.setModel("Enzo");
		v2.setYear("2002");
		v2.setVIN("ZE1BZ34E19M250022");
		v2.setCarReport(new ArrayList<Report>());
		v2.setWorkers(new ArrayList<Employee>());
		
		
		
		Customer c1 = new Customer();
		c1.setName("Imran Lawal");
		c1.setPhone("07448150567");
		c1 =cRepo.save(c1);
		v1.setOwner(c1);
		e1 = eRepo.save(e1);
		v1.getWorkers().add(e1);
		v2.getWorkers().add(e1);
		v1 = vRepo.save(v1);
		c1.setOwnsCar(v1);
	
		e1.getCars().add(v1);
		e1.getCars().add(v2);
		
		
		Customer c2 = new Customer();
		c2.setName("Abdi Jabar");
		c2.setPhone("07448153473");
		c2 =cRepo.save(c2);
		v2.setOwner(c2);
		e2 = eRepo.save(e2);
		v2.getWorkers().add(e2);
		v1.getWorkers().add(e2);
		v2 = vRepo.save(v2);
		c2.setOwnsCar(v2);
		e2.getCars().add(v1);
		e2.getCars().add(v2);
		
		Report r1 = new Report();
		r1.setDescription("Nissan front Headlight brightness below legal limit.");
		r1.setVehicle(v1);
		rRepo.save(r1);
		v1.getCarReport().add(r1);
		
		
		Report r2 = new Report();
		r2.setDescription("Brake pads worn out need replacing, Nissan.");
		r2.setVehicle(v1);
		rRepo.save(r2);
		v1.getCarReport().add(r2);
		
		Report r3 = new Report();
		r3.setDescription("Enzo spark plugs need replacing tip has been burnt out.");
		r3.setVehicle(v2);
		rRepo.save(r3);
		v2.getCarReport().add(r3);
		
		
		Report r4 = new Report();
		r4.setDescription("Threads on tires have been worn on the Enzo, below national thread depth");
		r4.setVehicle(v2);
		rRepo.save(r4);
		v2.getCarReport().add(r4);
		
	}
	
	
	

}
