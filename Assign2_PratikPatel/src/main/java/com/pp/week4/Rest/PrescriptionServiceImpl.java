package com.pp.week4.Rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

/**
 * 
 * @Pratik Patel
 * @Tuesday, February 3, 2026
 * 
 * 
 * Description - Here, we are using the constructor to initialize our data and populate an ArrayList with those instances.
 * 				We then define findAllPrescription by returning the populated array. We define addPrescription, which allows us to 
 * 				add more instances of Medicine to the list. Finally, we define updatePrescription, which uses a for-loop to search 
 * 				through the list by ID and replace an old instance with a new Medicine instance. Again, this is all
 * 				similar to Medicine except we also need to populate Medicine and added it to the Array.
 * 
 * 
 */



@Service
public class PrescriptionServiceImpl implements PrescriptionServiceInterface{
	
	private List<Prescription> prescription= new ArrayList<>();
	
	public PrescriptionServiceImpl() {
		
		Medicine med1 = new Medicine(1, "Amoxicillin", "Antibiotic", "20.00", "2027-10-03");
        prescription.add(new Prescription(501, "John King", "500mg daily", "2026-01-31", med1));
		
        
        Medicine med2 = new Medicine(2, "Sudafed", "Congestion", "9.00", "2026-10-10");
        prescription.add(new Prescription(502, "Sam Smith", "10mg every 12 hours", "2026-02-05", med2));
        
        
        Medicine med3 = new Medicine(3, "Robitussin", "Cough Suppressant", "13.00", "2026-01-01");
        prescription.add(new Prescription(503, "Robert Brown", "200mg as needed", "2026-02-10", med3));
        
		
		
		
	}


	

	@Override
	public List<Prescription> findAllPrescription() {
		
		return prescription;
	}

	@Override
	public void addPrescription(Prescription pscript) {
		prescription.add(pscript);
		
	}

	@Override
	public void updatePrescription(Prescription pscript) {
		for (int i = 0; i < prescription.size(); i++) {
			if (prescription.get(i).getId() == pscript.getId()) {
				prescription.set(i, pscript);
				return;
				
			}
			
			
			
		}
		
	}
	
	
	
	

}
