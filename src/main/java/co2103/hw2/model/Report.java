package co2103.hw2.model;


import javax.persistence.*;


@Entity
public class Report {
	@Id
	@GeneratedValue
	private int id;
	private String description;
	@ManyToOne
	private Vehicle vehicle;
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String toString() {
		String sb;
		sb = "Report Id: "+Integer.toString(this.id)+"\n" + "Report description: "+this.description+"\n"+"Report Vehicle VIN: " +this.vehicle.getVIN();
		return sb;
	}
}
