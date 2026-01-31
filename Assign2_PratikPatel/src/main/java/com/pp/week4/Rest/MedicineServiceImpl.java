package com.pp.week4.Rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;




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
		// TODO Auto-generated method stub
		
		return medicine;
	}

	@Override
	public void addMedicine(Medicine med) {
		// TODO Auto-generated method stub
		
		medicine.add(med);
		
	}

	@Override
	public void updateMedicine(Medicine med) {
		// TODO Auto-generated method stub
		for (int i = 0; i < medicine.size(); i++) {
			if(medicine.get(i).getId() == med.getId()) {
				medicine.set(i, med);
				return;
			}
		}
		
	}

}
