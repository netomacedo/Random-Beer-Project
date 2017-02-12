package com.donedeal.randombeer.controller;

import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.swing.ImageIcon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.donedeal.randombeer.model.Beer;
import com.donedeal.randombeer.service.BeerService;


@RestController
@RequestMapping(value="/beers")
public class BeerController {
	
	List<Beer> listBeer = new ArrayList<Beer>();
	Random random;
	Beer beer;
	
	@Autowired
	BeerService beerService;
	
	@CrossOrigin
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<Beer> get(){
		beer = new Beer();
		listBeer = beerService.get();
		
		//Random Beer
		random = new Random(); 
		beer = listBeer.get(random.nextInt(listBeer.size()));
		
		return ResponseEntity.status(HttpStatus.OK).body(beer);	
	}

}
