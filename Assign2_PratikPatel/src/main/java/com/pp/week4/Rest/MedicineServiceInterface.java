package com.pp.week4.Rest;
import java.util.List;


/**
 * 
 * @Pratik Patel
 * @Tuesday, February 3, 2026
 * 
 * 
 * Description - Here, we are creating the interfaces that will be used in MedicineServiceImpl, where they will be assigned functions.
 * 				This allows the application to define a set of required actions separately from the code.
 * 
 * 
 * 
 * 
 * 
 */

public interface MedicineServiceInterface {
	
	List<Medicine> findAllMedicine();
	void addMedicine(Medicine med);
	void updateMedicine(Medicine med);
	

}
