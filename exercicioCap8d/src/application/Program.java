package application;

import java.util.Scanner;
import java.util.Locale;
import entities.CurrencyConverter;

public class Program {
		
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price: ");
		double price = sc.nextDouble();
		System.out.println("How many dollar will be bought: ");
		double buyDollar = sc.nextDouble();
		double total = price * buyDollar;
		
		double f = CurrencyConverter.valorFinal(total);
		
		System.out.printf("Amount to be paid in reais = %.2f%n", f);
		
		
		sc.close();
	}

}
