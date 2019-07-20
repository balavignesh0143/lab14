package com.cg.eis.ui;

import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeService;
import com.cg.eis.service.EmployeeServiceImpl;


public class Start 
{
static void showMenu() 
 {
	System.out.println("SERVICES AVAILABLE");
	System.out.println("-------------------");
	System.out.println("1.Get Employee Details\n2.Provide Insurance for Employee \n3.Show Details of Employee \n4.Exit\nEnter the Service Required -->");
 }
		@SuppressWarnings("resource")
		public static void main(String[] args) 
		{
			EmployeeService service= new EmployeeServiceImpl();
			while(true) {
				showMenu();
				Scanner scan=new Scanner(System.in);
				int x=scan.nextInt();
				switch(x) {
				case 1:
					Employee emp=new Employee();
					System.out.println("Enter the Employee ID -->");
					emp.setId(scan.nextInt());
					scan.nextLine();
					System.out.println("Enter the Employee Name -->");
					emp.setName(scan.next());
					System.out.println("Enter the Salary -->");
					emp.setSalary(scan.nextDouble());
					System.out.println("Enter the Employee Designation -->");
					emp.setDesignation(scan.next());
					service.getDetails(emp);
					break;
				case 2:
					System.out.println("Enter the Employee ID -->");
					service.getInsurance(scan.next());
					break;
				case 3:
					System.out.println("Enter the Employee ID -->");
					Employee emp1=service.showDetails(scan.next());
					System.out.println("Details:\nName:"+emp1.getName()+"\nSalary:"+emp1.getSalary()+"\nDesignation:"+emp1.getDesignation()+"\nInsurance Scheme:"+emp1.getInsuranceScheme());
					break;
				case 4:
					System.out.println("Thanks for Using the Service");
					System.exit(0);
				default:
						break;
				}
			}
		}
	}
