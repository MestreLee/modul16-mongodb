package com.modul16mongodb.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.transaction.annotation.Transactional;

import com.modul16mongodb.demo.model.Tirada;

public interface TiradesRepository extends MongoRepository<Tirada,Integer>{

	List<Tirada> findByusuariid(int usuariID);

	@Transactional
	void deleteAllByusuariid(int usuariID);
	

}
