package br.com.itecbrazil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.itecbrazil.mapper.ClienteMapper;
import br.com.itecbrazil.model.Cliente;

@RestController
@RequestMapping("/editarClientes")
public class EditarClientesController {
	
	@Autowired
	private ClienteMapper cm;
	
	public EditarClientesController(ClienteMapper cm) {
		this.cm = cm;
	}

		@GetMapping ( value = "{id}/{nome}" )
		public String editarClientes( @PathVariable (value = "id") Integer id, 
				@PathVariable (value = "nome" ) String nome) {
			Cliente update = new Cliente();
			update.setNome(nome);
			update.setId(id);
			cm.updateCliente(update);
			return "O novo nome do cliente selecionado agora é: "+nome;
		}

}
