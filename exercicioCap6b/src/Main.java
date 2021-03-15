import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int a = 0;
		int g = 0;
		int d = 0;
		while (x != 4) {	
			if (x == 1) {
				a = a + 1;
			}
			else if (x == 2) {
				g = g + 1;
			}
			else if (x == 3) {
				d = d + 1;
			}
			x = sc.nextInt();
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + a);
		System.out.println("Gasolina: " + g);
		System.out.println("Diesel: " + d);
		sc.close();
	}
}