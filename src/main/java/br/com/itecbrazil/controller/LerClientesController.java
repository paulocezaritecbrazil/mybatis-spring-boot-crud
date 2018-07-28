package br.com.itecbrazil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.itecbrazil.mapper.ClienteMapper;

@RestController
public class LerClientesController {
  
	@Autowired
	private ClienteMapper cm;
	
	public LerClientesController(ClienteMapper cm) {
	  this.cm = cm;
	}
	
	@RequestMapping("/lerClientes")
	public String lerClientes() {
		return "Clientes: " + cm.readClientes();
	}
}
