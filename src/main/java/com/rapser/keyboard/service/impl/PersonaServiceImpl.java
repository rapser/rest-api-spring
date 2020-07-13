package com.rapser.keyboard.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.rapser.keyboard.commons.GenericServiceImpl;
import com.rapser.keyboard.dao.api.PersonaDaoAPI;
import com.rapser.keyboard.model.Persona;
import com.rapser.keyboard.service.api.PersonaServiceAPI;

@Service
public class PersonaServiceImpl extends GenericServiceImpl<Persona, Long> implements PersonaServiceAPI {

	@Autowired
	private PersonaDaoAPI personaDaoAPI;
	
	@Override
	public CrudRepository<Persona, Long> getDao() {
		return personaDaoAPI;
	}

}


