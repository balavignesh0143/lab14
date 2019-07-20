package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public interface EmployeeService 
{
	   public void getDetails(Employee emp);
		public Employee showDetails(String id);
		void getInsurance(String id);

}