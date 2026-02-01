package com.pp.week4.Rest;

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
