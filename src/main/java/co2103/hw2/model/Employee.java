package co2103.hw2.model;

import java.util.List;

import javax.persistence.*;

@Entity
public class Employee {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String email;
	private String phone; 
	@ManyToMany(cascade=CascadeType.PERSIST,mappedBy="workers")
	private List<Vehicle> cars;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Vehicle> getCars() {
		return cars;
	}
	public void setCars(List<Vehicle> cars) {
		this.cars = cars;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String toString() {
		String sb;
		sb = "Employee Id: "+Integer.toString(this.id)+"\n" + "Employee name: "+this.name+"\n"+"Employee Phone Number: " +this.phone+"\n"+"Employee email: "+this.email+"\n"+"Employee serviced VIN: " +"\n";
		for (Vehicle i: this.cars) {
			sb += i.getVIN() + "\n";
		}
		return sb;
	}


}
