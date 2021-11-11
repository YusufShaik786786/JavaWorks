package com.cg.eis.service;

import java.util.Scanner;

import com.cg.eis.bean.Employee;

public class ServicesOffered implements EmployeeService {

	Scanner scan = new Scanner(System.in);

	public void employeeDetails(Employee e) {
		System.out.println("Enter Id::");
		e.id = scan.nextLine();
		System.out.println("Enter name::");
		e.name = scan.nextLine();
		System.out.println("Enter salary::");
		e.salary = scan.nextDouble();
		System.out.println("Enter dsignation::");
		e.designation = scan.nextLine();
	}

	public void display(Employee e) {
		System.out.println("The id of the employee is " + e.id);
		System.out.println("The name of the employee is " + e.name);
		System.out.println("The salary of the employee is " + e.salary);
		System.out.println("The designation of the employee is " + e.designation);
		System.out.println("The Scheme of the employee is " + e.insuranceScheme);
	}

	public void insuranceScheme(Employee e) {
		e.insuranceScheme = "No scheme";
		if ((e.salary >=20000 && e.salary <= 100000) && (e.designation.equals("engineer")
				|| e.designation.equals("manager") || e.designation.equals("HR"))) {
			e.insuranceScheme = "Scheme 3";
		} else if ((e.salary >100000 && e.salary <= 400000) && (e.designation.equals("engineer")
				|| e.designation.equals("manager") || e.designation.equals("HR"))) {
			e.insuranceScheme = "Scheme 2";
		} else if ((e.salary > 400000 && e.salary <= 900000) && (e.designation.equals("engineer")
				|| e.designation.equals("manager") || e.designation.equals("HR"))) {
			e.insuranceScheme = "Scheme 1";
		} else {
			e.insuranceScheme = " No Scheme Offered ";
		}
	}

}
