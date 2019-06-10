package com.tableoneproject.tableone.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tableoneproject.tableone.model.tableoneloginmodel;
import com.tableoneproject.tableone.model.tableonemodel;
import com.tableoneproject.tableone.model.tableonerewardsmodel;
import com.tableoneproject.tableone.repo.tableonecustomrepo;
import com.tableoneproject.tableone.repo.tableoneloginmodelrepo;
import com.tableoneproject.tableone.repo.tableonerepo;
import com.tableoneproject.tableone.repo.tableonerewardsmodelrepo;

@RestController
@RequestMapping("/api/v1")
public class tableonecontroller {
	
	@Autowired
	private tableonerepo trepo;
		
	@Autowired
	private tableonecustomrepo tcrepo;
	
	@Autowired
	private tableoneloginmodelrepo tlogin;
	
	@Autowired
	private tableonerewardsmodelrepo trewards;
	
	
	@CrossOrigin(origins = "*")
	@GetMapping("/getmethod")
	public List<tableonemodel> methodname(){
		return trepo.findAll();
	}
	
	@GetMapping("/getcustomerbyid/{id}")
	public List<tableonemodel> getelementbyID(@PathVariable int id) {
		return tcrepo.getCustomerById(id);
	}

	@PostMapping("/postmethod")
	public tableonemodel methodname(@Valid @RequestBody tableonemodel tmodel) {
		return trepo.save(tmodel);
	}
	
	@PostMapping("/postmethodforlogin")
	public tableoneloginmodel getpasswordbyusername(@Valid @RequestBody tableoneloginmodel tlmodel) {
		return tlogin.save(tlmodel);
	}
	
	@GetMapping("/getmethodforrewards")
	public List<tableonerewardsmodel> metname() {
		return trewards.findAll();
	}
}

