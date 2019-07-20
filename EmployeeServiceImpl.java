package com.cg.eis.service;

import com.cg.eis.bean.Employee;
import com.cg.eis.dao.EmployeeDao;
import com.cg.eis.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService
{
	EmployeeDao dao=new EmployeeDaoImpl();
	@Override
	public void getDetails(Employee emp) 
	{
	dao.getDetails(emp);
	}
    @Override
	 public void getInsurance(String id) 
	  {
	    Employee emp=dao.showDetails(id);
	    String designation=emp.getDesignation();
		double salary=emp.getSalary();
		String scheme="No Scheme Available for the Employee";
		if((salary>5000 && salary<20000) && designation.equals("System_Associate")) 
		{
			scheme="Scheme C";
		}
		else if((salary>=20000 && salary<40000) && designation.equals("Programmer")) 
		{
			scheme="Scheme B";
		}
		else if(salary>=40000 && designation.equals("Manager")) 
		{
			scheme="Scheme A";
		}
		System.out.println("Eligibility of Insurance Scheme is Checked ");
		dao.getInsurance(id, scheme);
	}

	@Override
	public Employee showDetails(String id) 
	{
		
		return dao.showDetails(id);
	}

}