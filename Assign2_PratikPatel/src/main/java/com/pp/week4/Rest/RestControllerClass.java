package com.pp.week4.Rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestControllerClass {
	
	@Autowired
    private MedicineServiceImpl medicineService;
	
    @GetMapping("/")
    public String home() {
        return "Welcome to the Medicine API!";
    }
    
    @GetMapping("/findall")
    public List<Medicine> findAllMedicine() {
        return medicineService.findAllMedicine();
    }
    
    
    @PostMapping("/add")
    public String addMedicine(@RequestBody Medicine med) {
        medicineService.addMedicine(med);
        return "We have recorded the medicine";
    }
    
    
    @PutMapping("/update")
    public String updateMedicine(@RequestBody Medicine med) {
    	
    		medicineService.updateMedicine(med);
    		return "Medicine updated successfully!";
    	
    	
    }
    
    
    
    

}
