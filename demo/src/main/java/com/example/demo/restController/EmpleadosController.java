package com.example.demo.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Empleados;
import com.example.demo.repository.EmpleadosRepository;

@RestController
@RequestMapping("api/empleados")
public class EmpleadosController {
	
	@Autowired
	EmpleadosRepository empleadosRepository; 

	@GetMapping("getempleados")
	public List<Empleados> getempleados(){
		return empleadosRepository.findAll();
	}
}
