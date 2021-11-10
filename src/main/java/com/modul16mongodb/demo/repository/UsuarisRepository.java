package com.modul16mongodb.demo.repository;

import java.util.List;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.modul16mongodb.demo.model.Usuari;

public interface UsuarisRepository extends MongoRepository<Usuari, Integer>{


}
