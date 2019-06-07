package com.tableoneproject.tableone.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tableoneproject.tableone.model.tableonemodel;

@Repository
public interface tableonerepo extends JpaRepository <tableonemodel,Long> {

}
