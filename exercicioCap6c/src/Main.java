import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int fat = 1;
				
		for (int i=1; i <= N; i++) {
			if (N != 0) {
				fat = fat * i;
			}
			else {
				System.out.println("1");
			}
			sc.close();
		}
		System.out.println(fat);
	}

}		