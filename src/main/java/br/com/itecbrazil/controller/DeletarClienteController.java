package br.com.itecbrazil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.itecbrazil.mapper.ClienteMapper;
import br.com.itecbrazil.model.Cliente;

@RestController
@RequestMapping("/deletarClientes")
public class DeletarClienteController {

	@Autowired
	private ClienteMapper cm;

	public DeletarClienteController(ClienteMapper cm) {
		this.cm = cm;
	}

	@GetMapping(value = "/{id}")
	public String criarClientes(@PathVariable("id") Integer id) {
		Cliente delete = new Cliente();
		delete.setId(id);
		cm.deleteCliente(delete);
		return "Cliente deletado com sucesso";
	}
}