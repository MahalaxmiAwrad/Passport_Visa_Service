package com.capg.Controller;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.Model.Passportfees;
import com.capg.Service.PassportfeesService;


@RestController
@RequestMapping("/Passportfees")
public class PassportfeesController {
	@Autowired
	PassportfeesService service;
	
	@PostMapping("/addPassportfees")
	
	public ResponseEntity <Passportfees> addPassportfees(@Validated @RequestBody Passportfees passprtfees){
		
		Passportfees ps=service.addPassportfees(passprtfees);
		return new ResponseEntity<Passportfees>(ps,HttpStatus.OK);
		
		
	
		
	}
		
		
	}
	
	
	

	


