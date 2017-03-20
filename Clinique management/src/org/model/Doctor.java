package org.model;

public class Doctor {

	private String Name;
	private String Id;
	private String Specialization;
	private String Availability;

	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getSpecialization() {
		return Specialization;
	}
	public void setSpecialization(String specialization) {
		Specialization = specialization;
	}
	public String getAvailability() {
		return Availability;
	}
	public void setAvailability(String availability) {
		Availability = availability;
	}
	
	@Override
	public String toString() {
		return "[Doctor: {id="+Id+" name=\""+Name+"\" specialization:\""+Specialization+"\" availability:\""+Availability+"\"}]";
	}
}