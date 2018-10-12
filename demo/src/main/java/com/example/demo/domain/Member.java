package com.example.demo.domain;

import java.io.Serializable;

import javax.persistence.Id;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Data
@Entity
public class Member implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2542136263242840044L;
	
	@Id
	@GeneratedValue
	Long id; 
	String name; 
	String username; 
	String remark; 
	
	public Member() {}
	
	public Member(String name, String username, String remark) {
		this.name = name; 
		this.username = username; 
		this.remark = remark; 
	}
	

}
