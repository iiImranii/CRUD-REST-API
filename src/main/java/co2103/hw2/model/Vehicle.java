package co2103.hw2.model;


import java.util.List;

import javax.persistence.*;

@Entity
public class Vehicle {
	@Id
	private String VIN;
	private String make;
	private String year;
	private String model;
	@OneToOne
	@JoinColumn
	private Customer owner;
	@ManyToMany(fetch=FetchType.LAZY)
	
	private List<Employee> workers;
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,orphanRemoval=true)
	private List<Report> carReport;
	public List<Report> getCarReport() {
		return carReport;
	}
	public void setCarReport(List<Report> carReport) {
		this.carReport = carReport;
	}
	public String getVIN() {
		return VIN;
	}
	public void setVIN(String vIN) {
		VIN = vIN;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}

	public List<Employee> getWorkers() {
		return workers;
	}
	public void setWorkers(List<Employee> workers) {
		this.workers = workers;
	}
	public Customer getOwner() {
		return owner;
	}
	public void setOwner(Customer owner) {
		this.owner = owner;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public String toString() {
		String sb;
		if (this.owner != null) {
			sb = "Vehicle VIN: "+this.VIN+"\n" + "Vehicle make: "+this.make+"\n"+"Vehicle model: " +this.model+"\n"+"Vehicle year: "+this.year+"\n"+"Vehicle Owner Id:"+Integer.toString(this.owner.getId());
		} else {
			sb = "Vehicle VIN: "+this.VIN+"\n" + "Vehicle make: "+this.make+"\n"+"Vehicle model: " +this.model+"\n"+"Vehicle year: "+this.year+"\n";
		}
		
		return sb;
	}
	

}
