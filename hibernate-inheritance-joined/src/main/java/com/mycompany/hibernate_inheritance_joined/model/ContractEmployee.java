package com.mycompany.hibernate_inheritance_joined.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "contract_employee")
@PrimaryKeyJoinColumn(name = "ID")
public class ContractEmployee extends Employee {
	@Column(name = "payPerHour")
	private int payPerHour;

	@Column(name = "contract_duration")
	private String contract_duration;

	public ContractEmployee(String name, int payPerHour, String contract_duration) {
		super(name);
		this.payPerHour = payPerHour;
		this.contract_duration = contract_duration;
	}

}
