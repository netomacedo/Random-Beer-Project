package com.donedeal.randombeer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.donedeal.randombeer.model.Beer;
import com.donedeal.randombeer.repository.BeerRepository;

@Service
public class BeerService {
	
	@Autowired
	private BeerRepository beerRepository;
	
	public List<Beer> get(){
		return beerRepository.findAll();
		
	}
	

}
