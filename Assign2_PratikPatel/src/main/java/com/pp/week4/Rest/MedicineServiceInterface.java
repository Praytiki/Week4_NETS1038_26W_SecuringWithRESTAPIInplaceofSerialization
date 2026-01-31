package com.pp.week4.Rest;

import java.util.List;

public interface MedicineServiceInterface {
	
	List<Medicine> findAllMedicine();
	void addMedicine(Medicine med);
	void updateMedicine(Medicine med);
	

}
