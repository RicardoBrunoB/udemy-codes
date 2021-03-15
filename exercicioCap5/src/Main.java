import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		java.util.Scanner sc = new Scanner(System.in);
		double renda = sc.nextDouble();
		double ir;
			if (renda >= 0.00 && renda <= 2000.00){
				System.out.println("ISENTO");
				}
			else {
				if (renda >= 2000.01 && renda <= 3000.00){
					ir = renda * 0.08;
					System.out.println("R$ " + ir);
					}
			else {
				if (renda >= 3000.01 && renda <= 4500.00){
					ir = 1000.00 * 0.08 + 2.00 * 0.18;
					System.out.println("R$ " + ir);
					}
			else {
				if (renda > 4500.00){
					ir = renda * 0.28;
					System.out.println("R$ " + ir);
					}
		sc.close();
					}
				}
			}
	}
}