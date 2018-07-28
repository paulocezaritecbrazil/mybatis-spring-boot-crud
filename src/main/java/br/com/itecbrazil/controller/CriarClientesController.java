package br.com.itecbrazil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.itecbrazil.mapper.ClienteMapper;
import br.com.itecbrazil.model.Cliente;

@RestController
@RequestMapping("/criarClientes")
public class CriarClientesController {
	
	@Autowired
	private ClienteMapper cm;
	
	public CriarClientesController(ClienteMapper cm) {
		this.cm = cm;
	}

		@GetMapping ( value = "/{nome}" )
		public String criarClientes( @PathVariable ( "nome" ) String nome ) {
			Cliente insert = new Cliente();
			insert.setNome(nome);
			cm.insertCliente(insert);
			return "Olá "+nome;
		}

}
