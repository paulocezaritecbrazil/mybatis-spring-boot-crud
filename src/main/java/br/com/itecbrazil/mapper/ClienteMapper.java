package br.com.itecbrazil.mapper;

import java.util.List;

import br.com.itecbrazil.model.Cliente;

public interface ClienteMapper {
     
	void insertCliente(Cliente insert);
	
	List<Cliente> readClientes();
	
	void updateCliente(Cliente update);
	
	void deleteCliente(Cliente delete);
	
}
