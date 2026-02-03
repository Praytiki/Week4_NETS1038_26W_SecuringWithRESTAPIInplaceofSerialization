package com.pp.week4.Rest;

import java.util.List;




/**
 * 
 * @Pratik Patel
 * @Tuesday, February 3, 2026
 * 
 * 
 * Description - Here, we are creating the interfaces that will be used in PrescriptionServiceImpl, where they will be assigned functions.
 * 				This allows the application to define a set of required actions separately from the code. This is similar to
 * 				 MedicineServiceImpl.
 * 				
 * 
 */



public interface PrescriptionServiceInterface {
	
	List<Prescription> findAllPrescription();
	void addPrescription(Prescription pscript);
	void updatePrescription(Prescription pscript);

}
