package com.pp.week4.Rest;

import java.util.List;

public interface PrescriptionServiceInterface {
	
	List<Prescription> findAllPrescription();
	void addPrescription(Prescription pscript);
	void updatePrescription(Prescription pscript);

}
