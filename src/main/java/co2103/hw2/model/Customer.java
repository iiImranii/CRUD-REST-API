package co2103.hw2.model;

import javax.persistence.*;

@Entity
public class Customer {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String phone;
	@OneToOne
	@JoinColumn
	private Vehicle ownsCar;
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Vehicle getOwnsCar() {
		return ownsCar;
	}


	public void setOwnsCar(Vehicle ownsCar) {
		this.ownsCar = ownsCar;
	}
	

	public String toString() {
		String sb;
		if (this.ownsCar != null) {
			sb = "Customer Id: "+Integer.toString(this.id)+"\n" + "Customer name: "+this.name+"\n"+"Customer Phone Number: " +this.phone+"\n"+"Customer Vehicle VIN:"+this.ownsCar.getVIN();
		} else {
			sb = "Customer Id: "+Integer.toString(this.id)+"\n" + "Customer name: "+this.name+"\n"+"Customer Phone Number: " +this.phone+"\n";
		}
		return sb;
	}

	

}
