package com.bolsadeideas.backend.apirest.models.services;

import java.util.List;

import com.bolsadeideas.backend.apirest.models.entity.Cliente;

public interface IClienteService {
	
	public List<Cliente> findAll();

}
