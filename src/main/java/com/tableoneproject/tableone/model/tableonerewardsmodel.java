package com.tableoneproject.tableone.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="rewards")
public class tableonerewardsmodel {
	
	private int id;
	private int rewardsid;
	private String rewardsname;
	private String description;
	
	@Id @Column(name="id", nullable=false)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="rewardsid", nullable=false)
	public int getRewardsid() {
		return rewardsid;
	}
	public void setRewardsid(int rewardsid) {
		this.rewardsid = rewardsid;
	}
	 @Column(name="rewardsname", nullable=false)
	public String getRewardsname() {
		return rewardsname;
	}
	public void setRewardsname(String rewardsname) {
		this.rewardsname = rewardsname;
	}
	 @Column(name="description", nullable=false)
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public tableonerewardsmodel(int id, int rewardsid, String rewardsname, String description) {
		super();
		this.id = id;
		this.rewardsid = rewardsid;
		this.rewardsname = rewardsname;
		this.description = description;
	}
	public tableonerewardsmodel() {
		
	}
	@Override
	public String toString() {
		return "tableonerewardsmodel [id=" + id + ", rewardsid=" + rewardsid + ", rewardsname=" + rewardsname
				+ ", description=" + description + "]";
	}
	
	
	
	
	

}
