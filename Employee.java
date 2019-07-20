package com.cg.eis.bean;

public class Employee 
{
		public int id;
		public String name;
		public double salary;
		public String designation;
		public String insuranceScheme;
		public int getId()
		{
			return id;
		}
		public void setId(int i)
		{
			this.id = i;
		}
		public String getName()
		{
			return name;
		}
		public void setName(String name)
		{
			this.name = name;
		}
		public double getSalary() 
		{
			return salary;
		}
		public void setSalary(double salary)
		{
			this.salary = salary;
		}
		public String getDesignation() 
		{
			return designation;
		}
		public void setDesignation(String designation) 
		{
			this.designation = designation;
		}
		public String getInsuranceScheme() 
		{
			return insuranceScheme;
		}
		public void setInsuranceScheme(String insuranceScheme)
		{
			this.insuranceScheme = insuranceScheme;
		}
		

	}