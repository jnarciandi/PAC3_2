package com.medAdmin.PAC3_2;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedService {
	
	@Autowired
	MedRepository repository;
	
	public Iterable<Medicament> findAll() {
		
		return repository.findAll();
	}
	
	public void insertMed(Medicament med) {
		
		repository.save(med);
	}
	
	public void deleteMed(Medicament med) {
		
		repository.delete(med);
	}
	
	
	  public void addMed(Medicament medic) {
		  
	  Optional <Medicament> medO=repository.findById(medic.getMedicamentID());
	  Medicament med= medO.get();
	  med.setStockQuantity(med.getStockQuantity()+1);
	  
	  repository.save(med);
	  }
	  public void soldMed(Medicament medic) {
		  
		  Optional <Medicament> medO=repository.findById(medic.getMedicamentID());
		  Medicament med= medO.get();
		  if (med.getStockQuantity() > 0) {
		  med.setStockQuantity(med.getStockQuantity()-1);
		  }else {
			  med.setStockQuantity(0);
		  }
		  
		  repository.save(med);
		  }
	 
	  

}
