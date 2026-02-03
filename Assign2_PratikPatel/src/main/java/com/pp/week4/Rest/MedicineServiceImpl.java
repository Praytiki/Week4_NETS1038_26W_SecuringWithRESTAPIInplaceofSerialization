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
 * 				We then define findAllMedicine by returning the populated array. We define addMedicine, which allows us to 
 * 				add more instances of Medicine to the list. Finally, we define updateMedicine, which uses a for-loop to search 
 * 				through the list by ID and replace an old instance with a new Medicine instance.
 * 
 * 
 * 
 * 
 * 
 */





@Service
public class MedicineServiceImpl implements MedicineServiceInterface{
	


	private List<Medicine> medicine = new ArrayList<>();
	
	
	public MedicineServiceImpl() {
		
		medicine.add(new Medicine(1, "Amoxicillin", "Antibiotic", "15.00", "2026-05-20"));
		medicine.add(new Medicine(2, "Sudafed", "Congestion", "9.00", "2026-10-10"));
		medicine.add(new Medicine(3, "Robitussin", "Cough Suppressant", "13.00", "2026-01-01"));
	}
	

	@Override
	public List<Medicine> findAllMedicine() {
		
		return medicine;
	}

	@Override
	public void addMedicine(Medicine med) {
		
		
		medicine.add(med);
		
	}

	@Override
	public void updateMedicine(Medicine med) {
		
		for (int i = 0; i < medicine.size(); i++) {
			if(medicine.get(i).getId() == med.getId()) {
				medicine.set(i, med);
				return;
			}
		}
		
	}

}
