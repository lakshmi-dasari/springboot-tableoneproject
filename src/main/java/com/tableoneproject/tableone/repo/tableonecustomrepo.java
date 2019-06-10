package com.tableoneproject.tableone.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.tableoneproject.tableone.model.tableoneloginmodel;
import com.tableoneproject.tableone.model.tableonemodel;

@Repository
public class tableonecustomrepo {
	
	@PersistenceContext
	private EntityManager emang;
	
	public List<tableonemodel> getCustomerById(int idvariable) {
		
		Query q = emang.createNativeQuery("select *from public.customers where id = :idvar");
				
				q.setParameter("idvar",idvariable);
				List<tableonemodel>output = q.getResultList();
		return output;
	}
	
	public List<tableoneloginmodel> getpasswordbyusername(String unamevariable){
		Query q= emang.createNativeQuery("select *from public.login where username=:variablename");
		q.setParameter("variablename", unamevariable);
		List<tableoneloginmodel> result = q.getResultList();
		return result;
	}

}
