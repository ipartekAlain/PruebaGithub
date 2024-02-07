package com.ipartek.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ipartek.model.Viaje;
import com.ipartek.repository.ViajeRepository;

@Controller
public class MainController {
	
	@Autowired ViajeRepository viaje_repo;
	@RequestMapping("/")
	public String cargarInicio(Model model) {
		
		List<Viaje> lista_viajes = viaje_repo.findAll();
		System.out.println("VIAJES: " + lista_viajes);
		
		model.addAttribute("atr_lista_viajes", lista_viajes);
		
		return "home";
	}

}
