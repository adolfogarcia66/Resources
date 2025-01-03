package com.example.demo.restController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/demo")
public class DemoController {
	
	@GetMapping("getname")
	public String getname(@RequestParam String name){
		return "!Hola " + name+" , Bienvenido!";
	}
	@GetMapping("gettabla")
	public String tablamultiplicar(@RequestParam Integer num) {
	    StringBuilder sb = new StringBuilder();
	    System.out.println("La tabla de multiplicar del nùmero " + num + ":");
	    sb.append("La tabla de multiplicar del nùmero " + num + ":");
	    for (int i = 1; i <= 10; i++) {
	        System.out.println("Nùmero " + num + " * " + i + "=" + (num * i));
	        sb.append("Nùmero " + num + " * " + i + "=" + (num * i) + "\n");  // Corrección aquí
	    }
	    return sb.toString();
	}

}
