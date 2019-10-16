package com.mycompany.hibernate_inheritance_joined.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@Table(name = "regular_employee")
@EqualsAndHashCode(callSuper = false)
@PrimaryKeyJoinColumn(name = "ID")
public class RegularEmployee extends Employee {

	@Column(name = "salary")
	private float salary;
	@Column(name = "bonus")
	private int bonus;

	public RegularEmployee(String name, float salary, int bonus) {
		super(name);
		this.salary = salary;
		this.bonus = bonus;
	}
}
