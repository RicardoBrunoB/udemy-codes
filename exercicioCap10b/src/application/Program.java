package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.println("How many employees will be registered: ");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			
			System.out.println("Employee #" + (i+1) + ", ");
			System.out.println("ID: ");
			Integer id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.println("ID already taken. Try again: ");
				id = sc.nextInt();
			}

			System.out.println("Name: ");
			sc.nextLine();
			String nome = sc.nextLine();
						
			System.out.println("Salary: ");
			Double salario = sc.nextDouble();
			list.add(new Employee(id, nome, salario));
		}
		
		System.out.println("Enter the employee ID that will have salary increase: ");
		int id = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.println("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.addSalary(percentage);
		}		
		
		System.out.println();
		System.out.println("List of employees: ");
		for (Employee obj : list) {
			System.out.println(obj);
		}
		sc.close();
	}
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
