package com.medAdmin.PAC3_2;

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


}
