package com.cg.eis.dao;

import com.cg.eis.bean.Employee;

public interface EmployeeDao
{
		public void getDetails(Employee emp);
		public Employee showDetails(String id);
		void getInsurance(String id, String scheme);
}