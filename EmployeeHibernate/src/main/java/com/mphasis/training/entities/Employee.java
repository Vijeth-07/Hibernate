package com.mphasis.training.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eid;
	@Column(length = 10)
	private String ename;
	//@OneToOne(mappedBy = "employee", cascade=CascadeType.ALL)
	//@JoinTable(name="", joinColumns={@JoinColumn(name="",referencedColumnName="")},
	//inverseColumns={@JoinColumn(name="",referencedColumnName="")})
	
	private java.sql.Date doj;
	private double salary;
	private double bonus;
	
	@ManyToOne(cascade = CascadeType.ALL)
	//@OneToMany(mappedBy="employee")
	@JoinColumn(name="mgrno" )
	private Employee emp;
	
	
	
	
//	public int getMgrno() {
//		return mgrno;
//	}
//	public void setMgrno(int mgrno) {
//		this.mgrno = mgrno;
//	}
	@ManyToOne
	@JoinColumn(name="deptcode")
	private Department department;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="jcode")
	private Job job;
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public java.sql.Date getDoj() {
		return doj;
	}
	public void setDoj(java.sql.Date doj) {
		this.doj = doj;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public Employee getEmployee() {
		return emp;
	}
	public void setEmployee(Employee employee) {
		this.emp = employee;
	}
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
//	public int getId() {
//		return eid;
//	}
//	public void setId(int id) {
//		this.eid = id;
//	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}

}
