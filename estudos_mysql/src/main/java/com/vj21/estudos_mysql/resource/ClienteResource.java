package com.vj21.estudos_mysql.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClienteResource {
	@GetMapping("/{id_cliente}")
	public String listar(@PathVariable("id_cliente") int id) {
		return "Id: " + id;
	}
}
