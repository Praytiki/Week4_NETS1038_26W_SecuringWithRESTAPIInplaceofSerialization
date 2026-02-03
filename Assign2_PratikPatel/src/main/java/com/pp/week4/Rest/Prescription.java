package com.pp.week4.Rest;




/**
 * 
 * @Pratik Patel
 * @Tuesday, February 3, 2026
 * 
 * 
 * Description - Here, we are creating getters and setters with constructors.
 * 				When a Prescription object is invoked, the required information is passed into the Prescription constructor.
 * 				Subsequently, we can retrieve information using getters and modify or update data using setters.
 * 				This approach protects variables via encapsulation and ensures data integrity through controlled access.
 * 				This class differs from Medicine because it creates a direct link by embedding a Medicine instance within the
 * 			 	Prescription model.
 * 
 * 
 */



public class Prescription {
	
	

	
	public Prescription(int id, String patientName, String detailDosage, String dateGiven, Medicine medicine) {
		super();
		this.id = id;
		this.patientName = patientName;
		this.detailDosage = detailDosage;
		this.dateGiven = dateGiven;
		this.medicine = medicine;
	}
	
	
	private int id;
	private String patientName;
    private String detailDosage;
    private String dateGiven;
    private Medicine medicine;
	
	
	
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getDetailDosage() {
		return detailDosage;
	}
	public void setDetailDosage(String detailDosage) {
		this.detailDosage = detailDosage;
	}
	public String getDateGiven() {
		return dateGiven;
	}
	public void setDateGiven(String dateGiven) {
		this.dateGiven = dateGiven;
	}
	public Medicine getMedicine() {
		return medicine;
	}
	public void setMedicine(Medicine medicine) {
		this.medicine = medicine;
	}
	
  

}
