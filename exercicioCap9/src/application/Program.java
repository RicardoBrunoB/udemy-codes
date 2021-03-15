package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Customer;

public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Bem vindo ao sistema");
		System.out.print("Nome do titular: ");
		String name = sc.nextLine();

		System.out.print("Número da conta: ");
		int nrConta = sc.nextInt();
		double depInicial;
		System.out.println("Haverá depósito inicial ::::");
		
		char d = sc.next().charAt(0);
		if (d == 'y') {
			System.out.print("Valor do depósito inicial: ");
			depInicial = sc.nextDouble();
		} else {
			depInicial = 0;
		}
		
		System.out.println();
		Customer customer = new Customer(name, nrConta, depInicial);

		System.out.println("Dados da conta: " + customer);
		System.out.println();

		System.out.print("Insira o valor do deposito: ");
		double deposito = sc.nextDouble();

		customer.addDeposito(deposito);
		System.out.println();
		System.out.println("Updated data: " + customer);
		System.out.println();
		System.out.print("Insira o valor do saque: ");
		
		double saque = sc.nextDouble();
		customer.removeSaque(saque);

		System.out.println();
		System.out.println("Updated data: " + customer);
		sc.close();
	}
}