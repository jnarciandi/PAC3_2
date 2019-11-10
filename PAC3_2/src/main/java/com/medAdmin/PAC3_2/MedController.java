package com.medAdmin.PAC3_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/medicaments")
public class MedController {
	
	@Autowired
	MedService service;
	
	@RequestMapping("/stock")
	public String showMeds (Model model) {
		model.addAttribute("stock", service.findAll());
		return "medicaments/stock.html";
		
	}
	
	@RequestMapping("/newMedicament")
	public String newMed() {
		return "medicaments/newMedicament.html";
	}
	
	@RequestMapping("/insertMed")
	public String insertMed (Medicament med, Model model) {
		
		service.insertMed(med);
		model.addAttribute("stock",service.findAll());
		
		return "medicaments/stock.html";	}
	




	@RequestMapping("/deleteMed")
	public String deleteMed(@RequestParam("medicamentid") int medicamentId, Model model) {
		
		Medicament med = new Medicament(medicamentId);
		
		service.deleteMed(med);
		model.addAttribute("stock",service.findAll());
		
		return "medicaments/stock.html";
	}


}
