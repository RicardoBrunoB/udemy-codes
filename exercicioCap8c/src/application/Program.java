package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		Aluno aluno = new Aluno();
		
		System.out.println("Nome: ");
		aluno.name = sc.nextLine();
		System.out.println("Nota 1: ");
		aluno.nota1 = sc.nextDouble();
		System.out.println("Nota 2: ");
		aluno.nota2 = sc.nextDouble();
		System.out.println("Nota 3: ");
		aluno.nota3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n", aluno.nf());
		
		if (aluno.nf() < 60.00) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", aluno.missing());
		}
		else {
			System.out.println("PASS");
		}

		
		sc.close();
	}

}
