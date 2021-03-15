package exercicioCap6;

import java.util.Scanner;

public class Novo {
	public static void Main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(); 
		while (x != 2002){
			System.out.println("Senha Invalida!");
			sc.close();
		}
		System.out.println("Acesso Permitido");
	}
}