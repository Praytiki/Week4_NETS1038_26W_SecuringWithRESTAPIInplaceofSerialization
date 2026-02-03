package com.pp.week4.Rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 
 * @Pratik Patel
 * @Tuesday, February 3, 2026
 * 
 * 
 * Description - Here, we are defining the REST endpoints for the application. Using annotations, 
 * 				we allow tools like Postman to interact with our API. Each method maps a specific HTTP request (GET, POST, or PUT) 
 * 				to a service function, enabling users to find, add, and update records within the system.
 * 
 * 
 * 
 */




@RestController
@RequestMapping("/api")
public class RestControllerClass {
	
	@Autowired
    private MedicineServiceImpl medicineService;
	
	
	@Autowired
	private PrescriptionServiceImpl prescriptionService;
	
	
    @GetMapping("/")
    public String home() {
        return "Welcome to the Medicine and Prescription API!";
    }
    
    @GetMapping("/findallMed")
    public List<Medicine> findAllMedicine() {
        return medicineService.findAllMedicine();
    }
    
    
    @GetMapping("/findallPscript")
    public List<Prescription> findAllPrescription() {
        return prescriptionService.findAllPrescription();
    }
    
    
    
    
 
    
    @PostMapping("/addMed")
    public String addMedicine(@RequestBody Medicine med) {
        medicineService.addMedicine(med);
        return "We have recorded the medicine";
    }
    
    
    @PostMapping("/addPscript")
    public String addPrescription(@RequestBody Prescription pscript) {
    		prescriptionService.addPrescription(pscript);
        return "We have recorded the prescription";
    }
    
    
    
    
    
    
    
    
    
    
    
    
    @PutMapping("/updateMed")
    public String updateMedicine(@RequestBody Medicine med) {
    	
    		medicineService.updateMedicine(med);
    		return "Medicine updated successfully!";
    	
    	
    }
    
    
    
    
    
    @PutMapping("/updatePscript")
    public String updatePrescription(@RequestBody Prescription pscript) {
    	
    		prescriptionService.updatePrescription(pscript);
    		return "Prescription updated successfully!";
    	
    	
    }
    
    
    

}
