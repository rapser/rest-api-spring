package com.rapser.keyboard.dao.api;

import org.springframework.data.repository.CrudRepository;
import com.rapser.keyboard.model.Persona;

public interface PersonaDaoAPI extends CrudRepository<Persona, Long> {

}
