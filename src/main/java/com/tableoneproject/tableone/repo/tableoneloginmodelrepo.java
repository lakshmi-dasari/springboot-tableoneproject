package com.tableoneproject.tableone.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tableoneproject.tableone.model.tableoneloginmodel;
@Repository
public interface tableoneloginmodelrepo extends JpaRepository<tableoneloginmodel,Long> {

}
