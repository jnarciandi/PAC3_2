package com.medAdmin.PAC3_2;

import java.sql.Connection;
import java.sql.PreparedStatement;

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
	
	
	@RequestMapping("/addMed")
	public String addMed(@RequestParam("medicamentid") int medicamentId, Model model) {


			
			Medicament med = new Medicament(medicamentId);
			
			
			//med.setStockQuantity(med.getStockQuantity()+1);
			service.addMed(med);
			model.addAttribute("stock",service.findAll());
			
			return "medicaments/stock.html";



	}
	
	@RequestMapping("/soldMed")
	public String soldMed(@RequestParam("medicamentid") int medicamentId, Model model) {


			
			Medicament med = new Medicament(medicamentId);
			
			
			//med.setStockQuantity(med.getStockQuantity()+1);
			service.soldMed(med);
			model.addAttribute("stock",service.findAll());
			
			return "medicaments/stock.html";



	}
	
	/*
	 * public static void soldStock(int id) {
	 * 
	 * int status = 0; try { Connection connection = MedicamentDao.getConnection();
	 * PreparedStatement preparedStatment = connection
	 * .prepareStatement("update MEDICAMENT set stockQuantity=? where medicamentId=?"
	 * );
	 * 
	 * Medicament med=MedicamentDao.getMedicamentById(id);
	 * 
	 * preparedStatment.setInt(2, id); if (med.getStockQuantity() > 0) {
	 * preparedStatment.setString(1, String.valueOf(med.getStockQuantity()-1));
	 * }else { preparedStatment.setString(1, "0"); }
	 * 
	 * 
	 * status = preparedStatment.executeUpdate();
	 * 
	 * connection.close(); } catch (Exception ex) { ex.printStackTrace(); }
	 * 
	 * 
	 * }
	 */
}
