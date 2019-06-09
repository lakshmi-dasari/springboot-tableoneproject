package com.tableoneproject.tableone.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tableoneproject.tableone.model.tableonemodel;
import com.tableoneproject.tableone.repo.tableonerepo;

@RestController
@RequestMapping("/api/v1")
public class tableonecontroller {
	
	@Autowired
	private tableonerepo trepo;
	
	@CrossOrigin(origins = "*")
	@GetMapping("/getmethod")
	public List<tableonemodel> methodname(){
		return trepo.findAll();
	}

	@PostMapping("/postmethod")
	public tableonemodel methodname(@Valid @RequestBody tableonemodel tmodel) {
		return trepo.save(tmodel);
	}
	
}
