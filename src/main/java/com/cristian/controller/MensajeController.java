package com.cristian.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MensajeController {

	@GetMapping("mensaje")
	public String mostrarMensaje() {
		return "hola mundo";
	}
}
