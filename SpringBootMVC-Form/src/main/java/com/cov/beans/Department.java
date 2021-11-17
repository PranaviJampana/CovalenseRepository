package com.cov.beans;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity

public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int deptno;
	String name;
	@OneToMany(mappedBy = "department",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<Employee>employees;
	public Department() {
		
	}
	
	public Department(int deptno, String name) {
		super();
		this.deptno = deptno;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return deptno == other.deptno && Objects.equals(name, other.name);
	}
	
	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Department [deptno=" + deptno + ", name=" + name + "]";
	}

	
	
	
	

}
